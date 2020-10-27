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
public class VReglevelfeeVsPact implements Serializable {

    private static final long serialVersionUID=1L;

    private String reglevlCode;

    private String pactCode;

    private String regfeeHisid;

    private String diagfeeHisid;

    private String jzregfeeHisid;

    private String regHisname;

    private String diagHisname;


    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getRegfeeHisid() {
        return regfeeHisid;
    }

    public void setRegfeeHisid(String regfeeHisid) {
        this.regfeeHisid = regfeeHisid;
    }

    public String getDiagfeeHisid() {
        return diagfeeHisid;
    }

    public void setDiagfeeHisid(String diagfeeHisid) {
        this.diagfeeHisid = diagfeeHisid;
    }

    public String getJzregfeeHisid() {
        return jzregfeeHisid;
    }

    public void setJzregfeeHisid(String jzregfeeHisid) {
        this.jzregfeeHisid = jzregfeeHisid;
    }

    public String getRegHisname() {
        return regHisname;
    }

    public void setRegHisname(String regHisname) {
        this.regHisname = regHisname;
    }

    public String getDiagHisname() {
        return diagHisname;
    }

    public void setDiagHisname(String diagHisname) {
        this.diagHisname = diagHisname;
    }

    @Override
    public String toString() {
        return "VReglevelfeeVsPact{" +
        "reglevlCode=" + reglevlCode +
        ", pactCode=" + pactCode +
        ", regfeeHisid=" + regfeeHisid +
        ", diagfeeHisid=" + diagfeeHisid +
        ", jzregfeeHisid=" + jzregfeeHisid +
        ", regHisname=" + regHisname +
        ", diagHisname=" + diagHisname +
        "}";
    }
}
