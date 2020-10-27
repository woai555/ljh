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
public class VJhIpmoudfq implements Serializable {

    private static final long serialVersionUID=1L;

    private String freqCode;

    private String freqName;


    public String getFreqCode() {
        return freqCode;
    }

    public void setFreqCode(String freqCode) {
        this.freqCode = freqCode;
    }

    public String getFreqName() {
        return freqName;
    }

    public void setFreqName(String freqName) {
        this.freqName = freqName;
    }

    @Override
    public String toString() {
        return "VJhIpmoudfq{" +
        "freqCode=" + freqCode +
        ", freqName=" + freqName +
        "}";
    }
}
