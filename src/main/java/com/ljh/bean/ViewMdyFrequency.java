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
public class ViewMdyFrequency implements Serializable {

    private static final long serialVersionUID=1L;

    private String codeValue;

    private String codeDesc;

    private Integer dfqCycl;

    private Integer dfqCont;

    private Integer dfqIntv;


    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public Integer getDfqCycl() {
        return dfqCycl;
    }

    public void setDfqCycl(Integer dfqCycl) {
        this.dfqCycl = dfqCycl;
    }

    public Integer getDfqCont() {
        return dfqCont;
    }

    public void setDfqCont(Integer dfqCont) {
        this.dfqCont = dfqCont;
    }

    public Integer getDfqIntv() {
        return dfqIntv;
    }

    public void setDfqIntv(Integer dfqIntv) {
        this.dfqIntv = dfqIntv;
    }

    @Override
    public String toString() {
        return "ViewMdyFrequency{" +
        "codeValue=" + codeValue +
        ", codeDesc=" + codeDesc +
        ", dfqCycl=" + dfqCycl +
        ", dfqCont=" + dfqCont +
        ", dfqIntv=" + dfqIntv +
        "}";
    }
}
