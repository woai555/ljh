package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 发药天数
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class StorgeSetDays implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * OPER_CODE
     */
    private String operCode;

    /**
     * OPER_DTIME
     */
    @TableId(value = "OPER_DTIME", type = IdType.AUTO)
    private LocalDateTime operDtime;

    /**
     * CONS
     */
    private String cons;


    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDtime() {
        return operDtime;
    }

    public void setOperDtime(LocalDateTime operDtime) {
        this.operDtime = operDtime;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    @Override
    public String toString() {
        return "StorgeSetDays{" +
        "operCode=" + operCode +
        ", operDtime=" + operDtime +
        ", cons=" + cons +
        "}";
    }
}
