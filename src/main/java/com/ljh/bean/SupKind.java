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
public class SupKind implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "KIND_CODE", type = IdType.AUTO)
    private String kindCode;

    private String kindName;


    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    @Override
    public String toString() {
        return "SupKind{" +
        "kindCode=" + kindCode +
        ", kindName=" + kindName +
        "}";
    }
}
