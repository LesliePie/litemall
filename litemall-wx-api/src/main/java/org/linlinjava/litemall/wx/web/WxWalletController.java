package org.linlinjava.litemall.wx.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/wx/wallet")
public class WxWalletController {
/*
    @Autowired
    private WeChatService weChatService;

    @PostMapping(value = "/recharge/{recharge}")
    public Object recharge(@LoginUser Integer userId, @PathVariable Long recharge, HttpServletRequest request){
        String url= weChatService.createOrder(userId, IpUtil.getIpAddr(request));
        return ResponseUtil.ok(url);
    }*/
}
