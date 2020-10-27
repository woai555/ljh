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
public class LanTest implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal prepayCost;


    public BigDecimal getPrepayCost() {
        return prepayCost;
    }

    public void setPrepayCost(BigDecimal prepayCost) {
        this.prepayCost = prepayCost;
    }

    @Override
    public String toString() {
        return "LanTest{" +
        "prepayCost=" + prepayCost +
        "}";
    }
}
