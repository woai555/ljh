package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 物品所有权表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SupOwner implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 所有权编号
     */
    @TableId(value = "OWNER_CODE", type = IdType.AUTO)
    private String ownerCode;

    /**
     * 所有权名称
     */
    private String ownerName;


    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "SupOwner{" +
        "ownerCode=" + ownerCode +
        ", ownerName=" + ownerName +
        "}";
    }
}
