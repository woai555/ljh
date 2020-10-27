package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 患者用药限制设置
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdPatientLimitdrug implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 患者身份证号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 药品编码
     */
    private String drugCode;

    /**
     * 截止日期,包括当天
     */
    private LocalDateTime toDate;

    /**
     * 商品名
     */
    private String tradeName;

    /**
     * 规格
     */
    private String specs;

    /**
     * 项目登记1甲2乙1类3丙4乙2类
     */
    private String itemGrade;

    /**
     * 医保编码
     */
    private String ybid;

    /**
     * 社保卡号
     */
    private String mcardNo;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getItemGrade() {
        return itemGrade;
    }

    public void setItemGrade(String itemGrade) {
        this.itemGrade = itemGrade;
    }

    public String getYbid() {
        return ybid;
    }

    public void setYbid(String ybid) {
        this.ybid = ybid;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    @Override
    public String toString() {
        return "OrdPatientLimitdrug{" +
        "cardNo=" + cardNo +
        ", drugCode=" + drugCode +
        ", toDate=" + toDate +
        ", tradeName=" + tradeName +
        ", specs=" + specs +
        ", itemGrade=" + itemGrade +
        ", ybid=" + ybid +
        ", mcardNo=" + mcardNo +
        "}";
    }
}
