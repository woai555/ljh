package com.ljh.bean;

import java.math.BigDecimal;
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
public class Pbcatcol implements Serializable {

    private static final long serialVersionUID=1L;

    private String pbcTnam;

    private BigDecimal pbcTid;

    private String pbcOwnr;

    private String pbcCnam;

    private BigDecimal pbcCid;

    private String pbcLabl;

    private BigDecimal pbcLpos;

    private String pbcHdr;

    private BigDecimal pbcHpos;

    private BigDecimal pbcJtfy;

    private String pbcMask;

    private BigDecimal pbcCase;

    private BigDecimal pbcHght;

    private BigDecimal pbcWdth;

    private String pbcPtrn;

    private String pbcBmap;

    private String pbcInit;

    private String pbcCmnt;

    private String pbcEdit;

    private String pbcTag;


    public String getPbcTnam() {
        return pbcTnam;
    }

    public void setPbcTnam(String pbcTnam) {
        this.pbcTnam = pbcTnam;
    }

    public BigDecimal getPbcTid() {
        return pbcTid;
    }

    public void setPbcTid(BigDecimal pbcTid) {
        this.pbcTid = pbcTid;
    }

    public String getPbcOwnr() {
        return pbcOwnr;
    }

    public void setPbcOwnr(String pbcOwnr) {
        this.pbcOwnr = pbcOwnr;
    }

    public String getPbcCnam() {
        return pbcCnam;
    }

    public void setPbcCnam(String pbcCnam) {
        this.pbcCnam = pbcCnam;
    }

    public BigDecimal getPbcCid() {
        return pbcCid;
    }

    public void setPbcCid(BigDecimal pbcCid) {
        this.pbcCid = pbcCid;
    }

    public String getPbcLabl() {
        return pbcLabl;
    }

    public void setPbcLabl(String pbcLabl) {
        this.pbcLabl = pbcLabl;
    }

    public BigDecimal getPbcLpos() {
        return pbcLpos;
    }

    public void setPbcLpos(BigDecimal pbcLpos) {
        this.pbcLpos = pbcLpos;
    }

    public String getPbcHdr() {
        return pbcHdr;
    }

    public void setPbcHdr(String pbcHdr) {
        this.pbcHdr = pbcHdr;
    }

    public BigDecimal getPbcHpos() {
        return pbcHpos;
    }

    public void setPbcHpos(BigDecimal pbcHpos) {
        this.pbcHpos = pbcHpos;
    }

    public BigDecimal getPbcJtfy() {
        return pbcJtfy;
    }

    public void setPbcJtfy(BigDecimal pbcJtfy) {
        this.pbcJtfy = pbcJtfy;
    }

    public String getPbcMask() {
        return pbcMask;
    }

    public void setPbcMask(String pbcMask) {
        this.pbcMask = pbcMask;
    }

    public BigDecimal getPbcCase() {
        return pbcCase;
    }

    public void setPbcCase(BigDecimal pbcCase) {
        this.pbcCase = pbcCase;
    }

    public BigDecimal getPbcHght() {
        return pbcHght;
    }

    public void setPbcHght(BigDecimal pbcHght) {
        this.pbcHght = pbcHght;
    }

    public BigDecimal getPbcWdth() {
        return pbcWdth;
    }

    public void setPbcWdth(BigDecimal pbcWdth) {
        this.pbcWdth = pbcWdth;
    }

    public String getPbcPtrn() {
        return pbcPtrn;
    }

    public void setPbcPtrn(String pbcPtrn) {
        this.pbcPtrn = pbcPtrn;
    }

    public String getPbcBmap() {
        return pbcBmap;
    }

    public void setPbcBmap(String pbcBmap) {
        this.pbcBmap = pbcBmap;
    }

    public String getPbcInit() {
        return pbcInit;
    }

    public void setPbcInit(String pbcInit) {
        this.pbcInit = pbcInit;
    }

    public String getPbcCmnt() {
        return pbcCmnt;
    }

    public void setPbcCmnt(String pbcCmnt) {
        this.pbcCmnt = pbcCmnt;
    }

    public String getPbcEdit() {
        return pbcEdit;
    }

    public void setPbcEdit(String pbcEdit) {
        this.pbcEdit = pbcEdit;
    }

    public String getPbcTag() {
        return pbcTag;
    }

    public void setPbcTag(String pbcTag) {
        this.pbcTag = pbcTag;
    }

    @Override
    public String toString() {
        return "Pbcatcol{" +
        "pbcTnam=" + pbcTnam +
        ", pbcTid=" + pbcTid +
        ", pbcOwnr=" + pbcOwnr +
        ", pbcCnam=" + pbcCnam +
        ", pbcCid=" + pbcCid +
        ", pbcLabl=" + pbcLabl +
        ", pbcLpos=" + pbcLpos +
        ", pbcHdr=" + pbcHdr +
        ", pbcHpos=" + pbcHpos +
        ", pbcJtfy=" + pbcJtfy +
        ", pbcMask=" + pbcMask +
        ", pbcCase=" + pbcCase +
        ", pbcHght=" + pbcHght +
        ", pbcWdth=" + pbcWdth +
        ", pbcPtrn=" + pbcPtrn +
        ", pbcBmap=" + pbcBmap +
        ", pbcInit=" + pbcInit +
        ", pbcCmnt=" + pbcCmnt +
        ", pbcEdit=" + pbcEdit +
        ", pbcTag=" + pbcTag +
        "}";
    }
}
