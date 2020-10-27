package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class LWorkload implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "STATICDATE", type = IdType.AUTO)
    private LocalDateTime staticdate;

    private String userName;

    private String realName;

    private Integer workload;


    public LocalDateTime getStaticdate() {
        return staticdate;
    }

    public void setStaticdate(LocalDateTime staticdate) {
        this.staticdate = staticdate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "LWorkload{" +
        "staticdate=" + staticdate +
        ", userName=" + userName +
        ", realName=" + realName +
        ", workload=" + workload +
        "}";
    }
}
