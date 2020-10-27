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
public class ViewJhDzblRegister implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientId;

    private String inpNo;

    private String name;

    private String namePhonetic;

    private String sex;

    private LocalDateTime dateOfBirth;

    private String birthPlace;

    private String citizenship;

    private String nation;

    private String idNo;

    private String identity;

    private String pChargeType;

    private String phoneNumberHome;

    private String phoneNumberBusiness;

    private String jiguan;

    private String homeZip;

    private String homeCode;

    private String hospitalNo;

    private BigDecimal visitId;

    private String registerTypeCode;

    private LocalDateTime visitDate;

    private Integer hisRegisterPk;

    private LocalDateTime registerDate;

    private String treatmentTime;

    private BigDecimal treatmentNo;

    private String visitDept;

    private String arrivalTime;

    private String doctorInCharge;

    private BigDecimal age;

    private String chargeType;

    private String insuranceType;

    private String insuranceNo;

    private String occupation;

    private String serviceAgency;

    private String mailingAddress;

    private String zipCode;

    private String nextOfKin;

    private String relationship;

    private String nextOfKinAddr;

    private String nextOfKinZipcode;

    private String nextOfKinPhone;

    private String clinicRoomId;

    private String clinicChairId;

    private BigDecimal bodyWeight;

    private BigDecimal bodyHeight;

    private String health;

    private LocalDateTime startPerformTime;

    private LocalDateTime finishPerformTime;

    private String nextOfKinIdNo;

    private String hisVisitId;

    private BigDecimal testFlag;

    private BigDecimal treateStatus;

    private String doctorInCheck;

    private String hocusDiagFlag;

    private String registerTypeId;

    private String visitFlag;


    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getInpNo() {
        return inpNo;
    }

    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePhonetic() {
        return namePhonetic;
    }

    public void setNamePhonetic(String namePhonetic) {
        this.namePhonetic = namePhonetic;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getpChargeType() {
        return pChargeType;
    }

    public void setpChargeType(String pChargeType) {
        this.pChargeType = pChargeType;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public void setPhoneNumberHome(String phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public String getPhoneNumberBusiness() {
        return phoneNumberBusiness;
    }

    public void setPhoneNumberBusiness(String phoneNumberBusiness) {
        this.phoneNumberBusiness = phoneNumberBusiness;
    }

    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    public String getHomeZip() {
        return homeZip;
    }

    public void setHomeZip(String homeZip) {
        this.homeZip = homeZip;
    }

    public String getHomeCode() {
        return homeCode;
    }

    public void setHomeCode(String homeCode) {
        this.homeCode = homeCode;
    }

    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public BigDecimal getVisitId() {
        return visitId;
    }

    public void setVisitId(BigDecimal visitId) {
        this.visitId = visitId;
    }

    public String getRegisterTypeCode() {
        return registerTypeCode;
    }

    public void setRegisterTypeCode(String registerTypeCode) {
        this.registerTypeCode = registerTypeCode;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public Integer getHisRegisterPk() {
        return hisRegisterPk;
    }

    public void setHisRegisterPk(Integer hisRegisterPk) {
        this.hisRegisterPk = hisRegisterPk;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public String getTreatmentTime() {
        return treatmentTime;
    }

    public void setTreatmentTime(String treatmentTime) {
        this.treatmentTime = treatmentTime;
    }

    public BigDecimal getTreatmentNo() {
        return treatmentNo;
    }

    public void setTreatmentNo(BigDecimal treatmentNo) {
        this.treatmentNo = treatmentNo;
    }

    public String getVisitDept() {
        return visitDept;
    }

    public void setVisitDept(String visitDept) {
        this.visitDept = visitDept;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDoctorInCharge() {
        return doctorInCharge;
    }

    public void setDoctorInCharge(String doctorInCharge) {
        this.doctorInCharge = doctorInCharge;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getServiceAgency() {
        return serviceAgency;
    }

    public void setServiceAgency(String serviceAgency) {
        this.serviceAgency = serviceAgency;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getNextOfKinAddr() {
        return nextOfKinAddr;
    }

    public void setNextOfKinAddr(String nextOfKinAddr) {
        this.nextOfKinAddr = nextOfKinAddr;
    }

    public String getNextOfKinZipcode() {
        return nextOfKinZipcode;
    }

    public void setNextOfKinZipcode(String nextOfKinZipcode) {
        this.nextOfKinZipcode = nextOfKinZipcode;
    }

    public String getNextOfKinPhone() {
        return nextOfKinPhone;
    }

    public void setNextOfKinPhone(String nextOfKinPhone) {
        this.nextOfKinPhone = nextOfKinPhone;
    }

    public String getClinicRoomId() {
        return clinicRoomId;
    }

    public void setClinicRoomId(String clinicRoomId) {
        this.clinicRoomId = clinicRoomId;
    }

    public String getClinicChairId() {
        return clinicChairId;
    }

    public void setClinicChairId(String clinicChairId) {
        this.clinicChairId = clinicChairId;
    }

    public BigDecimal getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(BigDecimal bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public BigDecimal getBodyHeight() {
        return bodyHeight;
    }

    public void setBodyHeight(BigDecimal bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public LocalDateTime getStartPerformTime() {
        return startPerformTime;
    }

    public void setStartPerformTime(LocalDateTime startPerformTime) {
        this.startPerformTime = startPerformTime;
    }

    public LocalDateTime getFinishPerformTime() {
        return finishPerformTime;
    }

    public void setFinishPerformTime(LocalDateTime finishPerformTime) {
        this.finishPerformTime = finishPerformTime;
    }

    public String getNextOfKinIdNo() {
        return nextOfKinIdNo;
    }

    public void setNextOfKinIdNo(String nextOfKinIdNo) {
        this.nextOfKinIdNo = nextOfKinIdNo;
    }

    public String getHisVisitId() {
        return hisVisitId;
    }

    public void setHisVisitId(String hisVisitId) {
        this.hisVisitId = hisVisitId;
    }

    public BigDecimal getTestFlag() {
        return testFlag;
    }

    public void setTestFlag(BigDecimal testFlag) {
        this.testFlag = testFlag;
    }

    public BigDecimal getTreateStatus() {
        return treateStatus;
    }

    public void setTreateStatus(BigDecimal treateStatus) {
        this.treateStatus = treateStatus;
    }

    public String getDoctorInCheck() {
        return doctorInCheck;
    }

    public void setDoctorInCheck(String doctorInCheck) {
        this.doctorInCheck = doctorInCheck;
    }

    public String getHocusDiagFlag() {
        return hocusDiagFlag;
    }

    public void setHocusDiagFlag(String hocusDiagFlag) {
        this.hocusDiagFlag = hocusDiagFlag;
    }

    public String getRegisterTypeId() {
        return registerTypeId;
    }

    public void setRegisterTypeId(String registerTypeId) {
        this.registerTypeId = registerTypeId;
    }

    public String getVisitFlag() {
        return visitFlag;
    }

    public void setVisitFlag(String visitFlag) {
        this.visitFlag = visitFlag;
    }

    @Override
    public String toString() {
        return "ViewJhDzblRegister{" +
        "patientId=" + patientId +
        ", inpNo=" + inpNo +
        ", name=" + name +
        ", namePhonetic=" + namePhonetic +
        ", sex=" + sex +
        ", dateOfBirth=" + dateOfBirth +
        ", birthPlace=" + birthPlace +
        ", citizenship=" + citizenship +
        ", nation=" + nation +
        ", idNo=" + idNo +
        ", identity=" + identity +
        ", pChargeType=" + pChargeType +
        ", phoneNumberHome=" + phoneNumberHome +
        ", phoneNumberBusiness=" + phoneNumberBusiness +
        ", jiguan=" + jiguan +
        ", homeZip=" + homeZip +
        ", homeCode=" + homeCode +
        ", hospitalNo=" + hospitalNo +
        ", visitId=" + visitId +
        ", registerTypeCode=" + registerTypeCode +
        ", visitDate=" + visitDate +
        ", hisRegisterPk=" + hisRegisterPk +
        ", registerDate=" + registerDate +
        ", treatmentTime=" + treatmentTime +
        ", treatmentNo=" + treatmentNo +
        ", visitDept=" + visitDept +
        ", arrivalTime=" + arrivalTime +
        ", doctorInCharge=" + doctorInCharge +
        ", age=" + age +
        ", chargeType=" + chargeType +
        ", insuranceType=" + insuranceType +
        ", insuranceNo=" + insuranceNo +
        ", occupation=" + occupation +
        ", serviceAgency=" + serviceAgency +
        ", mailingAddress=" + mailingAddress +
        ", zipCode=" + zipCode +
        ", nextOfKin=" + nextOfKin +
        ", relationship=" + relationship +
        ", nextOfKinAddr=" + nextOfKinAddr +
        ", nextOfKinZipcode=" + nextOfKinZipcode +
        ", nextOfKinPhone=" + nextOfKinPhone +
        ", clinicRoomId=" + clinicRoomId +
        ", clinicChairId=" + clinicChairId +
        ", bodyWeight=" + bodyWeight +
        ", bodyHeight=" + bodyHeight +
        ", health=" + health +
        ", startPerformTime=" + startPerformTime +
        ", finishPerformTime=" + finishPerformTime +
        ", nextOfKinIdNo=" + nextOfKinIdNo +
        ", hisVisitId=" + hisVisitId +
        ", testFlag=" + testFlag +
        ", treateStatus=" + treateStatus +
        ", doctorInCheck=" + doctorInCheck +
        ", hocusDiagFlag=" + hocusDiagFlag +
        ", registerTypeId=" + registerTypeId +
        ", visitFlag=" + visitFlag +
        "}";
    }
}
