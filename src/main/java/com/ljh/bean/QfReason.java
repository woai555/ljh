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
public class QfReason implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "REASONID", type = IdType.AUTO)
    private String reasonid;

    private String reasonname;

    private Integer reasonswitch;


    public String getReasonid() {
        return reasonid;
    }

    public void setReasonid(String reasonid) {
        this.reasonid = reasonid;
    }

    public String getReasonname() {
        return reasonname;
    }

    public void setReasonname(String reasonname) {
        this.reasonname = reasonname;
    }

    public Integer getReasonswitch() {
        return reasonswitch;
    }

    public void setReasonswitch(Integer reasonswitch) {
        this.reasonswitch = reasonswitch;
    }

    @Override
    public String toString() {
        return "QfReason{" +
        "reasonid=" + reasonid +
        ", reasonname=" + reasonname +
        ", reasonswitch=" + reasonswitch +
        "}";
    }
}
