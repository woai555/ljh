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
public class SpecialMedicationYytsset implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 是否是首次开药1是其它否
     */
    @TableId(value = "YNFIRST", type = IdType.AUTO)
    private Integer ynfirst;

    /**
     * 普通医保用药天数
     */
    private Integer ybGeneral;

    /**
     * 慢性病医保用药天数
     */
    private Integer ybSpecialdiag;

    /**
     * 自费用药天数
     */
    private Integer ownExpense;

    /**
     * 行动不便医保用药天数
     */
    private Integer ybDifficult;

    /**
     * 自费患者互联网医院用药天数
     */
    private Integer onlineExpense;


    public Integer getYnfirst() {
        return ynfirst;
    }

    public void setYnfirst(Integer ynfirst) {
        this.ynfirst = ynfirst;
    }

    public Integer getYbGeneral() {
        return ybGeneral;
    }

    public void setYbGeneral(Integer ybGeneral) {
        this.ybGeneral = ybGeneral;
    }

    public Integer getYbSpecialdiag() {
        return ybSpecialdiag;
    }

    public void setYbSpecialdiag(Integer ybSpecialdiag) {
        this.ybSpecialdiag = ybSpecialdiag;
    }

    public Integer getOwnExpense() {
        return ownExpense;
    }

    public void setOwnExpense(Integer ownExpense) {
        this.ownExpense = ownExpense;
    }

    public Integer getYbDifficult() {
        return ybDifficult;
    }

    public void setYbDifficult(Integer ybDifficult) {
        this.ybDifficult = ybDifficult;
    }

    public Integer getOnlineExpense() {
        return onlineExpense;
    }

    public void setOnlineExpense(Integer onlineExpense) {
        this.onlineExpense = onlineExpense;
    }

    @Override
    public String toString() {
        return "SpecialMedicationYytsset{" +
        "ynfirst=" + ynfirst +
        ", ybGeneral=" + ybGeneral +
        ", ybSpecialdiag=" + ybSpecialdiag +
        ", ownExpense=" + ownExpense +
        ", ybDifficult=" + ybDifficult +
        ", onlineExpense=" + onlineExpense +
        "}";
    }
}
