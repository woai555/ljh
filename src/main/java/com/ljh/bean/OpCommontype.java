package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 常数类别表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpCommontype implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类别编码
     */
    @TableId(value = "TYPE_CODE", type = IdType.AUTO)
    private String typeCode;

    /**
     * 类别名称
     */
    private String typeName;


    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "OpCommontype{" +
        "typeCode=" + typeCode +
        ", typeName=" + typeName +
        "}";
    }
}
