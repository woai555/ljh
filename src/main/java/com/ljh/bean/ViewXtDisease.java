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
public class ViewXtDisease implements Serializable {

    private static final long serialVersionUID=1L;

    private String icdCode;

    private String icdName;

    private String sicd10;

    private String spellCode;

    private String wbCode;

    private LocalDateTime opTime;


    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public String getSicd10() {
        return sicd10;
    }

    public void setSicd10(String sicd10) {
        this.sicd10 = sicd10;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode;
    }

    public LocalDateTime getOpTime() {
        return opTime;
    }

    public void setOpTime(LocalDateTime opTime) {
        this.opTime = opTime;
    }

    @Override
    public String toString() {
        return "ViewXtDisease{" +
        "icdCode=" + icdCode +
        ", icdName=" + icdName +
        ", sicd10=" + sicd10 +
        ", spellCode=" + spellCode +
        ", wbCode=" + wbCode +
        ", opTime=" + opTime +
        "}";
    }
}
