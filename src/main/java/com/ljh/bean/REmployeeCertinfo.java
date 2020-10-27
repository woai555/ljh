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
public class REmployeeCertinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String emplCode;


    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    @Override
    public String toString() {
        return "REmployeeCertinfo{" +
        "emplCode=" + emplCode +
        "}";
    }
}
