package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 部分退处方号vs诊间医令处方号
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdRecipedetailCmp implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "RECIPE_NO_DOCT", type = IdType.AUTO)
    private String recipeNoDoct;

    private String recipeNoNew;

    private String operCode;

    private LocalDateTime operDate;

    /**
     * 1药品2非药品
     */
    private String drugFlag;

    /**
     * 0无效1有效
     */
    private String validFlag;

    /**
     * 处方内序号
     */
    private Integer sequenceNo;


    public String getRecipeNoDoct() {
        return recipeNoDoct;
    }

    public void setRecipeNoDoct(String recipeNoDoct) {
        this.recipeNoDoct = recipeNoDoct;
    }

    public String getRecipeNoNew() {
        return recipeNoNew;
    }

    public void setRecipeNoNew(String recipeNoNew) {
        this.recipeNoNew = recipeNoNew;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getDrugFlag() {
        return drugFlag;
    }

    public void setDrugFlag(String drugFlag) {
        this.drugFlag = drugFlag;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    @Override
    public String toString() {
        return "OrdRecipedetailCmp{" +
        "recipeNoDoct=" + recipeNoDoct +
        ", recipeNoNew=" + recipeNoNew +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", drugFlag=" + drugFlag +
        ", validFlag=" + validFlag +
        ", sequenceNo=" + sequenceNo +
        "}";
    }
}
