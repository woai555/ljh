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
public class Jyt2MsgSendinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String address;

    private String xmltext;

    private String flag;

    private LocalDateTime operDate;

    private String operCode;

    private String emplCode;

    private LocalDateTime seeDate;

    private String cardNo;

    private LocalDateTime regDate;

    /**
     *  null:成功，3：不成功
     */
    private String tradestate;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getTradestate() {
        return tradestate;
    }

    public void setTradestate(String tradestate) {
        this.tradestate = tradestate;
    }

    @Override
    public String toString() {
        return "Jyt2MsgSendinfo{" +
        "address=" + address +
        ", xmltext=" + xmltext +
        ", flag=" + flag +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", emplCode=" + emplCode +
        ", seeDate=" + seeDate +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", tradestate=" + tradestate +
        "}";
    }
}
