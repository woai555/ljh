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
public class OpPrivlist implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "PRIV_CODE", type = IdType.AUTO)
    private String privCode;

    private String privName;


    public String getPrivCode() {
        return privCode;
    }

    public void setPrivCode(String privCode) {
        this.privCode = privCode;
    }

    public String getPrivName() {
        return privName;
    }

    public void setPrivName(String privName) {
        this.privName = privName;
    }

    @Override
    public String toString() {
        return "OpPrivlist{" +
        "privCode=" + privCode +
        ", privName=" + privName +
        "}";
    }
}
