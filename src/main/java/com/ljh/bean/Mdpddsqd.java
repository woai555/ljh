package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 配药队列资料档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpddsqd implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 配药队列代码
     */
    private Integer queCode;

    /**
     * 队列名称
     */
    private String queName;

    /**
     * 护士站代码
     */
    private String nsstCode;

    /**
     * 护士站名称
     */
    private String nsstName;

    /**
     * 医嘱类别代码
     */
    private String motpCode;

    /**
     * 医嘱类别名称
     */
    private String motpName;

    /**
     * 药品类别代码
     */
    private String drugTypecd;

    /**
     * 药品类别名称
     */
    private String drugTypenm;

    /**
     * 剂型代码
     */
    private String typeCode;

    /**
     * 剂型拼音码
     */
    private String typeSpell;

    /**
     * 剂型名称
     */
    private String typeName;

    /**
     * 配药单打印
     */
    private String prnType;

    /**
     * 拆分最小单位
     */
    private String unitType;

    /**
     * 打印类别
     */
    private String prnKind;


    public Integer getQueCode() {
        return queCode;
    }

    public void setQueCode(Integer queCode) {
        this.queCode = queCode;
    }

    public String getQueName() {
        return queName;
    }

    public void setQueName(String queName) {
        this.queName = queName;
    }

    public String getNsstCode() {
        return nsstCode;
    }

    public void setNsstCode(String nsstCode) {
        this.nsstCode = nsstCode;
    }

    public String getNsstName() {
        return nsstName;
    }

    public void setNsstName(String nsstName) {
        this.nsstName = nsstName;
    }

    public String getMotpCode() {
        return motpCode;
    }

    public void setMotpCode(String motpCode) {
        this.motpCode = motpCode;
    }

    public String getMotpName() {
        return motpName;
    }

    public void setMotpName(String motpName) {
        this.motpName = motpName;
    }

    public String getDrugTypecd() {
        return drugTypecd;
    }

    public void setDrugTypecd(String drugTypecd) {
        this.drugTypecd = drugTypecd;
    }

    public String getDrugTypenm() {
        return drugTypenm;
    }

    public void setDrugTypenm(String drugTypenm) {
        this.drugTypenm = drugTypenm;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeSpell() {
        return typeSpell;
    }

    public void setTypeSpell(String typeSpell) {
        this.typeSpell = typeSpell;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPrnType() {
        return prnType;
    }

    public void setPrnType(String prnType) {
        this.prnType = prnType;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getPrnKind() {
        return prnKind;
    }

    public void setPrnKind(String prnKind) {
        this.prnKind = prnKind;
    }

    @Override
    public String toString() {
        return "Mdpddsqd{" +
        "queCode=" + queCode +
        ", queName=" + queName +
        ", nsstCode=" + nsstCode +
        ", nsstName=" + nsstName +
        ", motpCode=" + motpCode +
        ", motpName=" + motpName +
        ", drugTypecd=" + drugTypecd +
        ", drugTypenm=" + drugTypenm +
        ", typeCode=" + typeCode +
        ", typeSpell=" + typeSpell +
        ", typeName=" + typeName +
        ", prnType=" + prnType +
        ", unitType=" + unitType +
        ", prnKind=" + prnKind +
        "}";
    }
}
