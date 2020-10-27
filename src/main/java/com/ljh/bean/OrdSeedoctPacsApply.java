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
public class OrdSeedoctPacsApply implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "RECIPE_NO", type = IdType.AUTO)
    private String recipeNo;

    private Long status;


    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrdSeedoctPacsApply{" +
        "recipeNo=" + recipeNo +
        ", status=" + status +
        "}";
    }
}
