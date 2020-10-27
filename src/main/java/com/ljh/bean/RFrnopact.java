package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医疗证号合同单位表R_FrnoPact
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RFrnopact implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 医疗证号
     */
    @TableId(value = "MCARD_NO", type = IdType.AUTO)
    private String mcardNo;

    /**
     * 合同号
     */
    private String pactCode;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员
     */
    private String operCode;


    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
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
        return "RFrnopact{" +
        "mcardNo=" + mcardNo +
        ", pactCode=" + pactCode +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
