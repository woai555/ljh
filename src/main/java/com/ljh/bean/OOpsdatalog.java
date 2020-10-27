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
public class OOpsdatalog implements Serializable {

    private static final long serialVersionUID=1L;

    private String execSqn;

    private Integer datatype;

    private String itemcode;

    private String itemname;

    private Integer operatorid;

    private LocalDateTime operatortime;


    public String getExecSqn() {
        return execSqn;
    }

    public void setExecSqn(String execSqn) {
        this.execSqn = execSqn;
    }

    public Integer getDatatype() {
        return datatype;
    }

    public void setDatatype(Integer datatype) {
        this.datatype = datatype;
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

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "OOpsdatalog{" +
        "execSqn=" + execSqn +
        ", datatype=" + datatype +
        ", itemcode=" + itemcode +
        ", itemname=" + itemname +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        "}";
    }
}
