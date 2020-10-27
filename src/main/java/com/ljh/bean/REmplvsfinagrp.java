package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 人员财务组关系表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class REmplvsfinagrp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 财务组代码
     */
    private String finagrpid;

    /**
     * 财务组名称
     */
    private String finagrpname;

    /**
     * 人员代码
     */
    @TableId(value = "EMPL_CODE", type = IdType.AUTO)
    private String emplCode;


    public String getFinagrpid() {
        return finagrpid;
    }

    public void setFinagrpid(String finagrpid) {
        this.finagrpid = finagrpid;
    }

    public String getFinagrpname() {
        return finagrpname;
    }

    public void setFinagrpname(String finagrpname) {
        this.finagrpname = finagrpname;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    @Override
    public String toString() {
        return "REmplvsfinagrp{" +
        "finagrpid=" + finagrpid +
        ", finagrpname=" + finagrpname +
        ", emplCode=" + emplCode +
        "}";
    }
}
