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
public class RDrugtaboo implements Serializable {

    private static final long serialVersionUID=1L;

    private String drugcomb;

    private String taboodesp;

    private String tagmark;


    public String getDrugcomb() {
        return drugcomb;
    }

    public void setDrugcomb(String drugcomb) {
        this.drugcomb = drugcomb;
    }

    public String getTaboodesp() {
        return taboodesp;
    }

    public void setTaboodesp(String taboodesp) {
        this.taboodesp = taboodesp;
    }

    public String getTagmark() {
        return tagmark;
    }

    public void setTagmark(String tagmark) {
        this.tagmark = tagmark;
    }

    @Override
    public String toString() {
        return "RDrugtaboo{" +
        "drugcomb=" + drugcomb +
        ", taboodesp=" + taboodesp +
        ", tagmark=" + tagmark +
        "}";
    }
}
