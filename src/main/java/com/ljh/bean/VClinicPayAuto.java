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
public class VClinicPayAuto implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private LocalDateTime regDate;

    private String seeNo;

    private LocalDateTime operDate;

    private String departmentid;

    private String departmentname;

    private String doctorid;

    private String doctorname;

    private BigDecimal ownCost;

    private BigDecimal totalpaycost;

    private Integer recipeType;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public BigDecimal getTotalpaycost() {
        return totalpaycost;
    }

    public void setTotalpaycost(BigDecimal totalpaycost) {
        this.totalpaycost = totalpaycost;
    }

    public Integer getRecipeType() {
        return recipeType;
    }

    public void setRecipeType(Integer recipeType) {
        this.recipeType = recipeType;
    }

    @Override
    public String toString() {
        return "VClinicPayAuto{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", seeNo=" + seeNo +
        ", operDate=" + operDate +
        ", departmentid=" + departmentid +
        ", departmentname=" + departmentname +
        ", doctorid=" + doctorid +
        ", doctorname=" + doctorname +
        ", ownCost=" + ownCost +
        ", totalpaycost=" + totalpaycost +
        ", recipeType=" + recipeType +
        "}";
    }
}
