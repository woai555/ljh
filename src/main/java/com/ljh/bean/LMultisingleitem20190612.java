package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class LMultisingleitem20190612 implements Serializable {

    private static final long serialVersionUID=1L;

    private String multiitemcode;

    private String itemcode;

    private Integer operatorid;

    private LocalDateTime modifydate;

    private Integer quantity;


    public String getMultiitemcode() {
        return multiitemcode;
    }

    public void setMultiitemcode(String multiitemcode) {
        this.multiitemcode = multiitemcode;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getModifydate() {
        return modifydate;
    }

    public void setModifydate(LocalDateTime modifydate) {
        this.modifydate = modifydate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "LMultisingleitem20190612{" +
        "multiitemcode=" + multiitemcode +
        ", itemcode=" + itemcode +
        ", operatorid=" + operatorid +
        ", modifydate=" + modifydate +
        ", quantity=" + quantity +
        "}";
    }
}
