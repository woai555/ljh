package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 预约挂号类别
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientinfoGhBooktype implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 预约类别编码
     */
    @TableId(value = "BOOK_TYPE", type = IdType.AUTO)
    private BigDecimal bookType;

    /**
     * 预约类别名称
     */
    private String bookTypeName;

    /**
     * 序号
     */
    private BigDecimal orderid;

    /**
     * 有效标记：1有效；0无效
     */
    private BigDecimal ifvalid;

    /**
     * 医管局预约方式
     */
    private String ygjBooktype;

    /**
     * 京医通二期预约渠道字典代码
     */
    private String bookTypeJyt;


    public BigDecimal getBookType() {
        return bookType;
    }

    public void setBookType(BigDecimal bookType) {
        this.bookType = bookType;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getIfvalid() {
        return ifvalid;
    }

    public void setIfvalid(BigDecimal ifvalid) {
        this.ifvalid = ifvalid;
    }

    public String getYgjBooktype() {
        return ygjBooktype;
    }

    public void setYgjBooktype(String ygjBooktype) {
        this.ygjBooktype = ygjBooktype;
    }

    public String getBookTypeJyt() {
        return bookTypeJyt;
    }

    public void setBookTypeJyt(String bookTypeJyt) {
        this.bookTypeJyt = bookTypeJyt;
    }

    @Override
    public String toString() {
        return "RPatientinfoGhBooktype{" +
        "bookType=" + bookType +
        ", bookTypeName=" + bookTypeName +
        ", orderid=" + orderid +
        ", ifvalid=" + ifvalid +
        ", ygjBooktype=" + ygjBooktype +
        ", bookTypeJyt=" + bookTypeJyt +
        "}";
    }
}
