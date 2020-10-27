package com.ljh.bean;

import java.math.BigDecimal;
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
public class Microsoftdtproperties implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private BigDecimal id;

    private BigDecimal objectid;

    private String property;

    private String value;

    private byte[] lvalue;

    private BigDecimal version;


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getObjectid() {
        return objectid;
    }

    public void setObjectid(BigDecimal objectid) {
        this.objectid = objectid;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public byte[] getLvalue() {
        return lvalue;
    }

    public void setLvalue(byte[] lvalue) {
        this.lvalue = lvalue;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Microsoftdtproperties{" +
        "id=" + id +
        ", objectid=" + objectid +
        ", property=" + property +
        ", value=" + value +
        ", lvalue=" + lvalue +
        ", version=" + version +
        "}";
    }
}
