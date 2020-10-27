package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用法和剂型是否匹配，用于判断医生处方开立是否合理
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdModelMatchUsage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 剂型编码
     */
    @TableId(value = "MODEL_CODE", type = IdType.AUTO)
    private String modelCode;

    /**
     * 用法编码
     */
    private String usageCode;

    /**
     * 操作人员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
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
        return "OrdModelMatchUsage{" +
        "modelCode=" + modelCode +
        ", usageCode=" + usageCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
