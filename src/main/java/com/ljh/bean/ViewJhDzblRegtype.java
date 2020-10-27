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
public class ViewJhDzblRegtype implements Serializable {

    private static final long serialVersionUID=1L;

    private String hospitalNo;

    private String registerDictCode;

    private String registerDictName;

    private String pym;

    private BigDecimal isDelete;

    private String sortCode;

    private String registerGroupCode;

    private String registerGroupName;

    private BigDecimal isDeleteB;

    private String sortCodeB;

    private String pymB;


    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getRegisterDictCode() {
        return registerDictCode;
    }

    public void setRegisterDictCode(String registerDictCode) {
        this.registerDictCode = registerDictCode;
    }

    public String getRegisterDictName() {
        return registerDictName;
    }

    public void setRegisterDictName(String registerDictName) {
        this.registerDictName = registerDictName;
    }

    public String getPym() {
        return pym;
    }

    public void setPym(String pym) {
        this.pym = pym;
    }

    public BigDecimal getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(BigDecimal isDelete) {
        this.isDelete = isDelete;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getRegisterGroupCode() {
        return registerGroupCode;
    }

    public void setRegisterGroupCode(String registerGroupCode) {
        this.registerGroupCode = registerGroupCode;
    }

    public String getRegisterGroupName() {
        return registerGroupName;
    }

    public void setRegisterGroupName(String registerGroupName) {
        this.registerGroupName = registerGroupName;
    }

    public BigDecimal getIsDeleteB() {
        return isDeleteB;
    }

    public void setIsDeleteB(BigDecimal isDeleteB) {
        this.isDeleteB = isDeleteB;
    }

    public String getSortCodeB() {
        return sortCodeB;
    }

    public void setSortCodeB(String sortCodeB) {
        this.sortCodeB = sortCodeB;
    }

    public String getPymB() {
        return pymB;
    }

    public void setPymB(String pymB) {
        this.pymB = pymB;
    }

    @Override
    public String toString() {
        return "ViewJhDzblRegtype{" +
        "hospitalNo=" + hospitalNo +
        ", registerDictCode=" + registerDictCode +
        ", registerDictName=" + registerDictName +
        ", pym=" + pym +
        ", isDelete=" + isDelete +
        ", sortCode=" + sortCode +
        ", registerGroupCode=" + registerGroupCode +
        ", registerGroupName=" + registerGroupName +
        ", isDeleteB=" + isDeleteB +
        ", sortCodeB=" + sortCodeB +
        ", pymB=" + pymB +
        "}";
    }
}
