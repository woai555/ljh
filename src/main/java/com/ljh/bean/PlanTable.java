package com.ljh.bean;

import java.math.BigDecimal;
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
public class PlanTable implements Serializable {

    private static final long serialVersionUID=1L;

    private String statementId;

    private LocalDateTime timestamp;

    private String remarks;

    private String operation;

    private String options;

    private String objectNode;

    private String objectOwner;

    private String objectName;

    private BigDecimal objectInstance;

    private String objectType;

    private String optimizer;

    private BigDecimal searchColumns;

    private BigDecimal id;

    private BigDecimal parentId;

    private BigDecimal position;

    private BigDecimal cost;

    private BigDecimal cardinality;

    private BigDecimal bytes;

    private String otherTag;

    private String partitionStart;

    private String partitionStop;

    private BigDecimal partitionId;

    private String other;

    private String distribution;


    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getObjectNode() {
        return objectNode;
    }

    public void setObjectNode(String objectNode) {
        this.objectNode = objectNode;
    }

    public String getObjectOwner() {
        return objectOwner;
    }

    public void setObjectOwner(String objectOwner) {
        this.objectOwner = objectOwner;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public BigDecimal getObjectInstance() {
        return objectInstance;
    }

    public void setObjectInstance(BigDecimal objectInstance) {
        this.objectInstance = objectInstance;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getOptimizer() {
        return optimizer;
    }

    public void setOptimizer(String optimizer) {
        this.optimizer = optimizer;
    }

    public BigDecimal getSearchColumns() {
        return searchColumns;
    }

    public void setSearchColumns(BigDecimal searchColumns) {
        this.searchColumns = searchColumns;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getParentId() {
        return parentId;
    }

    public void setParentId(BigDecimal parentId) {
        this.parentId = parentId;
    }

    public BigDecimal getPosition() {
        return position;
    }

    public void setPosition(BigDecimal position) {
        this.position = position;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCardinality() {
        return cardinality;
    }

    public void setCardinality(BigDecimal cardinality) {
        this.cardinality = cardinality;
    }

    public BigDecimal getBytes() {
        return bytes;
    }

    public void setBytes(BigDecimal bytes) {
        this.bytes = bytes;
    }

    public String getOtherTag() {
        return otherTag;
    }

    public void setOtherTag(String otherTag) {
        this.otherTag = otherTag;
    }

    public String getPartitionStart() {
        return partitionStart;
    }

    public void setPartitionStart(String partitionStart) {
        this.partitionStart = partitionStart;
    }

    public String getPartitionStop() {
        return partitionStop;
    }

    public void setPartitionStop(String partitionStop) {
        this.partitionStop = partitionStop;
    }

    public BigDecimal getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(BigDecimal partitionId) {
        this.partitionId = partitionId;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    @Override
    public String toString() {
        return "PlanTable{" +
        "statementId=" + statementId +
        ", timestamp=" + timestamp +
        ", remarks=" + remarks +
        ", operation=" + operation +
        ", options=" + options +
        ", objectNode=" + objectNode +
        ", objectOwner=" + objectOwner +
        ", objectName=" + objectName +
        ", objectInstance=" + objectInstance +
        ", objectType=" + objectType +
        ", optimizer=" + optimizer +
        ", searchColumns=" + searchColumns +
        ", id=" + id +
        ", parentId=" + parentId +
        ", position=" + position +
        ", cost=" + cost +
        ", cardinality=" + cardinality +
        ", bytes=" + bytes +
        ", otherTag=" + otherTag +
        ", partitionStart=" + partitionStart +
        ", partitionStop=" + partitionStop +
        ", partitionId=" + partitionId +
        ", other=" + other +
        ", distribution=" + distribution +
        "}";
    }
}
