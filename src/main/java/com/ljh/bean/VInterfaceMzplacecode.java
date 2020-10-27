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
public class VInterfaceMzplacecode implements Serializable {

    private static final long serialVersionUID=1L;

    private String groupcode;

    private String groupname;

    private String medicinecode;

    private String placecode;

    private String storecode;

    private String storename;


    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getMedicinecode() {
        return medicinecode;
    }

    public void setMedicinecode(String medicinecode) {
        this.medicinecode = medicinecode;
    }

    public String getPlacecode() {
        return placecode;
    }

    public void setPlacecode(String placecode) {
        this.placecode = placecode;
    }

    public String getStorecode() {
        return storecode;
    }

    public void setStorecode(String storecode) {
        this.storecode = storecode;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    @Override
    public String toString() {
        return "VInterfaceMzplacecode{" +
        "groupcode=" + groupcode +
        ", groupname=" + groupname +
        ", medicinecode=" + medicinecode +
        ", placecode=" + placecode +
        ", storecode=" + storecode +
        ", storename=" + storename +
        "}";
    }
}
