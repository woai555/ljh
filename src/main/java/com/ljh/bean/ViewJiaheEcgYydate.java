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
public class ViewJiaheEcgYydate implements Serializable {

    private static final long serialVersionUID=1L;

    private LocalDateTime yyDate;

    private String recipeNo;

    private BigDecimal sequenceNo;


    public LocalDateTime getYyDate() {
        return yyDate;
    }

    public void setYyDate(LocalDateTime yyDate) {
        this.yyDate = yyDate;
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo;
    }

    public BigDecimal getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(BigDecimal sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    @Override
    public String toString() {
        return "ViewJiaheEcgYydate{" +
        "yyDate=" + yyDate +
        ", recipeNo=" + recipeNo +
        ", sequenceNo=" + sequenceNo +
        "}";
    }
}
