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
public class RIdcard implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 枚举
     */
    @TableId(value = "NO", type = IdType.AUTO)
    private String no;

    /**
     * 证件类型
     */
    private String idname;


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    @Override
    public String toString() {
        return "RIdcard{" +
        "no=" + no +
        ", idname=" + idname +
        "}";
    }
}
