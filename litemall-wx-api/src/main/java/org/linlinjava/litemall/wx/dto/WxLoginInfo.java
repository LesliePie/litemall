package org.linlinjava.litemall.wx.dto;

public class WxLoginInfo {
    private String code;
    private UserInfo userInfo;
    private String recommendPhone;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public String getRecommendPhone() {
        return recommendPhone;
    }

    public void setRecommendPhone(String recommendPhone) {
        this.recommendPhone = recommendPhone;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
