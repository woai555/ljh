package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 镜检常量表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class LCheckconstant implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MULTIITEMCODE", type = IdType.AUTO)
    private String multiitemcode;

    private String itembymancode;

    private Integer constantorder;

    private String constantname;

    private String operatorid;

    private LocalDateTime modifydate;


    public String getMultiitemcode() {
        return multiitemcode;
    }

    public void setMultiitemcode(String multiitemcode) {
        this.multiitemcode = multiitemcode;
    }

    public String getItembymancode() {
        return itembymancode;
    }

    public void setItembymancode(String itembymancode) {
        this.itembymancode = itembymancode;
    }

    public Integer getConstantorder() {
        return constantorder;
    }

    public void setConstantorder(Integer constantorder) {
        this.constantorder = constantorder;
    }

    public String getConstantname() {
        return constantname;
    }

    public void setConstantname(String constantname) {
        this.constantname = constantname;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getModifydate() {
        return modifydate;
    }

    public void setModifydate(LocalDateTime modifydate) {
        this.modifydate = modifydate;
    }

    @Override
    public String toString() {
        return "LCheckconstant{" +
        "multiitemcode=" + multiitemcode +
        ", itembymancode=" + itembymancode +
        ", constantorder=" + constantorder +
        ", constantname=" + constantname +
        ", operatorid=" + operatorid +
        ", modifydate=" + modifydate +
        "}";
    }
}
