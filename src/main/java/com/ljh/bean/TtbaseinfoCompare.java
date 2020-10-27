package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 天坛基本信息对照
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class TtbaseinfoCompare implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别编码
     */
    @TableId(value = "TYPE_CODE", type = IdType.AUTO)
    private String typeCode;

    /**
     * 住院常数编码
     */
    private Integer zyCode;

    /**
     * 门诊常数编码
     */
    private String mzCode;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Integer getZyCode() {
        return zyCode;
    }

    public void setZyCode(Integer zyCode) {
        this.zyCode = zyCode;
    }

    public String getMzCode() {
        return mzCode;
    }

    public void setMzCode(String mzCode) {
        this.mzCode = mzCode;
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
        return "TtbaseinfoCompare{" +
        "typeCode=" + typeCode +
        ", zyCode=" + zyCode +
        ", mzCode=" + mzCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
