package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 配药队列后备队列档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpddsqb implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 配药队列代码
     */
    @TableId(value = "QUE_CODE", type = IdType.AUTO)
    private Integer queCode;

    /**
     * 后备队列代码
     */
    private Integer queBkcd;


    public Integer getQueCode() {
        return queCode;
    }

    public void setQueCode(Integer queCode) {
        this.queCode = queCode;
    }

    public Integer getQueBkcd() {
        return queBkcd;
    }

    public void setQueBkcd(Integer queBkcd) {
        this.queBkcd = queBkcd;
    }

    @Override
    public String toString() {
        return "Mdpddsqb{" +
        "queCode=" + queCode +
        ", queBkcd=" + queBkcd +
        "}";
    }
}
