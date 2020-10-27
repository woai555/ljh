package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class OrdRecipecomment implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 看诊序号
     */
    @TableId(value = "SEE_NO", type = IdType.AUTO)
    private String seeNo;

    /**
     * 门诊卡号
     */
    private String cardNo;

    /**
     * 病人姓名
     */
    private String patientName;

    /**
     * 看诊医生
     */
    private String seeDoctid;

    /**
     * 看诊医生
     */
    private String seeDoctnm;

    /**
     * 看诊时间
     */
    private LocalDateTime seeDate;

    /**
     * 点评意见
     */
    private String comRecipe;

    /**
     * 最后点评人
     */
    private String comOper;

    /**
     * 最后点评时间
     */
    private LocalDateTime comDate;

    /**
     * 患者类别
     */
    private String paykindCode;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSeeDoctid() {
        return seeDoctid;
    }

    public void setSeeDoctid(String seeDoctid) {
        this.seeDoctid = seeDoctid;
    }

    public String getSeeDoctnm() {
        return seeDoctnm;
    }

    public void setSeeDoctnm(String seeDoctnm) {
        this.seeDoctnm = seeDoctnm;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getComRecipe() {
        return comRecipe;
    }

    public void setComRecipe(String comRecipe) {
        this.comRecipe = comRecipe;
    }

    public String getComOper() {
        return comOper;
    }

    public void setComOper(String comOper) {
        this.comOper = comOper;
    }

    public LocalDateTime getComDate() {
        return comDate;
    }

    public void setComDate(LocalDateTime comDate) {
        this.comDate = comDate;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    @Override
    public String toString() {
        return "OrdRecipecomment{" +
        "seeNo=" + seeNo +
        ", cardNo=" + cardNo +
        ", patientName=" + patientName +
        ", seeDoctid=" + seeDoctid +
        ", seeDoctnm=" + seeDoctnm +
        ", seeDate=" + seeDate +
        ", comRecipe=" + comRecipe +
        ", comOper=" + comOper +
        ", comDate=" + comDate +
        ", paykindCode=" + paykindCode +
        "}";
    }
}
