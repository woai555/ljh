package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 使用方式代码档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UsageWay implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 使用方式编码
     */
    @TableId(value = "USE_WAY_CODE", type = IdType.AUTO)
    private String useWayCode;

    /**
     * 使用方式名称
     */
    private String useWayName;

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


    public String getUseWayCode() {
        return useWayCode;
    }

    public void setUseWayCode(String useWayCode) {
        this.useWayCode = useWayCode;
    }

    public String getUseWayName() {
        return useWayName;
    }

    public void setUseWayName(String useWayName) {
        this.useWayName = useWayName;
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

    @Override
    public String toString() {
        return "UsageWay{" +
        "useWayCode=" + useWayCode +
        ", useWayName=" + useWayName +
        ", englishAb=" + englishAb +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        "}";
    }
}
