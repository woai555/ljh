package com.ljh.bean;

import java.math.BigDecimal;
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
public class ViewDictSymptom implements Serializable {

    private static final long serialVersionUID=1L;

    private BigDecimal symptomCode;

    private String symptomName;

    private BigDecimal symptomdetailCode;

    private String symptomdetailName;


    public BigDecimal getSymptomCode() {
        return symptomCode;
    }

    public void setSymptomCode(BigDecimal symptomCode) {
        this.symptomCode = symptomCode;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public BigDecimal getSymptomdetailCode() {
        return symptomdetailCode;
    }

    public void setSymptomdetailCode(BigDecimal symptomdetailCode) {
        this.symptomdetailCode = symptomdetailCode;
    }

    public String getSymptomdetailName() {
        return symptomdetailName;
    }

    public void setSymptomdetailName(String symptomdetailName) {
        this.symptomdetailName = symptomdetailName;
    }

    @Override
    public String toString() {
        return "ViewDictSymptom{" +
        "symptomCode=" + symptomCode +
        ", symptomName=" + symptomName +
        ", symptomdetailCode=" + symptomdetailCode +
        ", symptomdetailName=" + symptomdetailName +
        "}";
    }
}
