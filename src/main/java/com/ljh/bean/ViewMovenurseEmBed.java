package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class ViewMovenurseEmBed implements Serializable {

    private static final long serialVersionUID=1L;

    private String wardCode;

    private String deptCode;

    private String bedNo;

    private String bedLabel;


    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getBedLabel() {
        return bedLabel;
    }

    public void setBedLabel(String bedLabel) {
        this.bedLabel = bedLabel;
    }

    @Override
    public String toString() {
        return "ViewMovenurseEmBed{" +
        "wardCode=" + wardCode +
        ", deptCode=" + deptCode +
        ", bedNo=" + bedNo +
        ", bedLabel=" + bedLabel +
        "}";
    }
}
