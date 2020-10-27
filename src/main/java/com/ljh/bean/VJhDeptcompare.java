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
public class VJhDeptcompare implements Serializable {

    private static final long serialVersionUID=1L;

    private String mzId;

    private Integer zyId;


    public String getMzId() {
        return mzId;
    }

    public void setMzId(String mzId) {
        this.mzId = mzId;
    }

    public Integer getZyId() {
        return zyId;
    }

    public void setZyId(Integer zyId) {
        this.zyId = zyId;
    }

    @Override
    public String toString() {
        return "VJhDeptcompare{" +
        "mzId=" + mzId +
        ", zyId=" + zyId +
        "}";
    }
}
