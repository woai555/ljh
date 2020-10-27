package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 患者诊前自述（app写入）
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdAppPatnarrate implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private LocalDateTime regDate;

    /**
     * HIS系统订单号
     */
    @TableId(value = "HISREGNO", type = IdType.AUTO)
    private String hisregno;

    /**
     * 患者自述
     */
    private String desContent;

    private String seeNo;

    private String operCode;

    private LocalDateTime operDate;


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

    public String getHisregno() {
        return hisregno;
    }

    public void setHisregno(String hisregno) {
        this.hisregno = hisregno;
    }

    public String getDesContent() {
        return desContent;
    }

    public void setDesContent(String desContent) {
        this.desContent = desContent;
    }

    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "OrdAppPatnarrate{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", hisregno=" + hisregno +
        ", desContent=" + desContent +
        ", seeNo=" + seeNo +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
