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
public class ViewJhDzblUserDept implements Serializable {

    private static final long serialVersionUID=1L;

    private String userId;

    private String userDept;

    private String defaultDeptFlag;

    private String hospitalNo;

    private String state;

    private LocalDateTime syncTimeStamp;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public String getDefaultDeptFlag() {
        return defaultDeptFlag;
    }

    public void setDefaultDeptFlag(String defaultDeptFlag) {
        this.defaultDeptFlag = defaultDeptFlag;
    }

    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getSyncTimeStamp() {
        return syncTimeStamp;
    }

    public void setSyncTimeStamp(LocalDateTime syncTimeStamp) {
        this.syncTimeStamp = syncTimeStamp;
    }

    @Override
    public String toString() {
        return "ViewJhDzblUserDept{" +
        "userId=" + userId +
        ", userDept=" + userDept +
        ", defaultDeptFlag=" + defaultDeptFlag +
        ", hospitalNo=" + hospitalNo +
        ", state=" + state +
        ", syncTimeStamp=" + syncTimeStamp +
        "}";
    }
}
