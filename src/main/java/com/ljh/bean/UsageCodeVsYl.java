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
public class UsageCodeVsYl implements Serializable {

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
     * 医联码用法代码
     */
    private String usageYlCode;

    /**
     * 医联码用法名称
     */
    private String useYlName;


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

    public String getUsageYlCode() {
        return usageYlCode;
    }

    public void setUsageYlCode(String usageYlCode) {
        this.usageYlCode = usageYlCode;
    }

    public String getUseYlName() {
        return useYlName;
    }

    public void setUseYlName(String useYlName) {
        this.useYlName = useYlName;
    }

    @Override
    public String toString() {
        return "UsageCodeVsYl{" +
        "usageCode=" + usageCode +
        ", useName=" + useName +
        ", englishAb=" + englishAb +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", usageYlCode=" + usageYlCode +
        ", useYlName=" + useYlName +
        "}";
    }
}
