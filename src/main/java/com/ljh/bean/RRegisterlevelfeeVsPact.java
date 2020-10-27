package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号登记费用对照合同单位
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRegisterlevelfeeVsPact implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 号别
     */
    @TableId(value = "REGLEVL_CODE", type = IdType.AUTO)
    private String reglevlCode;

    /**
     * 合同单位编码
     */
    private String pactCode;

    /**
     * 挂号费his代码，医保实时结算用，090921
     */
    private String regfeeHisid;

    /**
     * 诊疗费his代码，医保实时结算用，090921
     */
    private String diagfeeHisid;

    /**
     * 急诊挂号费his代码，医保实时结算用，090921
     */
    private String jzregfeeHisid;

    /**
     * 0:pact_code北京市社会保险险种类型 1:pact_code医疗参保人员类别
     */
    private String persontype;


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

    public String getPersontype() {
        return persontype;
    }

    public void setPersontype(String persontype) {
        this.persontype = persontype;
    }

    @Override
    public String toString() {
        return "RRegisterlevelfeeVsPact{" +
        "reglevlCode=" + reglevlCode +
        ", pactCode=" + pactCode +
        ", regfeeHisid=" + regfeeHisid +
        ", diagfeeHisid=" + diagfeeHisid +
        ", jzregfeeHisid=" + jzregfeeHisid +
        ", persontype=" + persontype +
        "}";
    }
}
