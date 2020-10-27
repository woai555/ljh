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
public class MInstitution implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "INST_ID", type = IdType.AUTO)
    private String instId;

    private String hdFlag;

    private String name;

    private String hostLevel;

    private String areaId;

    private String actionCode;


    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

    public String getHdFlag() {
        return hdFlag;
    }

    public void setHdFlag(String hdFlag) {
        this.hdFlag = hdFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHostLevel() {
        return hostLevel;
    }

    public void setHostLevel(String hostLevel) {
        this.hostLevel = hostLevel;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    @Override
    public String toString() {
        return "MInstitution{" +
        "instId=" + instId +
        ", hdFlag=" + hdFlag +
        ", name=" + name +
        ", hostLevel=" + hostLevel +
        ", areaId=" + areaId +
        ", actionCode=" + actionCode +
        "}";
    }
}
