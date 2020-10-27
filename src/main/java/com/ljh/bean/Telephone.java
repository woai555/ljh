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
public class Telephone implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 科室
     */
    private String deptName;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 医生
     */
    private String emplName;


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    @Override
    public String toString() {
        return "Telephone{" +
        "deptName=" + deptName +
        ", telephone=" + telephone +
        ", emplName=" + emplName +
        "}";
    }
}
