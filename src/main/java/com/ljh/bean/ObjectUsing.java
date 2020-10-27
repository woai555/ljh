package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 并发控制表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ObjectUsing implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 对象数据
     */
    @TableId(value = "OBJECT_DATA", type = IdType.AUTO)
    private String objectData;

    /**
     * 对象名称
     */
    private String objectName;

    /**
     * 使用者（可能是部门，人等）
     */
    private String objectUser;

    /**
     * 所属表名
     */
    private String tableName;

    /**
     * 并发状态（0未使用）
     */
    private String objectStatus;

    /**
     * 操作人
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;

    /**
     * 备注
     */
    private String mark;


    public String getObjectData() {
        return objectData;
    }

    public void setObjectData(String objectData) {
        this.objectData = objectData;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectUser() {
        return objectUser;
    }

    public void setObjectUser(String objectUser) {
        this.objectUser = objectUser;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getObjectStatus() {
        return objectStatus;
    }

    public void setObjectStatus(String objectStatus) {
        this.objectStatus = objectStatus;
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

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "ObjectUsing{" +
        "objectData=" + objectData +
        ", objectName=" + objectName +
        ", objectUser=" + objectUser +
        ", tableName=" + tableName +
        ", objectStatus=" + objectStatus +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        ", mark=" + mark +
        "}";
    }
}
