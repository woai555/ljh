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
public class ViewJiaheMzFeebase implements Serializable {

    private static final long serialVersionUID=1L;

    private String feeCode;

    private String feeType;


    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzFeebase{" +
        "feeCode=" + feeCode +
        ", feeType=" + feeType +
        "}";
    }
}
