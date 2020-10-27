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
public class OrdSeedoctrecordExtend implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "SEE_NO", type = IdType.AUTO)
    private String seeNo;

    private String category;

    private BigDecimal itemId;

    private String itemName;

    private String checked;


    public String getSeeNo() {
        return seeNo;
    }

    public void setSeeNo(String seeNo) {
        this.seeNo = seeNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getItemId() {
        return itemId;
    }

    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "OrdSeedoctrecordExtend{" +
        "seeNo=" + seeNo +
        ", category=" + category +
        ", itemId=" + itemId +
        ", itemName=" + itemName +
        ", checked=" + checked +
        "}";
    }
}
