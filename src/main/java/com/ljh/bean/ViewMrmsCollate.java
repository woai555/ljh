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
public class ViewMrmsCollate implements Serializable {

    private static final long serialVersionUID=1L;

    private String oldDeptcode;

    private String oldDeptname;

    private String newDeptcode;

    private String newDeptname;


    public String getOldDeptcode() {
        return oldDeptcode;
    }

    public void setOldDeptcode(String oldDeptcode) {
        this.oldDeptcode = oldDeptcode;
    }

    public String getOldDeptname() {
        return oldDeptname;
    }

    public void setOldDeptname(String oldDeptname) {
        this.oldDeptname = oldDeptname;
    }

    public String getNewDeptcode() {
        return newDeptcode;
    }

    public void setNewDeptcode(String newDeptcode) {
        this.newDeptcode = newDeptcode;
    }

    public String getNewDeptname() {
        return newDeptname;
    }

    public void setNewDeptname(String newDeptname) {
        this.newDeptname = newDeptname;
    }

    @Override
    public String toString() {
        return "ViewMrmsCollate{" +
        "oldDeptcode=" + oldDeptcode +
        ", oldDeptname=" + oldDeptname +
        ", newDeptcode=" + newDeptcode +
        ", newDeptname=" + newDeptname +
        "}";
    }
}
