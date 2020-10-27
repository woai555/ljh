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
public class Sendinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 发送标识
     */
    @TableId(value = "SEND_FLAG", type = IdType.AUTO)
    private String sendFlag;

    /**
     * 描述
     */
    private String description;


    public String getSendFlag() {
        return sendFlag;
    }

    public void setSendFlag(String sendFlag) {
        this.sendFlag = sendFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Sendinfo{" +
        "sendFlag=" + sendFlag +
        ", description=" + description +
        "}";
    }
}
