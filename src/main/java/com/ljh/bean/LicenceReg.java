package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * licence_REG
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LicenceReg implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * LICENCE_CODE
     */
    @TableId(value = "LICENCE_CODE", type = IdType.AUTO)
    private String licenceCode;

    /**
     * REG_DATE
     */
    private LocalDateTime regDate;

    /**
     * REG_SERIAL
     */
    private Integer regSerial;


    public String getLicenceCode() {
        return licenceCode;
    }

    public void setLicenceCode(String licenceCode) {
        this.licenceCode = licenceCode;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public Integer getRegSerial() {
        return regSerial;
    }

    public void setRegSerial(Integer regSerial) {
        this.regSerial = regSerial;
    }

    @Override
    public String toString() {
        return "LicenceReg{" +
        "licenceCode=" + licenceCode +
        ", regDate=" + regDate +
        ", regSerial=" + regSerial +
        "}";
    }
}
