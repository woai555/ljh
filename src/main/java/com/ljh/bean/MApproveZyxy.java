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
public class MApproveZyxy implements Serializable {

    private static final long serialVersionUID=1L;

    private String medicinecode;


    public String getMedicinecode() {
        return medicinecode;
    }

    public void setMedicinecode(String medicinecode) {
        this.medicinecode = medicinecode;
    }

    @Override
    public String toString() {
        return "MApproveZyxy{" +
        "medicinecode=" + medicinecode +
        "}";
    }
}
