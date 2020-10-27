package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 退号类型字典
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRegisterQuitType implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "TYPE_ID", type = IdType.AUTO)
    private Integer typeId;

    private String typeName;


    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "RRegisterQuitType{" +
        "typeId=" + typeId +
        ", typeName=" + typeName +
        "}";
    }
}
