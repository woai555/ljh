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
public class LLinkresult implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MULTIITEMCODE", type = IdType.AUTO)
    private String multiitemcode;

    private String multiitemname;

    private String itemcode;

    private String itemname;

    private Integer sequence;


    public String getMultiitemcode() {
        return multiitemcode;
    }

    public void setMultiitemcode(String multiitemcode) {
        this.multiitemcode = multiitemcode;
    }

    public String getMultiitemname() {
        return multiitemname;
    }

    public void setMultiitemname(String multiitemname) {
        this.multiitemname = multiitemname;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        return "LLinkresult{" +
        "multiitemcode=" + multiitemcode +
        ", multiitemname=" + multiitemname +
        ", itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", sequence=" + sequence +
        "}";
    }
}
