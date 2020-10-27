package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 划价、收费日期设置
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RCon implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 常数说明
     */
    private String name;

    /**
     * 允许收费天数
     */
    private Integer dates;

    /**
     * 当前标志
     */
    @TableId(value = "FLAG", type = IdType.AUTO)
    private String flag;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDates() {
        return dates;
    }

    public void setDates(Integer dates) {
        this.dates = dates;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "RCon{" +
        "name=" + name +
        ", dates=" + dates +
        ", flag=" + flag +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
