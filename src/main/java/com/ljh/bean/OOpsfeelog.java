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
public class OOpsfeelog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "EXEC_SQN", type = IdType.AUTO)
    private String execSqn;

    private String itemcode;

    private BigDecimal itemfee;

    private String prescriptno;

    private BigDecimal patientroomid;

    private String inpatientno;

    private String patientid;

    private BigDecimal roomid;


    public String getExecSqn() {
        return execSqn;
    }

    public void setExecSqn(String execSqn) {
        this.execSqn = execSqn;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public BigDecimal getItemfee() {
        return itemfee;
    }

    public void setItemfee(BigDecimal itemfee) {
        this.itemfee = itemfee;
    }

    public String getPrescriptno() {
        return prescriptno;
    }

    public void setPrescriptno(String prescriptno) {
        this.prescriptno = prescriptno;
    }

    public BigDecimal getPatientroomid() {
        return patientroomid;
    }

    public void setPatientroomid(BigDecimal patientroomid) {
        this.patientroomid = patientroomid;
    }

    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public BigDecimal getRoomid() {
        return roomid;
    }

    public void setRoomid(BigDecimal roomid) {
        this.roomid = roomid;
    }

    @Override
    public String toString() {
        return "OOpsfeelog{" +
        "execSqn=" + execSqn +
        ", itemcode=" + itemcode +
        ", itemfee=" + itemfee +
        ", prescriptno=" + prescriptno +
        ", patientroomid=" + patientroomid +
        ", inpatientno=" + inpatientno +
        ", patientid=" + patientid +
        ", roomid=" + roomid +
        "}";
    }
}
