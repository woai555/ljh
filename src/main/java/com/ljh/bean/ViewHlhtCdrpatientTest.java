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
public class ViewHlhtCdrpatientTest implements Serializable {

    private static final long serialVersionUID=1L;

    private String eid;

    private String outPatientId;

    private String inPatientId;

    private String inpNo;

    private String inNo;

    private String patientNo;

    private String healthCardNo;

    private String caseNo;

    private String msrNo;

    private String plsNo;

    private BigDecimal age;

    private String outpNo;

    private String cardNo;

    private String personName;

    private String aliasName;

    private String sex;

    private String sexDesc;

    private String dateOfBirth;

    private String identity;

    private String chargeType;

    private String insuranceType;

    private String birthPlace;

    private String indianosisCode;

    private String indianosisDesc;

    private String multiBirthInd;

    private String multiBirthOrder;

    private String deathInd;

    private String deathTime;

    private String maritalStatus;

    private String maritalStatusDesc;

    private String organDonorInd;

    private String disabilityCode;

    private String nation;

    private String nationDesc;

    private String nationality;

    private String nationalityDesc;

    private String religion;

    private String nativeProvince;

    private String language;

    private String degreeLevel;

    private String educationLevel;

    private String educationLevelDesc;

    private String politicsStatus;

    private String financialSituation;

    private String occupation;

    private String occupationDesc;

    private String workTime;

    private String idCardType;

    private String idCardNo;

    private String ssn;

    private String insuranceNo;

    private String businessPhonePhone;

    private String homePhone;

    private String otherPhone;

    private String mobile;

    private String postcode;

    private String email;

    private String mailingAddrProvinc;

    private String mailingAddrCity;

    private String mailingAddrCounty;

    private String mailingAddrStreet;

    private String mailingAddress;

    private String familyAddrProvince;

    private String familyAddrCity;

    private String familyAddrCounty;

    private String employerCompany;

    private String employerPostcode;

    private String employerAddress;

    private String nextOfKin;

    private String relationship;

    private String nextOfKinPhone;

    private String nextOfKinPost;

    private String nextOfKinAddr;

    private String bloodType;

    private String bloodTypeDesc;

    private String rhBlood;

    private String rhBloodDesc;

    private String confidentLevel;

    private String vipInd;

    private String registrationTime;

    private String lastVisitDate;

    private String hospitalNo;

    private String hospitalNoDesc;

    private String operateType;

    private LocalDateTime operatortime;


    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    public String getInPatientId() {
        return inPatientId;
    }

    public void setInPatientId(String inPatientId) {
        this.inPatientId = inPatientId;
    }

    public String getInpNo() {
        return inpNo;
    }

    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }

    public String getInNo() {
        return inNo;
    }

    public void setInNo(String inNo) {
        this.inNo = inNo;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getHealthCardNo() {
        return healthCardNo;
    }

    public void setHealthCardNo(String healthCardNo) {
        this.healthCardNo = healthCardNo;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getMsrNo() {
        return msrNo;
    }

    public void setMsrNo(String msrNo) {
        this.msrNo = msrNo;
    }

    public String getPlsNo() {
        return plsNo;
    }

    public void setPlsNo(String plsNo) {
        this.plsNo = plsNo;
    }

    public BigDecimal getAge() {
        return age;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public String getOutpNo() {
        return outpNo;
    }

    public void setOutpNo(String outpNo) {
        this.outpNo = outpNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSexDesc() {
        return sexDesc;
    }

    public void setSexDesc(String sexDesc) {
        this.sexDesc = sexDesc;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
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

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getIndianosisCode() {
        return indianosisCode;
    }

    public void setIndianosisCode(String indianosisCode) {
        this.indianosisCode = indianosisCode;
    }

    public String getIndianosisDesc() {
        return indianosisDesc;
    }

    public void setIndianosisDesc(String indianosisDesc) {
        this.indianosisDesc = indianosisDesc;
    }

    public String getMultiBirthInd() {
        return multiBirthInd;
    }

    public void setMultiBirthInd(String multiBirthInd) {
        this.multiBirthInd = multiBirthInd;
    }

    public String getMultiBirthOrder() {
        return multiBirthOrder;
    }

    public void setMultiBirthOrder(String multiBirthOrder) {
        this.multiBirthOrder = multiBirthOrder;
    }

    public String getDeathInd() {
        return deathInd;
    }

    public void setDeathInd(String deathInd) {
        this.deathInd = deathInd;
    }

    public String getDeathTime() {
        return deathTime;
    }

    public void setDeathTime(String deathTime) {
        this.deathTime = deathTime;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatusDesc() {
        return maritalStatusDesc;
    }

    public void setMaritalStatusDesc(String maritalStatusDesc) {
        this.maritalStatusDesc = maritalStatusDesc;
    }

    public String getOrganDonorInd() {
        return organDonorInd;
    }

    public void setOrganDonorInd(String organDonorInd) {
        this.organDonorInd = organDonorInd;
    }

    public String getDisabilityCode() {
        return disabilityCode;
    }

    public void setDisabilityCode(String disabilityCode) {
        this.disabilityCode = disabilityCode;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNationDesc() {
        return nationDesc;
    }

    public void setNationDesc(String nationDesc) {
        this.nationDesc = nationDesc;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalityDesc() {
        return nationalityDesc;
    }

    public void setNationalityDesc(String nationalityDesc) {
        this.nationalityDesc = nationalityDesc;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getNativeProvince() {
        return nativeProvince;
    }

    public void setNativeProvince(String nativeProvince) {
        this.nativeProvince = nativeProvince;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(String degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getEducationLevelDesc() {
        return educationLevelDesc;
    }

    public void setEducationLevelDesc(String educationLevelDesc) {
        this.educationLevelDesc = educationLevelDesc;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public String getFinancialSituation() {
        return financialSituation;
    }

    public void setFinancialSituation(String financialSituation) {
        this.financialSituation = financialSituation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupationDesc() {
        return occupationDesc;
    }

    public void setOccupationDesc(String occupationDesc) {
        this.occupationDesc = occupationDesc;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getBusinessPhonePhone() {
        return businessPhonePhone;
    }

    public void setBusinessPhonePhone(String businessPhonePhone) {
        this.businessPhonePhone = businessPhonePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMailingAddrProvinc() {
        return mailingAddrProvinc;
    }

    public void setMailingAddrProvinc(String mailingAddrProvinc) {
        this.mailingAddrProvinc = mailingAddrProvinc;
    }

    public String getMailingAddrCity() {
        return mailingAddrCity;
    }

    public void setMailingAddrCity(String mailingAddrCity) {
        this.mailingAddrCity = mailingAddrCity;
    }

    public String getMailingAddrCounty() {
        return mailingAddrCounty;
    }

    public void setMailingAddrCounty(String mailingAddrCounty) {
        this.mailingAddrCounty = mailingAddrCounty;
    }

    public String getMailingAddrStreet() {
        return mailingAddrStreet;
    }

    public void setMailingAddrStreet(String mailingAddrStreet) {
        this.mailingAddrStreet = mailingAddrStreet;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getFamilyAddrProvince() {
        return familyAddrProvince;
    }

    public void setFamilyAddrProvince(String familyAddrProvince) {
        this.familyAddrProvince = familyAddrProvince;
    }

    public String getFamilyAddrCity() {
        return familyAddrCity;
    }

    public void setFamilyAddrCity(String familyAddrCity) {
        this.familyAddrCity = familyAddrCity;
    }

    public String getFamilyAddrCounty() {
        return familyAddrCounty;
    }

    public void setFamilyAddrCounty(String familyAddrCounty) {
        this.familyAddrCounty = familyAddrCounty;
    }

    public String getEmployerCompany() {
        return employerCompany;
    }

    public void setEmployerCompany(String employerCompany) {
        this.employerCompany = employerCompany;
    }

    public String getEmployerPostcode() {
        return employerPostcode;
    }

    public void setEmployerPostcode(String employerPostcode) {
        this.employerPostcode = employerPostcode;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
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

    public String getNextOfKinPhone() {
        return nextOfKinPhone;
    }

    public void setNextOfKinPhone(String nextOfKinPhone) {
        this.nextOfKinPhone = nextOfKinPhone;
    }

    public String getNextOfKinPost() {
        return nextOfKinPost;
    }

    public void setNextOfKinPost(String nextOfKinPost) {
        this.nextOfKinPost = nextOfKinPost;
    }

    public String getNextOfKinAddr() {
        return nextOfKinAddr;
    }

    public void setNextOfKinAddr(String nextOfKinAddr) {
        this.nextOfKinAddr = nextOfKinAddr;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodTypeDesc() {
        return bloodTypeDesc;
    }

    public void setBloodTypeDesc(String bloodTypeDesc) {
        this.bloodTypeDesc = bloodTypeDesc;
    }

    public String getRhBlood() {
        return rhBlood;
    }

    public void setRhBlood(String rhBlood) {
        this.rhBlood = rhBlood;
    }

    public String getRhBloodDesc() {
        return rhBloodDesc;
    }

    public void setRhBloodDesc(String rhBloodDesc) {
        this.rhBloodDesc = rhBloodDesc;
    }

    public String getConfidentLevel() {
        return confidentLevel;
    }

    public void setConfidentLevel(String confidentLevel) {
        this.confidentLevel = confidentLevel;
    }

    public String getVipInd() {
        return vipInd;
    }

    public void setVipInd(String vipInd) {
        this.vipInd = vipInd;
    }

    public String getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(String lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public String getHospitalNo() {
        return hospitalNo;
    }

    public void setHospitalNo(String hospitalNo) {
        this.hospitalNo = hospitalNo;
    }

    public String getHospitalNoDesc() {
        return hospitalNoDesc;
    }

    public void setHospitalNoDesc(String hospitalNoDesc) {
        this.hospitalNoDesc = hospitalNoDesc;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    @Override
    public String toString() {
        return "ViewHlhtCdrpatientTest{" +
        "eid=" + eid +
        ", outPatientId=" + outPatientId +
        ", inPatientId=" + inPatientId +
        ", inpNo=" + inpNo +
        ", inNo=" + inNo +
        ", patientNo=" + patientNo +
        ", healthCardNo=" + healthCardNo +
        ", caseNo=" + caseNo +
        ", msrNo=" + msrNo +
        ", plsNo=" + plsNo +
        ", age=" + age +
        ", outpNo=" + outpNo +
        ", cardNo=" + cardNo +
        ", personName=" + personName +
        ", aliasName=" + aliasName +
        ", sex=" + sex +
        ", sexDesc=" + sexDesc +
        ", dateOfBirth=" + dateOfBirth +
        ", identity=" + identity +
        ", chargeType=" + chargeType +
        ", insuranceType=" + insuranceType +
        ", birthPlace=" + birthPlace +
        ", indianosisCode=" + indianosisCode +
        ", indianosisDesc=" + indianosisDesc +
        ", multiBirthInd=" + multiBirthInd +
        ", multiBirthOrder=" + multiBirthOrder +
        ", deathInd=" + deathInd +
        ", deathTime=" + deathTime +
        ", maritalStatus=" + maritalStatus +
        ", maritalStatusDesc=" + maritalStatusDesc +
        ", organDonorInd=" + organDonorInd +
        ", disabilityCode=" + disabilityCode +
        ", nation=" + nation +
        ", nationDesc=" + nationDesc +
        ", nationality=" + nationality +
        ", nationalityDesc=" + nationalityDesc +
        ", religion=" + religion +
        ", nativeProvince=" + nativeProvince +
        ", language=" + language +
        ", degreeLevel=" + degreeLevel +
        ", educationLevel=" + educationLevel +
        ", educationLevelDesc=" + educationLevelDesc +
        ", politicsStatus=" + politicsStatus +
        ", financialSituation=" + financialSituation +
        ", occupation=" + occupation +
        ", occupationDesc=" + occupationDesc +
        ", workTime=" + workTime +
        ", idCardType=" + idCardType +
        ", idCardNo=" + idCardNo +
        ", ssn=" + ssn +
        ", insuranceNo=" + insuranceNo +
        ", businessPhonePhone=" + businessPhonePhone +
        ", homePhone=" + homePhone +
        ", otherPhone=" + otherPhone +
        ", mobile=" + mobile +
        ", postcode=" + postcode +
        ", email=" + email +
        ", mailingAddrProvinc=" + mailingAddrProvinc +
        ", mailingAddrCity=" + mailingAddrCity +
        ", mailingAddrCounty=" + mailingAddrCounty +
        ", mailingAddrStreet=" + mailingAddrStreet +
        ", mailingAddress=" + mailingAddress +
        ", familyAddrProvince=" + familyAddrProvince +
        ", familyAddrCity=" + familyAddrCity +
        ", familyAddrCounty=" + familyAddrCounty +
        ", employerCompany=" + employerCompany +
        ", employerPostcode=" + employerPostcode +
        ", employerAddress=" + employerAddress +
        ", nextOfKin=" + nextOfKin +
        ", relationship=" + relationship +
        ", nextOfKinPhone=" + nextOfKinPhone +
        ", nextOfKinPost=" + nextOfKinPost +
        ", nextOfKinAddr=" + nextOfKinAddr +
        ", bloodType=" + bloodType +
        ", bloodTypeDesc=" + bloodTypeDesc +
        ", rhBlood=" + rhBlood +
        ", rhBloodDesc=" + rhBloodDesc +
        ", confidentLevel=" + confidentLevel +
        ", vipInd=" + vipInd +
        ", registrationTime=" + registrationTime +
        ", lastVisitDate=" + lastVisitDate +
        ", hospitalNo=" + hospitalNo +
        ", hospitalNoDesc=" + hospitalNoDesc +
        ", operateType=" + operateType +
        ", operatortime=" + operatortime +
        "}";
    }
}
