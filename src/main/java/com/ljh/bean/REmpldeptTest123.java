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
public class REmpldeptTest123 implements Serializable {

    private static final long serialVersionUID=1L;

    private String emplCode;

    private String deptCode;

    private String operCode;

    private LocalDateTime operDtime;

    private String mainFlag;

    private String nurseCellCode;


    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDtime() {
        return operDtime;
    }

    public void setOperDtime(LocalDateTime operDtime) {
        this.operDtime = operDtime;
    }

    public String getMainFlag() {
        return mainFlag;
    }

    public void setMainFlag(String mainFlag) {
        this.mainFlag = mainFlag;
    }

    public String getNurseCellCode() {
        return nurseCellCode;
    }

    public void setNurseCellCode(String nurseCellCode) {
        this.nurseCellCode = nurseCellCode;
    }

    @Override
    public String toString() {
        return "REmpldeptTest123{" +
        "emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", operCode=" + operCode +
        ", operDtime=" + operDtime +
        ", mainFlag=" + mainFlag +
        ", nurseCellCode=" + nurseCellCode +
        "}";
    }
}
