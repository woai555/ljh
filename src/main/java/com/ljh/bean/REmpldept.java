package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 员工所在科室信息
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class REmpldept implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 员工编号
     */
    @TableId(value = "EMPL_CODE", type = IdType.AUTO)
    private String emplCode;

    /**
     * 员工所在科室代码
     */
    private String deptCode;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDtime;

    /**
     * 主科室标志
     */
    private String mainFlag;

    /**
     * 护理单元
     */
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
        return "REmpldept{" +
        "emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", operCode=" + operCode +
        ", operDtime=" + operDtime +
        ", mainFlag=" + mainFlag +
        ", nurseCellCode=" + nurseCellCode +
        "}";
    }
}
