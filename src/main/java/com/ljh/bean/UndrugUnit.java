package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 非药品基本单位表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class UndrugUnit implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 单位代码
     */
    @TableId(value = "UNIT_CODE", type = IdType.AUTO)
    private String unitCode;

    /**
     * 单位名称
     */
    private String unitName;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作日期
     */
    private LocalDateTime operDtime;


    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
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

    @Override
    public String toString() {
        return "UndrugUnit{" +
        "unitCode=" + unitCode +
        ", unitName=" + unitName +
        ", operCode=" + operCode +
        ", operDtime=" + operDtime +
        "}";
    }
}
