package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 配药单分类资料档NEW
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpdqutd implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 药单分类代码
     */
    @TableId(value = "QUE_CODE", type = IdType.AUTO)
    private String queCode;

    /**
     * 医嘱类别代码:ipmoodtp
     */
    private String moType;

    /**
     * 用法代码:usage_code
     */
    private String usageCode;

    /**
     * 药品类别:1西药、2中成药、3中草药,Dd_constant,sort_code='3
     */
    private String drugType;

    /**
     * 剂型代码:Dd_constant,sort_code='3
     */
    private String doseModelCode;

    /**
     * 剂型名称
     */
    private String doseModelName;

    /**
     * 1长期/2临时/3全部
     */
    private String decmpsState;


    public String getQueCode() {
        return queCode;
    }

    public void setQueCode(String queCode) {
        this.queCode = queCode;
    }

    public String getMoType() {
        return moType;
    }

    public void setMoType(String moType) {
        this.moType = moType;
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    public String getDoseModelCode() {
        return doseModelCode;
    }

    public void setDoseModelCode(String doseModelCode) {
        this.doseModelCode = doseModelCode;
    }

    public String getDoseModelName() {
        return doseModelName;
    }

    public void setDoseModelName(String doseModelName) {
        this.doseModelName = doseModelName;
    }

    public String getDecmpsState() {
        return decmpsState;
    }

    public void setDecmpsState(String decmpsState) {
        this.decmpsState = decmpsState;
    }

    @Override
    public String toString() {
        return "Mdpdqutd{" +
        "queCode=" + queCode +
        ", moType=" + moType +
        ", usageCode=" + usageCode +
        ", drugType=" + drugType +
        ", doseModelCode=" + doseModelCode +
        ", doseModelName=" + doseModelName +
        ", decmpsState=" + decmpsState +
        "}";
    }
}
