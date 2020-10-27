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
public class OpBaseinfoGroup implements Serializable {

    private static final long serialVersionUID=1L;

    private String winName;

    private String winComment;

    private String groupCode;

    private String groupName;

    private String operCode;

    private LocalDateTime operDate;

    /**
     * 父级代码
     */
    private String parentCode;


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

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    public String toString() {
        return "OpBaseinfoGroup{" +
        "winName=" + winName +
        ", winComment=" + winComment +
        ", groupCode=" + groupCode +
        ", groupName=" + groupName +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", parentCode=" + parentCode +
        "}";
    }
}
