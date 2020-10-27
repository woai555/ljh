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
public class JytLog implements Serializable {

    private static final long serialVersionUID=1L;

    private String functionName;

    private LocalDateTime operDate;

    private String inParm;

    private String outParm;


    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getInParm() {
        return inParm;
    }

    public void setInParm(String inParm) {
        this.inParm = inParm;
    }

    public String getOutParm() {
        return outParm;
    }

    public void setOutParm(String outParm) {
        this.outParm = outParm;
    }

    @Override
    public String toString() {
        return "JytLog{" +
        "functionName=" + functionName +
        ", operDate=" + operDate +
        ", inParm=" + inParm +
        ", outParm=" + outParm +
        "}";
    }
}
