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
public class OrdHealthRecipe implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室
     */
    @TableId(value = "DEPT_CODE", type = IdType.AUTO)
    private String deptCode;

    /**
     * 处方名
     */
    private String recipeName;

    /**
     * 内容
     */
    private String recipeDetail;

    /**
     * 最后记录人
     */
    private String operCode;

    /**
     * 最后记录时间
     */
    private LocalDateTime operDate;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDetail() {
        return recipeDetail;
    }

    public void setRecipeDetail(String recipeDetail) {
        this.recipeDetail = recipeDetail;
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

    @Override
    public String toString() {
        return "OrdHealthRecipe{" +
        "deptCode=" + deptCode +
        ", recipeName=" + recipeName +
        ", recipeDetail=" + recipeDetail +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
