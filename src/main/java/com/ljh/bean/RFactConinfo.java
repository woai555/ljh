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
public class RFactConinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 代码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否要传给实名系统'1'传'0'不传
     */
    private String tofact;

    /**
     * 代码对照用Datawindow
     */
    private String dwname;


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

    public String getTofact() {
        return tofact;
    }

    public void setTofact(String tofact) {
        this.tofact = tofact;
    }

    public String getDwname() {
        return dwname;
    }

    public void setDwname(String dwname) {
        this.dwname = dwname;
    }

    @Override
    public String toString() {
        return "RFactConinfo{" +
        "code=" + code +
        ", name=" + name +
        ", tofact=" + tofact +
        ", dwname=" + dwname +
        "}";
    }
}
