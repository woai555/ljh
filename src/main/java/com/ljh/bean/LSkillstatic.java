package com.ljh.bean;

import java.math.BigDecimal;
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
public class LSkillstatic implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "STATICDATE", type = IdType.AUTO)
    private LocalDateTime staticdate;

    private String checkdeptid;

    private String machinecode;

    private Integer cpatientnumber;

    private Integer cpatientpiece;

    private BigDecimal cpatientmoney;

    private BigDecimal cpublicmoney;

    private BigDecimal cselfmoney;

    private BigDecimal cspmoney;

    private Integer inpatientnumber;

    private Integer inpatientpiece;

    private BigDecimal inpatientmoney;

    private BigDecimal publicmoney;

    private BigDecimal selfmoney;

    private BigDecimal spmoney;


    public LocalDateTime getStaticdate() {
        return staticdate;
    }

    public void setStaticdate(LocalDateTime staticdate) {
        this.staticdate = staticdate;
    }

    public String getCheckdeptid() {
        return checkdeptid;
    }

    public void setCheckdeptid(String checkdeptid) {
        this.checkdeptid = checkdeptid;
    }

    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public Integer getCpatientnumber() {
        return cpatientnumber;
    }

    public void setCpatientnumber(Integer cpatientnumber) {
        this.cpatientnumber = cpatientnumber;
    }

    public Integer getCpatientpiece() {
        return cpatientpiece;
    }

    public void setCpatientpiece(Integer cpatientpiece) {
        this.cpatientpiece = cpatientpiece;
    }

    public BigDecimal getCpatientmoney() {
        return cpatientmoney;
    }

    public void setCpatientmoney(BigDecimal cpatientmoney) {
        this.cpatientmoney = cpatientmoney;
    }

    public BigDecimal getCpublicmoney() {
        return cpublicmoney;
    }

    public void setCpublicmoney(BigDecimal cpublicmoney) {
        this.cpublicmoney = cpublicmoney;
    }

    public BigDecimal getCselfmoney() {
        return cselfmoney;
    }

    public void setCselfmoney(BigDecimal cselfmoney) {
        this.cselfmoney = cselfmoney;
    }

    public BigDecimal getCspmoney() {
        return cspmoney;
    }

    public void setCspmoney(BigDecimal cspmoney) {
        this.cspmoney = cspmoney;
    }

    public Integer getInpatientnumber() {
        return inpatientnumber;
    }

    public void setInpatientnumber(Integer inpatientnumber) {
        this.inpatientnumber = inpatientnumber;
    }

    public Integer getInpatientpiece() {
        return inpatientpiece;
    }

    public void setInpatientpiece(Integer inpatientpiece) {
        this.inpatientpiece = inpatientpiece;
    }

    public BigDecimal getInpatientmoney() {
        return inpatientmoney;
    }

    public void setInpatientmoney(BigDecimal inpatientmoney) {
        this.inpatientmoney = inpatientmoney;
    }

    public BigDecimal getPublicmoney() {
        return publicmoney;
    }

    public void setPublicmoney(BigDecimal publicmoney) {
        this.publicmoney = publicmoney;
    }

    public BigDecimal getSelfmoney() {
        return selfmoney;
    }

    public void setSelfmoney(BigDecimal selfmoney) {
        this.selfmoney = selfmoney;
    }

    public BigDecimal getSpmoney() {
        return spmoney;
    }

    public void setSpmoney(BigDecimal spmoney) {
        this.spmoney = spmoney;
    }

    @Override
    public String toString() {
        return "LSkillstatic{" +
        "staticdate=" + staticdate +
        ", checkdeptid=" + checkdeptid +
        ", machinecode=" + machinecode +
        ", cpatientnumber=" + cpatientnumber +
        ", cpatientpiece=" + cpatientpiece +
        ", cpatientmoney=" + cpatientmoney +
        ", cpublicmoney=" + cpublicmoney +
        ", cselfmoney=" + cselfmoney +
        ", cspmoney=" + cspmoney +
        ", inpatientnumber=" + inpatientnumber +
        ", inpatientpiece=" + inpatientpiece +
        ", inpatientmoney=" + inpatientmoney +
        ", publicmoney=" + publicmoney +
        ", selfmoney=" + selfmoney +
        ", spmoney=" + spmoney +
        "}";
    }
}
