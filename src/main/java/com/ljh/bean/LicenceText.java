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
public class LicenceText implements Serializable {

    private static final long serialVersionUID=1L;

    private String licenceText;


    public String getLicenceText() {
        return licenceText;
    }

    public void setLicenceText(String licenceText) {
        this.licenceText = licenceText;
    }

    @Override
    public String toString() {
        return "LicenceText{" +
        "licenceText=" + licenceText +
        "}";
    }
}
