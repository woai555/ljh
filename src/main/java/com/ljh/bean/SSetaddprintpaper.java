package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病历打印附页设置
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class SSetaddprintpaper implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 列名
     */
    private String itemname;

    /**
     * 列文字显示
     */
    private String itemtext;

    /**
     * 列文字类别
     */
    private String texttype;

    /**
     * 备注信息
     */
    private String remark;


    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemtext() {
        return itemtext;
    }

    public void setItemtext(String itemtext) {
        this.itemtext = itemtext;
    }

    public String getTexttype() {
        return texttype;
    }

    public void setTexttype(String texttype) {
        this.texttype = texttype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "SSetaddprintpaper{" +
        "itemname=" + itemname +
        ", itemtext=" + itemtext +
        ", texttype=" + texttype +
        ", remark=" + remark +
        "}";
    }
}
