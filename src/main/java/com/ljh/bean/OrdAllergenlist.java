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
public class OrdAllergenlist implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 1:药理学分类,ds_allergen_drug2:药品分类
     */
    private Integer allergentype;

    private String allergencode;

    private String allergenname;

    private String opercode;

    private LocalDateTime operdate;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getAllergentype() {
        return allergentype;
    }

    public void setAllergentype(Integer allergentype) {
        this.allergentype = allergentype;
    }

    public String getAllergencode() {
        return allergencode;
    }

    public void setAllergencode(String allergencode) {
        this.allergencode = allergencode;
    }

    public String getAllergenname() {
        return allergenname;
    }

    public void setAllergenname(String allergenname) {
        this.allergenname = allergenname;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    @Override
    public String toString() {
        return "OrdAllergenlist{" +
        "cardNo=" + cardNo +
        ", allergentype=" + allergentype +
        ", allergencode=" + allergencode +
        ", allergenname=" + allergenname +
        ", opercode=" + opercode +
        ", operdate=" + operdate +
        "}";
    }
}
