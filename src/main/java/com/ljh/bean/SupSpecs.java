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
public class SupSpecs implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "SPECS_CODE", type = IdType.AUTO)
    private String specsCode;

    private String specsName;


    public String getSpecsCode() {
        return specsCode;
    }

    public void setSpecsCode(String specsCode) {
        this.specsCode = specsCode;
    }

    public String getSpecsName() {
        return specsName;
    }

    public void setSpecsName(String specsName) {
        this.specsName = specsName;
    }

    @Override
    public String toString() {
        return "SupSpecs{" +
        "specsCode=" + specsCode +
        ", specsName=" + specsName +
        "}";
    }
}
