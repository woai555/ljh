package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 看诊结果表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdSeeresult implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 结果编码
     */
    @TableId(value = "RESULT_CODE", type = IdType.AUTO)
    private String resultCode;

    /**
     * 结果名称
     */
    private String resultName;

    /**
     * 操作员编码
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
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
        return "OrdSeeresult{" +
        "resultCode=" + resultCode +
        ", resultName=" + resultName +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
