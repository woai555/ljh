package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewSickbed implements Serializable {

    private static final long serialVersionUID=1L;

    private String deptCode;

    private BigDecimal bedNum;

    private BigDecimal addbedNum;

    private BigDecimal usedbedNum;


    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public BigDecimal getBedNum() {
        return bedNum;
    }

    public void setBedNum(BigDecimal bedNum) {
        this.bedNum = bedNum;
    }

    public BigDecimal getAddbedNum() {
        return addbedNum;
    }

    public void setAddbedNum(BigDecimal addbedNum) {
        this.addbedNum = addbedNum;
    }

    public BigDecimal getUsedbedNum() {
        return usedbedNum;
    }

    public void setUsedbedNum(BigDecimal usedbedNum) {
        this.usedbedNum = usedbedNum;
    }

    @Override
    public String toString() {
        return "ViewSickbed{" +
        "deptCode=" + deptCode +
        ", bedNum=" + bedNum +
        ", addbedNum=" + addbedNum +
        ", usedbedNum=" + usedbedNum +
        "}";
    }
}
