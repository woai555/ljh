package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病案整理合并表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmttoge implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 须合并住院号
     */
    @TableId(value = "TOG_DEPATIENTNO", type = IdType.AUTO)
    private String togDepatientno;

    /**
     * 合并后住院号
     */
    private String togRepatientno;

    /**
     * 就诊卡号
     */
    private String togCardno;

    /**
     * 病人姓名
     */
    private String togPname;

    /**
     * 性别
     */
    private String togSex;

    /**
     * 出生日期
     */
    private LocalDateTime togBirth;

    /**
     * 操作员代号
     */
    private String togOper;

    /**
     * 操作日期
     */
    private LocalDateTime togDate;


    public String getTogDepatientno() {
        return togDepatientno;
    }

    public void setTogDepatientno(String togDepatientno) {
        this.togDepatientno = togDepatientno;
    }

    public String getTogRepatientno() {
        return togRepatientno;
    }

    public void setTogRepatientno(String togRepatientno) {
        this.togRepatientno = togRepatientno;
    }

    public String getTogCardno() {
        return togCardno;
    }

    public void setTogCardno(String togCardno) {
        this.togCardno = togCardno;
    }

    public String getTogPname() {
        return togPname;
    }

    public void setTogPname(String togPname) {
        this.togPname = togPname;
    }

    public String getTogSex() {
        return togSex;
    }

    public void setTogSex(String togSex) {
        this.togSex = togSex;
    }

    public LocalDateTime getTogBirth() {
        return togBirth;
    }

    public void setTogBirth(LocalDateTime togBirth) {
        this.togBirth = togBirth;
    }

    public String getTogOper() {
        return togOper;
    }

    public void setTogOper(String togOper) {
        this.togOper = togOper;
    }

    public LocalDateTime getTogDate() {
        return togDate;
    }

    public void setTogDate(LocalDateTime togDate) {
        this.togDate = togDate;
    }

    @Override
    public String toString() {
        return "Mrmttoge{" +
        "togDepatientno=" + togDepatientno +
        ", togRepatientno=" + togRepatientno +
        ", togCardno=" + togCardno +
        ", togPname=" + togPname +
        ", togSex=" + togSex +
        ", togBirth=" + togBirth +
        ", togOper=" + togOper +
        ", togDate=" + togDate +
        "}";
    }
}
