package com.ljh.bean;

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
public class ViewMjLevel implements Serializable {

    private static final long serialVersionUID=1L;

    private String levelcode;

    private String levelname;


    public String getLevelcode() {
        return levelcode;
    }

    public void setLevelcode(String levelcode) {
        this.levelcode = levelcode;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    @Override
    public String toString() {
        return "ViewMjLevel{" +
        "levelcode=" + levelcode +
        ", levelname=" + levelname +
        "}";
    }
}
