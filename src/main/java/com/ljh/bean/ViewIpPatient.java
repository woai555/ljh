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
public class ViewIpPatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientNo;

    private String name;

    private String sex;

    private LocalDateTime birthDate;

    private String patientClass;

    private String phoneNo;

    private String maritalStatus;

    private String occupationGroup;

    private String nationality;

    private String race;

    private String idType;

    private String idNo;

    private BigDecimal patientSource;

    private String occupation;

    private String occupationAddress;

    private String occupationTelno;

    private String pactCode;

    private String addressState;

    private String addressCity;

    private String addressDistrict;

    private String addressVillage;

    private String addressStreet;

    private String addressHouseNo;

    private String address;

    private String telnoAtAddress;

    private String addressZipCode;

    private String homeplaceState;

    private String homeplaceCity;

    private String homeplaceDistrict;

    private String homeplaceVillage;

    private String homeplaceStreet;

    private String homeplaceHouseNo;

    private String homeplaceAddress;

    private String telnoAtHomeplace;

    private String homeplaceZipCode;

    private String contactName;

    private String contactPhoneNo;

    private String cardNo;

    private String clinicNo;

    private String medicalRecordNo;

    private String mcardNo;

    private String jingMcardNo;

    private String barCode;

    private String jingCardNo;

    private String healthCardNo;

    private String healthRecordNo;


    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public String getPatientClass() {
        return patientClass;
    }

    public void setPatientClass(String patientClass) {
        this.patientClass = patientClass;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getOccupationGroup() {
        return occupationGroup;
    }

    public void setOccupationGroup(String occupationGroup) {
        this.occupationGroup = occupationGroup;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public BigDecimal getPatientSource() {
        return patientSource;
    }

    public void setPatientSource(BigDecimal patientSource) {
        this.patientSource = patientSource;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupationAddress() {
        return occupationAddress;
    }

    public void setOccupationAddress(String occupationAddress) {
        this.occupationAddress = occupationAddress;
    }

    public String getOccupationTelno() {
        return occupationTelno;
    }

    public void setOccupationTelno(String occupationTelno) {
        this.occupationTelno = occupationTelno;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressDistrict() {
        return addressDistrict;
    }

    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    public String getAddressVillage() {
        return addressVillage;
    }

    public void setAddressVillage(String addressVillage) {
        this.addressVillage = addressVillage;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressHouseNo() {
        return addressHouseNo;
    }

    public void setAddressHouseNo(String addressHouseNo) {
        this.addressHouseNo = addressHouseNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelnoAtAddress() {
        return telnoAtAddress;
    }

    public void setTelnoAtAddress(String telnoAtAddress) {
        this.telnoAtAddress = telnoAtAddress;
    }

    public String getAddressZipCode() {
        return addressZipCode;
    }

    public void setAddressZipCode(String addressZipCode) {
        this.addressZipCode = addressZipCode;
    }

    public String getHomeplaceState() {
        return homeplaceState;
    }

    public void setHomeplaceState(String homeplaceState) {
        this.homeplaceState = homeplaceState;
    }

    public String getHomeplaceCity() {
        return homeplaceCity;
    }

    public void setHomeplaceCity(String homeplaceCity) {
        this.homeplaceCity = homeplaceCity;
    }

    public String getHomeplaceDistrict() {
        return homeplaceDistrict;
    }

    public void setHomeplaceDistrict(String homeplaceDistrict) {
        this.homeplaceDistrict = homeplaceDistrict;
    }

    public String getHomeplaceVillage() {
        return homeplaceVillage;
    }

    public void setHomeplaceVillage(String homeplaceVillage) {
        this.homeplaceVillage = homeplaceVillage;
    }

    public String getHomeplaceStreet() {
        return homeplaceStreet;
    }

    public void setHomeplaceStreet(String homeplaceStreet) {
        this.homeplaceStreet = homeplaceStreet;
    }

    public String getHomeplaceHouseNo() {
        return homeplaceHouseNo;
    }

    public void setHomeplaceHouseNo(String homeplaceHouseNo) {
        this.homeplaceHouseNo = homeplaceHouseNo;
    }

    public String getHomeplaceAddress() {
        return homeplaceAddress;
    }

    public void setHomeplaceAddress(String homeplaceAddress) {
        this.homeplaceAddress = homeplaceAddress;
    }

    public String getTelnoAtHomeplace() {
        return telnoAtHomeplace;
    }

    public void setTelnoAtHomeplace(String telnoAtHomeplace) {
        this.telnoAtHomeplace = telnoAtHomeplace;
    }

    public String getHomeplaceZipCode() {
        return homeplaceZipCode;
    }

    public void setHomeplaceZipCode(String homeplaceZipCode) {
        this.homeplaceZipCode = homeplaceZipCode;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getMedicalRecordNo() {
        return medicalRecordNo;
    }

    public void setMedicalRecordNo(String medicalRecordNo) {
        this.medicalRecordNo = medicalRecordNo;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getJingMcardNo() {
        return jingMcardNo;
    }

    public void setJingMcardNo(String jingMcardNo) {
        this.jingMcardNo = jingMcardNo;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getJingCardNo() {
        return jingCardNo;
    }

    public void setJingCardNo(String jingCardNo) {
        this.jingCardNo = jingCardNo;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getHealthRecordNo() {
        return healthRecordNo;
    }

    public void setHealthRecordNo(String healthRecordNo) {
        this.healthRecordNo = healthRecordNo;
    }

    @Override
    public String toString() {
        return "ViewIpPatient{" +
        "patientNo=" + patientNo +
        ", name=" + name +
        ", sex=" + sex +
        ", birthDate=" + birthDate +
        ", patientClass=" + patientClass +
        ", phoneNo=" + phoneNo +
        ", maritalStatus=" + maritalStatus +
        ", occupationGroup=" + occupationGroup +
        ", nationality=" + nationality +
        ", race=" + race +
        ", idType=" + idType +
        ", idNo=" + idNo +
        ", patientSource=" + patientSource +
        ", occupation=" + occupation +
        ", occupationAddress=" + occupationAddress +
        ", occupationTelno=" + occupationTelno +
        ", pactCode=" + pactCode +
        ", addressState=" + addressState +
        ", addressCity=" + addressCity +
        ", addressDistrict=" + addressDistrict +
        ", addressVillage=" + addressVillage +
        ", addressStreet=" + addressStreet +
        ", addressHouseNo=" + addressHouseNo +
        ", address=" + address +
        ", telnoAtAddress=" + telnoAtAddress +
        ", addressZipCode=" + addressZipCode +
        ", homeplaceState=" + homeplaceState +
        ", homeplaceCity=" + homeplaceCity +
        ", homeplaceDistrict=" + homeplaceDistrict +
        ", homeplaceVillage=" + homeplaceVillage +
        ", homeplaceStreet=" + homeplaceStreet +
        ", homeplaceHouseNo=" + homeplaceHouseNo +
        ", homeplaceAddress=" + homeplaceAddress +
        ", telnoAtHomeplace=" + telnoAtHomeplace +
        ", homeplaceZipCode=" + homeplaceZipCode +
        ", contactName=" + contactName +
        ", contactPhoneNo=" + contactPhoneNo +
        ", cardNo=" + cardNo +
        ", clinicNo=" + clinicNo +
        ", medicalRecordNo=" + medicalRecordNo +
        ", mcardNo=" + mcardNo +
        ", jingMcardNo=" + jingMcardNo +
        ", barCode=" + barCode +
        ", jingCardNo=" + jingCardNo +
        ", healthCardNo=" + healthCardNo +
        ", healthRecordNo=" + healthRecordNo +
        "}";
    }
}
