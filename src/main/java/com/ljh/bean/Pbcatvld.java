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
public class Pbcatvld implements Serializable {

    private static final long serialVersionUID=1L;

    private String pbvName;

    private String pbvVald;

    private BigDecimal pbvType;

    private BigDecimal pbvCntr;

    private String pbvMsg;


    public String getPbvName() {
        return pbvName;
    }

    public void setPbvName(String pbvName) {
        this.pbvName = pbvName;
    }

    public String getPbvVald() {
        return pbvVald;
    }

    public void setPbvVald(String pbvVald) {
        this.pbvVald = pbvVald;
    }

    public BigDecimal getPbvType() {
        return pbvType;
    }

    public void setPbvType(BigDecimal pbvType) {
        this.pbvType = pbvType;
    }

    public BigDecimal getPbvCntr() {
        return pbvCntr;
    }

    public void setPbvCntr(BigDecimal pbvCntr) {
        this.pbvCntr = pbvCntr;
    }

    public String getPbvMsg() {
        return pbvMsg;
    }

    public void setPbvMsg(String pbvMsg) {
        this.pbvMsg = pbvMsg;
    }

    @Override
    public String toString() {
        return "Pbcatvld{" +
        "pbvName=" + pbvName +
        ", pbvVald=" + pbvVald +
        ", pbvType=" + pbvType +
        ", pbvCntr=" + pbvCntr +
        ", pbvMsg=" + pbvMsg +
        "}";
    }
}
