package com.ljh.bean;

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
public class JytTradeinfoLog implements Serializable {

    private static final long serialVersionUID=1L;

    private String tradeno;

    private String xmltext;

    private String flag;

    private LocalDateTime operDate;

    private String operCode;


    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getXmltext() {
        return xmltext;
    }

    public void setXmltext(String xmltext) {
        this.xmltext = xmltext;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    @Override
    public String toString() {
        return "JytTradeinfoLog{" +
        "tradeno=" + tradeno +
        ", xmltext=" + xmltext +
        ", flag=" + flag +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
