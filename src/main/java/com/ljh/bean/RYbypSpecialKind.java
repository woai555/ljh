package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医保特殊药品类别
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RYbypSpecialKind implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别编码
     */
    private String kindCode;

    /**
     * 类别名称
     */
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
        return "RYbypSpecialKind{" +
        "kindCode=" + kindCode +
        ", kindName=" + kindName +
        "}";
    }
}
