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
public class QryYzinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String wCode;

    private String wName;

    private String wComment;

    private String wBelongto;


    public String getwCode() {
        return wCode;
    }

    public void setwCode(String wCode) {
        this.wCode = wCode;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getwComment() {
        return wComment;
    }

    public void setwComment(String wComment) {
        this.wComment = wComment;
    }

    public String getwBelongto() {
        return wBelongto;
    }

    public void setwBelongto(String wBelongto) {
        this.wBelongto = wBelongto;
    }

    @Override
    public String toString() {
        return "QryYzinfo{" +
        "wCode=" + wCode +
        ", wName=" + wName +
        ", wComment=" + wComment +
        ", wBelongto=" + wBelongto +
        "}";
    }
}
