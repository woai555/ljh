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
public class REmplGroup implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 1挂号组，2收费组，3限制医生预约，4限制院内预约，5限制加号，6限制京医通预约，7限制app预约
     */
    @TableId(value = "GROUP_CODE", type = IdType.AUTO)
    private String groupCode;

    private String groupName;

    private String operCode;

    private String payWay;


    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    @Override
    public String toString() {
        return "REmplGroup{" +
        "groupCode=" + groupCode +
        ", groupName=" + groupName +
        ", operCode=" + operCode +
        ", payWay=" + payWay +
        "}";
    }
}
