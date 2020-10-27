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
public class TestAa implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal id;

    private String name1;

    private BigDecimal qian;

    private BigDecimal qian1;

    private String no;

    private String idenno;

    private BigDecimal yp1;

    private BigDecimal yp2;

    private BigDecimal yp3;


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public BigDecimal getQian() {
        return qian;
    }

    public void setQian(BigDecimal qian) {
        this.qian = qian;
    }

    public BigDecimal getQian1() {
        return qian1;
    }

    public void setQian1(BigDecimal qian1) {
        this.qian1 = qian1;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public BigDecimal getYp1() {
        return yp1;
    }

    public void setYp1(BigDecimal yp1) {
        this.yp1 = yp1;
    }

    public BigDecimal getYp2() {
        return yp2;
    }

    public void setYp2(BigDecimal yp2) {
        this.yp2 = yp2;
    }

    public BigDecimal getYp3() {
        return yp3;
    }

    public void setYp3(BigDecimal yp3) {
        this.yp3 = yp3;
    }

    @Override
    public String toString() {
        return "TestAa{" +
        "id=" + id +
        ", name1=" + name1 +
        ", qian=" + qian +
        ", qian1=" + qian1 +
        ", no=" + no +
        ", idenno=" + idenno +
        ", yp1=" + yp1 +
        ", yp2=" + yp2 +
        ", yp3=" + yp3 +
        "}";
    }
}
