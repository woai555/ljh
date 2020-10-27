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
public class MrmbaseMzJcbw implements Serializable {

    private static final long serialVersionUID=1L;

    private String jcbwName;

    private String spell;

    private String deptName;

    private String deviceName;


    public String getJcbwName() {
        return jcbwName;
    }

    public void setJcbwName(String jcbwName) {
        this.jcbwName = jcbwName;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String toString() {
        return "MrmbaseMzJcbw{" +
        "jcbwName=" + jcbwName +
        ", spell=" + spell +
        ", deptName=" + deptName +
        ", deviceName=" + deviceName +
        "}";
    }
}
