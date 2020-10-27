package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_STAT_CATE
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewStatCate implements Serializable {

    private static final long serialVersionUID=1L;

    private String statCate;

    private String statName;

    private Integer printOrder;


    public String getStatCate() {
        return statCate;
    }

    public void setStatCate(String statCate) {
        this.statCate = statCate;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public Integer getPrintOrder() {
        return printOrder;
    }

    public void setPrintOrder(Integer printOrder) {
        this.printOrder = printOrder;
    }

    @Override
    public String toString() {
        return "ViewStatCate{" +
        "statCate=" + statCate +
        ", statName=" + statName +
        ", printOrder=" + printOrder +
        "}";
    }
}
