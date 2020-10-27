package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * l	用户定义(UserINFO)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Userinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户编码
     */
    @TableId(value = "USERID", type = IdType.AUTO)
    private String userid;

    /**
     * 用户名称
     */
    private String username;

    private String usermenulevel;

    /**
     * 用户使用级别 000000 从左向右依次代表读，读的级别，写，写的级别，修改,修改的级别
     */
    private String useruselevel;

    /**
     * 用户权限
     */
    private String userpermission;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsermenulevel() {
        return usermenulevel;
    }

    public void setUsermenulevel(String usermenulevel) {
        this.usermenulevel = usermenulevel;
    }

    public String getUseruselevel() {
        return useruselevel;
    }

    public void setUseruselevel(String useruselevel) {
        this.useruselevel = useruselevel;
    }

    public String getUserpermission() {
        return userpermission;
    }

    public void setUserpermission(String userpermission) {
        this.userpermission = userpermission;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
        "userid=" + userid +
        ", username=" + username +
        ", usermenulevel=" + usermenulevel +
        ", useruselevel=" + useruselevel +
        ", userpermission=" + userpermission +
        "}";
    }
}
