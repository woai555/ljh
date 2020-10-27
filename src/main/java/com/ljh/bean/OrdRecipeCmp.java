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
public class OrdRecipeCmp implements Serializable {

    private static final long serialVersionUID=1L;

    private String recipeNoDoct;

    private String recipeNoNew;

    private String operCode;

    private LocalDateTime operDate;


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

    @Override
    public String toString() {
        return "OrdRecipeCmp{" +
        "recipeNoDoct=" + recipeNoDoct +
        ", recipeNoNew=" + recipeNoNew +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
