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
public class OpBaseinfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "WIN_NAME", type = IdType.AUTO)
    private String winName;

    private String winComment;


    public String getWinName() {
        return winName;
    }

    public void setWinName(String winName) {
        this.winName = winName;
    }

    public String getWinComment() {
        return winComment;
    }

    public void setWinComment(String winComment) {
        this.winComment = winComment;
    }

    @Override
    public String toString() {
        return "OpBaseinfo{" +
        "winName=" + winName +
        ", winComment=" + winComment +
        "}";
    }
}
