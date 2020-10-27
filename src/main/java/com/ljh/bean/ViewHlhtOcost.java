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
public class ViewHlhtOcost implements Serializable {

    private static final long serialVersionUID=1L;

    private String outpatientId;

    private String outpatientFee;

    private String inpatientId;

    private String operateType;


    public String getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(String outpatientId) {
        this.outpatientId = outpatientId;
    }

    public String getOutpatientFee() {
        return outpatientFee;
    }

    public void setOutpatientFee(String outpatientFee) {
        this.outpatientFee = outpatientFee;
    }

    public String getInpatientId() {
        return inpatientId;
    }

    public void setInpatientId(String inpatientId) {
        this.inpatientId = inpatientId;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    @Override
    public String toString() {
        return "ViewHlhtOcost{" +
        "outpatientId=" + outpatientId +
        ", outpatientFee=" + outpatientFee +
        ", inpatientId=" + inpatientId +
        ", operateType=" + operateType +
        "}";
    }
}
