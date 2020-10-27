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
public class PriorMenu implements Serializable {

    private static final long serialVersionUID=1L;

    private String mnuGroup;

    @TableId(value = "MNU_COL", type = IdType.AUTO)
    private Integer mnuCol;

    private Integer mnuRow;

    private String mnuName;

    private String sysCode;

    private String mnuWin;

    private String mnuParm;

    private String mnuRemark;


    public String getMnuGroup() {
        return mnuGroup;
    }

    public void setMnuGroup(String mnuGroup) {
        this.mnuGroup = mnuGroup;
    }

    public Integer getMnuCol() {
        return mnuCol;
    }

    public void setMnuCol(Integer mnuCol) {
        this.mnuCol = mnuCol;
    }

    public Integer getMnuRow() {
        return mnuRow;
    }

    public void setMnuRow(Integer mnuRow) {
        this.mnuRow = mnuRow;
    }

    public String getMnuName() {
        return mnuName;
    }

    public void setMnuName(String mnuName) {
        this.mnuName = mnuName;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getMnuWin() {
        return mnuWin;
    }

    public void setMnuWin(String mnuWin) {
        this.mnuWin = mnuWin;
    }

    public String getMnuParm() {
        return mnuParm;
    }

    public void setMnuParm(String mnuParm) {
        this.mnuParm = mnuParm;
    }

    public String getMnuRemark() {
        return mnuRemark;
    }

    public void setMnuRemark(String mnuRemark) {
        this.mnuRemark = mnuRemark;
    }

    @Override
    public String toString() {
        return "PriorMenu{" +
        "mnuGroup=" + mnuGroup +
        ", mnuCol=" + mnuCol +
        ", mnuRow=" + mnuRow +
        ", mnuName=" + mnuName +
        ", sysCode=" + sysCode +
        ", mnuWin=" + mnuWin +
        ", mnuParm=" + mnuParm +
        ", mnuRemark=" + mnuRemark +
        "}";
    }
}
