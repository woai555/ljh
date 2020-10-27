package com.ljh.bean;

import java.math.BigDecimal;
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
public class JytPrivatecloudDepartment implements Serializable {

    private static final long serialVersionUID=1L;

    private String code;

    private String name;

    private String pcode;

    private String address;

    private String deptDesc;

    private String remark;

    private BigDecimal index1;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getIndex1() {
        return index1;
    }

    public void setIndex1(BigDecimal index1) {
        this.index1 = index1;
    }

    @Override
    public String toString() {
        return "JytPrivatecloudDepartment{" +
        "code=" + code +
        ", name=" + name +
        ", pcode=" + pcode +
        ", address=" + address +
        ", deptDesc=" + deptDesc +
        ", remark=" + remark +
        ", index1=" + index1 +
        "}";
    }
}
