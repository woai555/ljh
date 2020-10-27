package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 模板图标定义表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class PrIconSet implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ICONCODE", type = IdType.AUTO)
    private String iconcode;

    private String iconname;

    private String iconinfo;

    private BigDecimal orderid;

    private String back;

    private String operatorno;

    private LocalDateTime operatortime;


    public String getIconcode() {
        return iconcode;
    }

    public void setIconcode(String iconcode) {
        this.iconcode = iconcode;
    }

    public String getIconname() {
        return iconname;
    }

    public void setIconname(String iconname) {
        this.iconname = iconname;
    }

    public String getIconinfo() {
        return iconinfo;
    }

    public void setIconinfo(String iconinfo) {
        this.iconinfo = iconinfo;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getOperatorno() {
        return operatorno;
    }

    public void setOperatorno(String operatorno) {
        this.operatorno = operatorno;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "PrIconSet{" +
        "iconcode=" + iconcode +
        ", iconname=" + iconname +
        ", iconinfo=" + iconinfo +
        ", orderid=" + orderid +
        ", back=" + back +
        ", operatorno=" + operatorno +
        ", operatortime=" + operatortime +
        "}";
    }
}
