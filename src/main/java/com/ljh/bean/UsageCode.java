package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用法代码档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UsageCode implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用法代码
     */
    @TableId(value = "USAGE_CODE", type = IdType.AUTO)
    private String usageCode;

    /**
     * 用法名称
     */
    private String useName;

    /**
     * 英文缩写
     */
    private String englishAb;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 电子病历共享工程编码
     */
    private String mrCode;

    /**
     * 电子病历共享工程名称
     */
    private String mrName;


    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getEnglishAb() {
        return englishAb;
    }

    public void setEnglishAb(String englishAb) {
        this.englishAb = englishAb;
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

    public String getMrCode() {
        return mrCode;
    }

    public void setMrCode(String mrCode) {
        this.mrCode = mrCode;
    }

    public String getMrName() {
        return mrName;
    }

    public void setMrName(String mrName) {
        this.mrName = mrName;
    }

    @Override
    public String toString() {
        return "UsageCode{" +
        "usageCode=" + usageCode +
        ", useName=" + useName +
        ", englishAb=" + englishAb +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", mrCode=" + mrCode +
        ", mrName=" + mrName +
        "}";
    }
}
