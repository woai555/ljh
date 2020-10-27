package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_TREATITEM
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewTreatitem implements Serializable {

    private static final long serialVersionUID=1L;

    private String undrugCode;

    private String confirmFlag;

    private String feeCode;

    private String stopFlag;


    public String getUndrugCode() {
        return undrugCode;
    }

    public void setUndrugCode(String undrugCode) {
        this.undrugCode = undrugCode;
    }

    public String getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(String confirmFlag) {
        this.confirmFlag = confirmFlag;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(String stopFlag) {
        this.stopFlag = stopFlag;
    }

    @Override
    public String toString() {
        return "ViewTreatitem{" +
        "undrugCode=" + undrugCode +
        ", confirmFlag=" + confirmFlag +
        ", feeCode=" + feeCode +
        ", stopFlag=" + stopFlag +
        "}";
    }
}
