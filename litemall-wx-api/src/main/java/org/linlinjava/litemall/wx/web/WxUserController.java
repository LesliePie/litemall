package org.linlinjava.litemall.wx.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.db.dao.UserExtendMapper;
import org.linlinjava.litemall.db.domain.LitemallUser;
import org.linlinjava.litemall.db.service.LitemallOrderService;
import org.linlinjava.litemall.db.service.LitemallUserService;
import org.linlinjava.litemall.wx.annotation.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户服务
 */
@RestController
@RequestMapping("/wx/user")
@Validated
@Api(value = "用户相关接口")
public class WxUserController {
    private final Log logger = LogFactory.getLog(WxUserController.class);

    @Autowired
    private LitemallOrderService orderService;
    @Autowired
    private LitemallUserService userService;
    @Autowired
    private UserExtendMapper userExtendMapper;

    /**
     * 用户个人页面数据
     * <p>
     * 目前是用户订单统计信息
     *
     * @param userId 用户ID
     * @return 用户个人页面数据
     */
    @GetMapping("index")
    public Object list(@LoginUser Integer userId) {
        if (userId == null) {
            return ResponseUtil.unlogin();
        }

        Map<Object, Object> data = new HashMap<Object, Object>();
        data.put("order", orderService.orderInfo(userId));
        return ResponseUtil.ok(data);
    }
    @GetMapping(value = "/wallet")
    @ApiOperation(value = "获取钱包信息")
    public Object wallet(@LoginUser Integer userId){
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        Map<Object, Object> data = new HashMap<Object, Object>();
        data.put("wallet", userExtendMapper.selectByUserId(userId));
        return ResponseUtil.ok(data);
    }

    @GetMapping(value = "/myRecommend")
    @ApiOperation(value = "获取我得推荐url")
    public Object myRecommend(@LoginUser Integer userId){
        if (userId == null) {
            return ResponseUtil.unlogin();
        }
        LitemallUser info = userService.findById(userId);
        String mobile = info.getMobile();
        if (StringUtils.isEmpty(mobile)) {
            return ResponseUtil.fail(-1,"绑定手机号码后才能进行推荐");
        }
        String url="?recommendPhone="+mobile;
        return ResponseUtil.ok(url);
    }

}
