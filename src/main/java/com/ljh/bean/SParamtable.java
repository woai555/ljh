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
public class SParamtable implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "PARAMTYPE", type = IdType.AUTO)
    private Integer paramtype;

    private String paramname;

    private String paramvalue;


    public Integer getParamtype() {
        return paramtype;
    }

    public void setParamtype(Integer paramtype) {
        this.paramtype = paramtype;
    }

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname;
    }

    public String getParamvalue() {
        return paramvalue;
    }

    public void setParamvalue(String paramvalue) {
        this.paramvalue = paramvalue;
    }

    @Override
    public String toString() {
        return "SParamtable{" +
        "paramtype=" + paramtype +
        ", paramname=" + paramname +
        ", paramvalue=" + paramvalue +
        "}";
    }
}
