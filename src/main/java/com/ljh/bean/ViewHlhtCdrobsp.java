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
public class ViewHlhtCdrobsp implements Serializable {

    private static final long serialVersionUID=1L;

    private String outPatientId;

    private String healthCardNo;

    private String outpNo;

    private String visitId;

    private String visitType;

    private String rescueStartTime;

    private String rescueEndTime;

    private String rescueDoctor;

    private String rescueNurse;

    private String rescueResult;

    private String inObservationRoomTime;

    private String observationRoom;

    private String observeDoctor;

    private String outObservationRoomTime;

    private String observeOrder;

    private String orderDoctor;

    private String orderTime;

    private String operateType;

    private LocalDateTime inDate;

    private LocalDateTime operatortime;


    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getOutpNo() {
        return outpNo;
    }

    public void setOutpNo(String outpNo) {
        this.outpNo = outpNo;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getRescueStartTime() {
        return rescueStartTime;
    }

    public void setRescueStartTime(String rescueStartTime) {
        this.rescueStartTime = rescueStartTime;
    }

    public String getRescueEndTime() {
        return rescueEndTime;
    }

    public void setRescueEndTime(String rescueEndTime) {
        this.rescueEndTime = rescueEndTime;
    }

    public String getRescueDoctor() {
        return rescueDoctor;
    }

    public void setRescueDoctor(String rescueDoctor) {
        this.rescueDoctor = rescueDoctor;
    }

    public String getRescueNurse() {
        return rescueNurse;
    }

    public void setRescueNurse(String rescueNurse) {
        this.rescueNurse = rescueNurse;
    }

    public String getRescueResult() {
        return rescueResult;
    }

    public void setRescueResult(String rescueResult) {
        this.rescueResult = rescueResult;
    }

    public String getInObservationRoomTime() {
        return inObservationRoomTime;
    }

    public void setInObservationRoomTime(String inObservationRoomTime) {
        this.inObservationRoomTime = inObservationRoomTime;
    }

    public String getObservationRoom() {
        return observationRoom;
    }

    public void setObservationRoom(String observationRoom) {
        this.observationRoom = observationRoom;
    }

    public String getObserveDoctor() {
        return observeDoctor;
    }

    public void setObserveDoctor(String observeDoctor) {
        this.observeDoctor = observeDoctor;
    }

    public String getOutObservationRoomTime() {
        return outObservationRoomTime;
    }

    public void setOutObservationRoomTime(String outObservationRoomTime) {
        this.outObservationRoomTime = outObservationRoomTime;
    }

    public String getObserveOrder() {
        return observeOrder;
    }

    public void setObserveOrder(String observeOrder) {
        this.observeOrder = observeOrder;
    }

    public String getOrderDoctor() {
        return orderDoctor;
    }

    public void setOrderDoctor(String orderDoctor) {
        this.orderDoctor = orderDoctor;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrobsp{" +
        "outPatientId=" + outPatientId +
        ", healthCardNo=" + healthCardNo +
        ", outpNo=" + outpNo +
        ", visitId=" + visitId +
        ", visitType=" + visitType +
        ", rescueStartTime=" + rescueStartTime +
        ", rescueEndTime=" + rescueEndTime +
        ", rescueDoctor=" + rescueDoctor +
        ", rescueNurse=" + rescueNurse +
        ", rescueResult=" + rescueResult +
        ", inObservationRoomTime=" + inObservationRoomTime +
        ", observationRoom=" + observationRoom +
        ", observeDoctor=" + observeDoctor +
        ", outObservationRoomTime=" + outObservationRoomTime +
        ", observeOrder=" + observeOrder +
        ", orderDoctor=" + orderDoctor +
        ", orderTime=" + orderTime +
        ", operateType=" + operateType +
        ", inDate=" + inDate +
        ", operatortime=" + operatortime +
        "}";
    }
}
