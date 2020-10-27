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
public class MrmsbaseMrm implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientNo;

    private String houseDocCode;

    private String chargeDocCode;

    private String chiefDocCode;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getHouseDocCode() {
        return houseDocCode;
    }

    public void setHouseDocCode(String houseDocCode) {
        this.houseDocCode = houseDocCode;
    }

    public String getChargeDocCode() {
        return chargeDocCode;
    }

    public void setChargeDocCode(String chargeDocCode) {
        this.chargeDocCode = chargeDocCode;
    }

    public String getChiefDocCode() {
        return chiefDocCode;
    }

    public void setChiefDocCode(String chiefDocCode) {
        this.chiefDocCode = chiefDocCode;
    }

    @Override
    public String toString() {
        return "MrmsbaseMrm{" +
        "inpatientNo=" + inpatientNo +
        ", houseDocCode=" + houseDocCode +
        ", chargeDocCode=" + chargeDocCode +
        ", chiefDocCode=" + chiefDocCode +
        "}";
    }
}
