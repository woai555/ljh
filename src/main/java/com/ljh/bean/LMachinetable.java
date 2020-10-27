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
public class LMachinetable implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MACHINECODE", type = IdType.AUTO)
    private String machinecode;

    private String machinename;

    private Integer machinetype;

    private Integer graphmark;

    private Integer graphpointer;

    private String operatorid;

    private LocalDateTime modifydate;

    private Integer temwidth;

    private Integer temheight;

    /**
     * 是否微生物使用仪器
     */
    private String ismcro;


    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public Integer getMachinetype() {
        return machinetype;
    }

    public void setMachinetype(Integer machinetype) {
        this.machinetype = machinetype;
    }

    public Integer getGraphmark() {
        return graphmark;
    }

    public void setGraphmark(Integer graphmark) {
        this.graphmark = graphmark;
    }

    public Integer getGraphpointer() {
        return graphpointer;
    }

    public void setGraphpointer(Integer graphpointer) {
        this.graphpointer = graphpointer;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getModifydate() {
        return modifydate;
    }

    public void setModifydate(LocalDateTime modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getTemwidth() {
        return temwidth;
    }

    public void setTemwidth(Integer temwidth) {
        this.temwidth = temwidth;
    }

    public Integer getTemheight() {
        return temheight;
    }

    public void setTemheight(Integer temheight) {
        this.temheight = temheight;
    }

    public String getIsmcro() {
        return ismcro;
    }

    public void setIsmcro(String ismcro) {
        this.ismcro = ismcro;
    }

    @Override
    public String toString() {
        return "LMachinetable{" +
        "machinecode=" + machinecode +
        ", machinename=" + machinename +
        ", machinetype=" + machinetype +
        ", graphmark=" + graphmark +
        ", graphpointer=" + graphpointer +
        ", operatorid=" + operatorid +
        ", modifydate=" + modifydate +
        ", temwidth=" + temwidth +
        ", temheight=" + temheight +
        ", ismcro=" + ismcro +
        "}";
    }
}
