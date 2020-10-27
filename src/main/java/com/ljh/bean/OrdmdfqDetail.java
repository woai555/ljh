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
public class OrdmdfqDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "DFQ_FREQ", type = IdType.AUTO)
    private String dfqFreq;

    private String dfqPoint;

    private String operCode;

    private LocalDateTime operDate;


    public String getDfqFreq() {
        return dfqFreq;
    }

    public void setDfqFreq(String dfqFreq) {
        this.dfqFreq = dfqFreq;
    }

    public String getDfqPoint() {
        return dfqPoint;
    }

    public void setDfqPoint(String dfqPoint) {
        this.dfqPoint = dfqPoint;
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
        return "OrdmdfqDetail{" +
        "dfqFreq=" + dfqFreq +
        ", dfqPoint=" + dfqPoint +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
