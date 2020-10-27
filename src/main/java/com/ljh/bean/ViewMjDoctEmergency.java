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
public class ViewMjDoctEmergency implements Serializable {

    private static final long serialVersionUID=1L;

    private String docCode;

    private String doctname;

    private String deptCode;

    private String idenno;


    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getDoctname() {
        return doctname;
    }

    public void setDoctname(String doctname) {
        this.doctname = doctname;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    @Override
    public String toString() {
        return "ViewMjDoctEmergency{" +
        "docCode=" + docCode +
        ", doctname=" + doctname +
        ", deptCode=" + deptCode +
        ", idenno=" + idenno +
        "}";
    }
}
