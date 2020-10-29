package com.ljh.bean;

import com.alibaba.fastjson.annotation.JSONType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
@JSONType(orders = {"accessschid","remainNo","state"})
public class VAppRemainquery implements Serializable {

    private static final long serialVersionUID=1L;

    private String accessschid;

    private BigDecimal remainNo;

    private String state;


    public String getAccessschid() {
        return accessschid;
    }

    public void setAccessschid(String accessschid) {
        this.accessschid = accessschid;
    }


    public BigDecimal getRemainNo() {
        return remainNo;
    }

    public void setRemainNo(BigDecimal remainNo) {
        this.remainNo = remainNo;
    }



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "VAppRemainquery{" +
        "accessschid=" + accessschid +
        ", remain=" + remainNo +
        ", state=" + state +
        "}";
    }
}
