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
public class RGhBooktypeVsYlm implements Serializable {

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

    private BigDecimal bookTypeYlm;

    private String bookTypeNameYlm;


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

    public BigDecimal getBookTypeYlm() {
        return bookTypeYlm;
    }

    public void setBookTypeYlm(BigDecimal bookTypeYlm) {
        this.bookTypeYlm = bookTypeYlm;
    }

    public String getBookTypeNameYlm() {
        return bookTypeNameYlm;
    }

    public void setBookTypeNameYlm(String bookTypeNameYlm) {
        this.bookTypeNameYlm = bookTypeNameYlm;
    }

    @Override
    public String toString() {
        return "RGhBooktypeVsYlm{" +
        "bookType=" + bookType +
        ", bookTypeName=" + bookTypeName +
        ", bookTypeYlm=" + bookTypeYlm +
        ", bookTypeNameYlm=" + bookTypeNameYlm +
        "}";
    }
}
