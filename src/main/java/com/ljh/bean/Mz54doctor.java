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
public class Mz54doctor implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "UUID", type = IdType.AUTO)
    private String uuid;

    private String xml;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    @Override
    public String toString() {
        return "Mz54doctor{" +
        "uuid=" + uuid +
        ", xml=" + xml +
        "}";
    }
}
