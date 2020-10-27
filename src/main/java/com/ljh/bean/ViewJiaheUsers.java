package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewJiaheUsers implements Serializable {

    private static final long serialVersionUID=1L;

    private String userId;

    private String userName;

    private String buse;

    private String userLoginName;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBuse() {
        return buse;
    }

    public void setBuse(String buse) {
        this.buse = buse;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    @Override
    public String toString() {
        return "ViewJiaheUsers{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", buse=" + buse +
        ", userLoginName=" + userLoginName +
        "}";
    }
}
