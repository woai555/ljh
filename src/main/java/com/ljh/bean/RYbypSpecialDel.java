package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医保特殊药品
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RYbypSpecialDel implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * his码
     */
    private String hisid;

    /**
     * his名
     */
    private String hisname;

    /**
     * 医保码
     */
    private String ybid;

    /**
     * 医保药品名
     */
    private String ybname;

    /**
     * 规格
     */
    private String specs;

    /**
     * 维护人
     */
    private String operMan;

    /**
     * 维护时间
     */
    private LocalDateTime operDate;

    /**
     * 删除人
     */
    private String delMan;

    /**
     * 删除时间
     */
    private LocalDateTime delDate;

    /**
     * r_ybyp_special_kind
     */
    private String kindCode;


    public String getHisid() {
        return hisid;
    }

    public void setHisid(String hisid) {
        this.hisid = hisid;
    }

    public String getHisname() {
        return hisname;
    }

    public void setHisname(String hisname) {
        this.hisname = hisname;
    }

    public String getYbid() {
        return ybid;
    }

    public void setYbid(String ybid) {
        this.ybid = ybid;
    }

    public String getYbname() {
        return ybname;
    }

    public void setYbname(String ybname) {
        this.ybname = ybname;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getOperMan() {
        return operMan;
    }

    public void setOperMan(String operMan) {
        this.operMan = operMan;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getDelMan() {
        return delMan;
    }

    public void setDelMan(String delMan) {
        this.delMan = delMan;
    }

    public LocalDateTime getDelDate() {
        return delDate;
    }

    public void setDelDate(LocalDateTime delDate) {
        this.delDate = delDate;
    }

    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    @Override
    public String toString() {
        return "RYbypSpecialDel{" +
        "hisid=" + hisid +
        ", hisname=" + hisname +
        ", ybid=" + ybid +
        ", ybname=" + ybname +
        ", specs=" + specs +
        ", operMan=" + operMan +
        ", operDate=" + operDate +
        ", delMan=" + delMan +
        ", delDate=" + delDate +
        ", kindCode=" + kindCode +
        "}";
    }
}
