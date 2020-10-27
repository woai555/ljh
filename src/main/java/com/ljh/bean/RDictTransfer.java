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
public class RDictTransfer implements Serializable {

    private static final long serialVersionUID=1L;

    private String tableSrc;

    private String tableDes;

    private String primKey;

    private LocalDateTime exeDate;

    private String flag;


    public String getTableSrc() {
        return tableSrc;
    }

    public void setTableSrc(String tableSrc) {
        this.tableSrc = tableSrc;
    }

    public String getTableDes() {
        return tableDes;
    }

    public void setTableDes(String tableDes) {
        this.tableDes = tableDes;
    }

    public String getPrimKey() {
        return primKey;
    }

    public void setPrimKey(String primKey) {
        this.primKey = primKey;
    }

    public LocalDateTime getExeDate() {
        return exeDate;
    }

    public void setExeDate(LocalDateTime exeDate) {
        this.exeDate = exeDate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "RDictTransfer{" +
        "tableSrc=" + tableSrc +
        ", tableDes=" + tableDes +
        ", primKey=" + primKey +
        ", exeDate=" + exeDate +
        ", flag=" + flag +
        "}";
    }
}
