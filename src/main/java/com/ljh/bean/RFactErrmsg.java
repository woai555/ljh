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
public class RFactErrmsg implements Serializable {

    private static final long serialVersionUID=1L;

    private String errcode;

    private String errmess;


    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmess() {
        return errmess;
    }

    public void setErrmess(String errmess) {
        this.errmess = errmess;
    }

    @Override
    public String toString() {
        return "RFactErrmsg{" +
        "errcode=" + errcode +
        ", errmess=" + errmess +
        "}";
    }
}
