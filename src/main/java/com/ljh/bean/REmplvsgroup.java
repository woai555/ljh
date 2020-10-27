package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 人员组别关系表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class REmplvsgroup implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 组代码，以G打头，区别于发票领取表中的人员代码，以免重复
     */
    private String grpid;

    /**
     * 工作组名称
     */
    private String grpname;

    /**
     * 员工代码
     */
    private String emplCode;

    /**
     * 00-挂号发票、01－门诊发票、02－住院发票、04－押金发票
     */
    private String invoiceKind;


    public String getGrpid() {
        return grpid;
    }

    public void setGrpid(String grpid) {
        this.grpid = grpid;
    }

    public String getGrpname() {
        return grpname;
    }

    public void setGrpname(String grpname) {
        this.grpname = grpname;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getInvoiceKind() {
        return invoiceKind;
    }

    public void setInvoiceKind(String invoiceKind) {
        this.invoiceKind = invoiceKind;
    }

    @Override
    public String toString() {
        return "REmplvsgroup{" +
        "grpid=" + grpid +
        ", grpname=" + grpname +
        ", emplCode=" + emplCode +
        ", invoiceKind=" + invoiceKind +
        "}";
    }
}
