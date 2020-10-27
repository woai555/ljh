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
public class RFactConcompare implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别代码
     */
    private String pCode;

    /**
     * 原代码
     */
    private String oCode;

    /**
     * 原名称
     */
    private String oName;

    /**
     * 对照代码
     */
    private String cCode;

    /**
     * 对照名称
     */
    private String cName;


    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getoCode() {
        return oCode;
    }

    public void setoCode(String oCode) {
        this.oCode = oCode;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "RFactConcompare{" +
        "pCode=" + pCode +
        ", oCode=" + oCode +
        ", oName=" + oName +
        ", cCode=" + cCode +
        ", cName=" + cName +
        "}";
    }
}
