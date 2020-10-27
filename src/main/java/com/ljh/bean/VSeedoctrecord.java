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
public class VSeedoctrecord implements Serializable {

    private static final long serialVersionUID=1L;

    private String seeNo;

    private String diagCode;

    private String diagName;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    @Override
    public String toString() {
        return "VSeedoctrecord{" +
        "seeNo=" + seeNo +
        ", diagCode=" + diagCode +
        ", diagName=" + diagName +
        "}";
    }
}
