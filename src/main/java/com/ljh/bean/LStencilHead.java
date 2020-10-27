package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class LStencilHead implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "STENCILNO", type = IdType.AUTO)
    private String stencilno;

    private String machinecode;

    private Integer stencilkind;

    private Integer stencilmode;

    private String stenciltext;

    private String operatorid;

    private LocalDateTime operatortime;


    public String getStencilno() {
        return stencilno;
    }

    public void setStencilno(String stencilno) {
        this.stencilno = stencilno;
    }

    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public Integer getStencilkind() {
        return stencilkind;
    }

    public void setStencilkind(Integer stencilkind) {
        this.stencilkind = stencilkind;
    }

    public Integer getStencilmode() {
        return stencilmode;
    }

    public void setStencilmode(Integer stencilmode) {
        this.stencilmode = stencilmode;
    }

    public String getStenciltext() {
        return stenciltext;
    }

    public void setStenciltext(String stenciltext) {
        this.stenciltext = stenciltext;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "LStencilHead{" +
        "stencilno=" + stencilno +
        ", machinecode=" + machinecode +
        ", stencilkind=" + stencilkind +
        ", stencilmode=" + stencilmode +
        ", stenciltext=" + stenciltext +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}
