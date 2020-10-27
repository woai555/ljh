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
public class LGroup implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "GROUPCODE", type = IdType.AUTO)
    private String groupcode;

    private String groupname;

    private String spell;

    private String branch;

    private String grouptype;

    private String operatorid;

    private LocalDateTime operatordate;


    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatordate() {
        return operatordate;
    }

    public void setOperatordate(LocalDateTime operatordate) {
        this.operatordate = operatordate;
    }

    @Override
    public String toString() {
        return "LGroup{" +
        "groupcode=" + groupcode +
        ", groupname=" + groupname +
        ", spell=" + spell +
        ", branch=" + branch +
        ", grouptype=" + grouptype +
        ", operatorid=" + operatorid +
        ", operatordate=" + operatordate +
        "}";
    }
}
