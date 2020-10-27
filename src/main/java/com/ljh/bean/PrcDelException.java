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
public class PrcDelException implements Serializable {

    private static final long serialVersionUID=1L;

    private String sqlerrtext;

    private LocalDateTime operDate;

    private String tableName;


    public String getSqlerrtext() {
        return sqlerrtext;
    }

    public void setSqlerrtext(String sqlerrtext) {
        this.sqlerrtext = sqlerrtext;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public String toString() {
        return "PrcDelException{" +
        "sqlerrtext=" + sqlerrtext +
        ", operDate=" + operDate +
        ", tableName=" + tableName +
        "}";
    }
}
