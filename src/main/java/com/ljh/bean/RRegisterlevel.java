package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号级别代码档(R_RegisterLevel)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRegisterlevel implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 级别代号
     */
    @TableId(value = "REGLEVL_CODE", type = IdType.AUTO)
    private String reglevlCode;

    /**
     * 级别名称
     */
    private String reglevlName;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 1主任2副主任3主治4住院5进修
     */
    private BigDecimal doctkind;


    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
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

    public BigDecimal getDoctkind() {
        return doctkind;
    }

    public void setDoctkind(BigDecimal doctkind) {
        this.doctkind = doctkind;
    }

    @Override
    public String toString() {
        return "RRegisterlevel{" +
        "reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", doctkind=" + doctkind +
        "}";
    }
}
