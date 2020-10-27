package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 手术用血申请表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpBlood implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "OPERATIONNO", type = IdType.AUTO)
    private String operationno;

    private String bloodno;

    private String bloodcode;

    private String personcode;

    private LocalDateTime usetime;

    /**
     * 0 申请状态  1 血已付
     */
    private String status;


    public String getOperationno() {
        return operationno;
    }

    public void setOperationno(String operationno) {
        this.operationno = operationno;
    }

    public String getBloodno() {
        return bloodno;
    }

    public void setBloodno(String bloodno) {
        this.bloodno = bloodno;
    }

    public String getBloodcode() {
        return bloodcode;
    }

    public void setBloodcode(String bloodcode) {
        this.bloodcode = bloodcode;
    }

    public String getPersoncode() {
        return personcode;
    }

    public void setPersoncode(String personcode) {
        this.personcode = personcode;
    }

    public LocalDateTime getUsetime() {
        return usetime;
    }

    public void setUsetime(LocalDateTime usetime) {
        this.usetime = usetime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OpBlood{" +
        "operationno=" + operationno +
        ", bloodno=" + bloodno +
        ", bloodcode=" + bloodcode +
        ", personcode=" + personcode +
        ", usetime=" + usetime +
        ", status=" + status +
        "}";
    }
}
