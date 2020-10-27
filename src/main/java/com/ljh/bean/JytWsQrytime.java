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
public class JytWsQrytime implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "BEGIN_DATE", type = IdType.AUTO)
    private LocalDateTime beginDate;

    private LocalDateTime endDate;


    public LocalDateTime getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDateTime beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "JytWsQrytime{" +
        "beginDate=" + beginDate +
        ", endDate=" + endDate +
        "}";
    }
}
