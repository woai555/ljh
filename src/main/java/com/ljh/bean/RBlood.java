package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 血型代码表R_BLOOD
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RBlood implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 血型编码
     */
    @TableId(value = "BLOOD_CODE", type = IdType.AUTO)
    private String bloodCode;

    /**
     * 血型名称
     */
    private String blood;

    /**
     * 最近修改日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;

    private String barCode;


    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "RBlood{" +
        "bloodCode=" + bloodCode +
        ", blood=" + blood +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", barCode=" + barCode +
        "}";
    }
}
