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
public class LStencilKind implements Serializable {

    private static final long serialVersionUID=1L;

    private String stencilName;

    @TableId(value = "STENCIL_CODE", type = IdType.AUTO)
    private Integer stencilCode;


    public String getStencilName() {
        return stencilName;
    }

    public void setStencilName(String stencilName) {
        this.stencilName = stencilName;
    }

    public Integer getStencilCode() {
        return stencilCode;
    }

    public void setStencilCode(Integer stencilCode) {
        this.stencilCode = stencilCode;
    }

    @Override
    public String toString() {
        return "LStencilKind{" +
        "stencilName=" + stencilName +
        ", stencilCode=" + stencilCode +
        "}";
    }
}
