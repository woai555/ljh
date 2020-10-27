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
public class VQyylIdtype implements Serializable {

    private static final long serialVersionUID=1L;

    private String idname;


    public String getIdname() {
        return idname;
    }

    public void setIdname(String idname) {
        this.idname = idname;
    }

    @Override
    public String toString() {
        return "VQyylIdtype{" +
        "idname=" + idname +
        "}";
    }
}
