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
public class VJhInmaininfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientNo;

    private String patientNo;

    private String cardNo;

    private String name;

    private String sex;

    private LocalDateTime birthday;

    private BigDecimal height;

    private BigDecimal weight;

    private String bloodCode;

    private String hepatitisFlag;

    private String anaphyFlag;

    private LocalDateTime inDate;

    private String deptCode;

    private String deptName;

    private String sdeptCode;

    private String sdeptName;

    private String paykindCode;

    private String pactCode;

    private String pactName;

    private Integer rebateRate;

    private String bedNo;

    private String nurseCellCode;

    private String nurseCellName;

    private String houseDocCode;

    private String houseDocName;

    private String chargeDocCode;

    private String chargeDocName;

    private String chiefDocCode;

    private String chiefDocName;

    private String dutyNurseCode;

    private String dutyNurseName;

    private LocalDateTime operDtime;

    private String operCode;

    private String inCircs;

    private String inAvenue;

    private String inSource;

    private Integer inTimes;

    private LocalDateTime endDate;

    private LocalDateTime balanceDate;

    private BigDecimal prepayCost;

    private BigDecimal totCost;

    private BigDecimal ownCost;

    private BigDecimal payCost;

    private BigDecimal pubCost;

    private BigDecimal freeCost;

    private String babyFlag;

    private String derateFlag;

    private LocalDateTime docAdvicedate;

    private String inState;

    private LocalDateTime prepayOutdate;

    private Integer happenNo;

    private Integer balanceNo;

    private String idenno;

    private String profCode;

    private String workName;

    private String workTel;

    private String workZip;

    private String home;

    private String homeTel;

    private String homeZip;

    private String dist;

    private String birthArea;

    private String nationCode;

    private String linkmaName;

    private String linkmanTel;

    private String linkmanAdd;

    private String relaCode;

    private String mari;

    private String counCode;

    private String personageFlag;

    private String xy;

    private String mcardNo;

    private String stopAcount;

    private LocalDateTime outDate;

    private BigDecimal dressDeposit;

    private String dressNo;

    private String zg;

    private String cautioner;

    private BigDecimal money;

    private String caseFlag;

    private BigDecimal moneyAlert;

    private String emplCode;

    private String medicalType;

    private BigDecimal derateCost;

    private BigDecimal balancePrepay;

    private BigDecimal balanceCost;

    private String inIcu;

    private String practiceDocCode;

    private String practiceDocName;

    private String noviciateDocCode;

    private String noviciateDocName;

    private String convoyNrsCode;

    private String convoyNrsName;

    private String convoyToolCode;

    private String convoyToolName;

    private BigDecimal debzCost;

    private BigDecimal gwyCost;

    private LocalDateTime regDate;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode;
    }

    public String getHepatitisFlag() {
        return hepatitisFlag;
    }

    public void setHepatitisFlag(String hepatitisFlag) {
        this.hepatitisFlag = hepatitisFlag;
    }

    public String getAnaphyFlag() {
        return anaphyFlag;
    }

    public void setAnaphyFlag(String anaphyFlag) {
        this.anaphyFlag = anaphyFlag;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSdeptCode() {
        return sdeptCode;
    }

    public void setSdeptCode(String sdeptCode) {
        this.sdeptCode = sdeptCode;
    }

    public String getSdeptName() {
        return sdeptName;
    }

    public void setSdeptName(String sdeptName) {
        this.sdeptName = sdeptName;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getPactName() {
        return pactName;
    }

    public void setPactName(String pactName) {
        this.pactName = pactName;
    }

    public Integer getRebateRate() {
        return rebateRate;
    }

    public void setRebateRate(Integer rebateRate) {
        this.rebateRate = rebateRate;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getNurseCellCode() {
        return nurseCellCode;
    }

    public void setNurseCellCode(String nurseCellCode) {
        this.nurseCellCode = nurseCellCode;
    }

    public String getNurseCellName() {
        return nurseCellName;
    }

    public void setNurseCellName(String nurseCellName) {
        this.nurseCellName = nurseCellName;
    }

    public String getHouseDocCode() {
        return houseDocCode;
    }

    public void setHouseDocCode(String houseDocCode) {
        this.houseDocCode = houseDocCode;
    }

    public String getHouseDocName() {
        return houseDocName;
    }

    public void setHouseDocName(String houseDocName) {
        this.houseDocName = houseDocName;
    }

    public String getChargeDocCode() {
        return chargeDocCode;
    }

    public void setChargeDocCode(String chargeDocCode) {
        this.chargeDocCode = chargeDocCode;
    }

    public String getChargeDocName() {
        return chargeDocName;
    }

    public void setChargeDocName(String chargeDocName) {
        this.chargeDocName = chargeDocName;
    }

    public String getChiefDocCode() {
        return chiefDocCode;
    }

    public void setChiefDocCode(String chiefDocCode) {
        this.chiefDocCode = chiefDocCode;
    }

    public String getChiefDocName() {
        return chiefDocName;
    }

    public void setChiefDocName(String chiefDocName) {
        this.chiefDocName = chiefDocName;
    }

    public String getDutyNurseCode() {
        return dutyNurseCode;
    }

    public void setDutyNurseCode(String dutyNurseCode) {
        this.dutyNurseCode = dutyNurseCode;
    }

    public String getDutyNurseName() {
        return dutyNurseName;
    }

    public void setDutyNurseName(String dutyNurseName) {
        this.dutyNurseName = dutyNurseName;
    }

    public LocalDateTime getOperDtime() {
        return operDtime;
    }

    public void setOperDtime(LocalDateTime operDtime) {
        this.operDtime = operDtime;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getInCircs() {
        return inCircs;
    }

    public void setInCircs(String inCircs) {
        this.inCircs = inCircs;
    }

    public String getInAvenue() {
        return inAvenue;
    }

    public void setInAvenue(String inAvenue) {
        this.inAvenue = inAvenue;
    }

    public String getInSource() {
        return inSource;
    }

    public void setInSource(String inSource) {
        this.inSource = inSource;
    }

    public Integer getInTimes() {
        return inTimes;
    }

    public void setInTimes(Integer inTimes) {
        this.inTimes = inTimes;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(LocalDateTime balanceDate) {
        this.balanceDate = balanceDate;
    }

    public BigDecimal getPrepayCost() {
        return prepayCost;
    }

    public void setPrepayCost(BigDecimal prepayCost) {
        this.prepayCost = prepayCost;
    }

    public BigDecimal getTotCost() {
        return totCost;
    }

    public void setTotCost(BigDecimal totCost) {
        this.totCost = totCost;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getFreeCost() {
        return freeCost;
    }

    public void setFreeCost(BigDecimal freeCost) {
        this.freeCost = freeCost;
    }

    public String getBabyFlag() {
        return babyFlag;
    }

    public void setBabyFlag(String babyFlag) {
        this.babyFlag = babyFlag;
    }

    public String getDerateFlag() {
        return derateFlag;
    }

    public void setDerateFlag(String derateFlag) {
        this.derateFlag = derateFlag;
    }

    public LocalDateTime getDocAdvicedate() {
        return docAdvicedate;
    }

    public void setDocAdvicedate(LocalDateTime docAdvicedate) {
        this.docAdvicedate = docAdvicedate;
    }

    public String getInState() {
        return inState;
    }

    public void setInState(String inState) {
        this.inState = inState;
    }

    public LocalDateTime getPrepayOutdate() {
        return prepayOutdate;
    }

    public void setPrepayOutdate(LocalDateTime prepayOutdate) {
        this.prepayOutdate = prepayOutdate;
    }

    public Integer getHappenNo() {
        return happenNo;
    }

    public void setHappenNo(Integer happenNo) {
        this.happenNo = happenNo;
    }

    public Integer getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(Integer balanceNo) {
        this.balanceNo = balanceNo;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    public String getWorkZip() {
        return workZip;
    }

    public void setWorkZip(String workZip) {
        this.workZip = workZip;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getHomeZip() {
        return homeZip;
    }

    public void setHomeZip(String homeZip) {
        this.homeZip = homeZip;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getBirthArea() {
        return birthArea;
    }

    public void setBirthArea(String birthArea) {
        this.birthArea = birthArea;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getLinkmaName() {
        return linkmaName;
    }

    public void setLinkmaName(String linkmaName) {
        this.linkmaName = linkmaName;
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }

    public String getLinkmanAdd() {
        return linkmanAdd;
    }

    public void setLinkmanAdd(String linkmanAdd) {
        this.linkmanAdd = linkmanAdd;
    }

    public String getRelaCode() {
        return relaCode;
    }

    public void setRelaCode(String relaCode) {
        this.relaCode = relaCode;
    }

    public String getMari() {
        return mari;
    }

    public void setMari(String mari) {
        this.mari = mari;
    }

    public String getCounCode() {
        return counCode;
    }

    public void setCounCode(String counCode) {
        this.counCode = counCode;
    }

    public String getPersonageFlag() {
        return personageFlag;
    }

    public void setPersonageFlag(String personageFlag) {
        this.personageFlag = personageFlag;
    }

    public String getXy() {
        return xy;
    }

    public void setXy(String xy) {
        this.xy = xy;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getStopAcount() {
        return stopAcount;
    }

    public void setStopAcount(String stopAcount) {
        this.stopAcount = stopAcount;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public BigDecimal getDressDeposit() {
        return dressDeposit;
    }

    public void setDressDeposit(BigDecimal dressDeposit) {
        this.dressDeposit = dressDeposit;
    }

    public String getDressNo() {
        return dressNo;
    }

    public void setDressNo(String dressNo) {
        this.dressNo = dressNo;
    }

    public String getZg() {
        return zg;
    }

    public void setZg(String zg) {
        this.zg = zg;
    }

    public String getCautioner() {
        return cautioner;
    }

    public void setCautioner(String cautioner) {
        this.cautioner = cautioner;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getCaseFlag() {
        return caseFlag;
    }

    public void setCaseFlag(String caseFlag) {
        this.caseFlag = caseFlag;
    }

    public BigDecimal getMoneyAlert() {
        return moneyAlert;
    }

    public void setMoneyAlert(BigDecimal moneyAlert) {
        this.moneyAlert = moneyAlert;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType;
    }

    public BigDecimal getDerateCost() {
        return derateCost;
    }

    public void setDerateCost(BigDecimal derateCost) {
        this.derateCost = derateCost;
    }

    public BigDecimal getBalancePrepay() {
        return balancePrepay;
    }

    public void setBalancePrepay(BigDecimal balancePrepay) {
        this.balancePrepay = balancePrepay;
    }

    public BigDecimal getBalanceCost() {
        return balanceCost;
    }

    public void setBalanceCost(BigDecimal balanceCost) {
        this.balanceCost = balanceCost;
    }

    public String getInIcu() {
        return inIcu;
    }

    public void setInIcu(String inIcu) {
        this.inIcu = inIcu;
    }

    public String getPracticeDocCode() {
        return practiceDocCode;
    }

    public void setPracticeDocCode(String practiceDocCode) {
        this.practiceDocCode = practiceDocCode;
    }

    public String getPracticeDocName() {
        return practiceDocName;
    }

    public void setPracticeDocName(String practiceDocName) {
        this.practiceDocName = practiceDocName;
    }

    public String getNoviciateDocCode() {
        return noviciateDocCode;
    }

    public void setNoviciateDocCode(String noviciateDocCode) {
        this.noviciateDocCode = noviciateDocCode;
    }

    public String getNoviciateDocName() {
        return noviciateDocName;
    }

    public void setNoviciateDocName(String noviciateDocName) {
        this.noviciateDocName = noviciateDocName;
    }

    public String getConvoyNrsCode() {
        return convoyNrsCode;
    }

    public void setConvoyNrsCode(String convoyNrsCode) {
        this.convoyNrsCode = convoyNrsCode;
    }

    public String getConvoyNrsName() {
        return convoyNrsName;
    }

    public void setConvoyNrsName(String convoyNrsName) {
        this.convoyNrsName = convoyNrsName;
    }

    public String getConvoyToolCode() {
        return convoyToolCode;
    }

    public void setConvoyToolCode(String convoyToolCode) {
        this.convoyToolCode = convoyToolCode;
    }

    public String getConvoyToolName() {
        return convoyToolName;
    }

    public void setConvoyToolName(String convoyToolName) {
        this.convoyToolName = convoyToolName;
    }

    public BigDecimal getDebzCost() {
        return debzCost;
    }

    public void setDebzCost(BigDecimal debzCost) {
        this.debzCost = debzCost;
    }

    public BigDecimal getGwyCost() {
        return gwyCost;
    }

    public void setGwyCost(BigDecimal gwyCost) {
        this.gwyCost = gwyCost;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "VJhInmaininfo{" +
        "inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", height=" + height +
        ", weight=" + weight +
        ", bloodCode=" + bloodCode +
        ", hepatitisFlag=" + hepatitisFlag +
        ", anaphyFlag=" + anaphyFlag +
        ", inDate=" + inDate +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", sdeptCode=" + sdeptCode +
        ", sdeptName=" + sdeptName +
        ", paykindCode=" + paykindCode +
        ", pactCode=" + pactCode +
        ", pactName=" + pactName +
        ", rebateRate=" + rebateRate +
        ", bedNo=" + bedNo +
        ", nurseCellCode=" + nurseCellCode +
        ", nurseCellName=" + nurseCellName +
        ", houseDocCode=" + houseDocCode +
        ", houseDocName=" + houseDocName +
        ", chargeDocCode=" + chargeDocCode +
        ", chargeDocName=" + chargeDocName +
        ", chiefDocCode=" + chiefDocCode +
        ", chiefDocName=" + chiefDocName +
        ", dutyNurseCode=" + dutyNurseCode +
        ", dutyNurseName=" + dutyNurseName +
        ", operDtime=" + operDtime +
        ", operCode=" + operCode +
        ", inCircs=" + inCircs +
        ", inAvenue=" + inAvenue +
        ", inSource=" + inSource +
        ", inTimes=" + inTimes +
        ", endDate=" + endDate +
        ", balanceDate=" + balanceDate +
        ", prepayCost=" + prepayCost +
        ", totCost=" + totCost +
        ", ownCost=" + ownCost +
        ", payCost=" + payCost +
        ", pubCost=" + pubCost +
        ", freeCost=" + freeCost +
        ", babyFlag=" + babyFlag +
        ", derateFlag=" + derateFlag +
        ", docAdvicedate=" + docAdvicedate +
        ", inState=" + inState +
        ", prepayOutdate=" + prepayOutdate +
        ", happenNo=" + happenNo +
        ", balanceNo=" + balanceNo +
        ", idenno=" + idenno +
        ", profCode=" + profCode +
        ", workName=" + workName +
        ", workTel=" + workTel +
        ", workZip=" + workZip +
        ", home=" + home +
        ", homeTel=" + homeTel +
        ", homeZip=" + homeZip +
        ", dist=" + dist +
        ", birthArea=" + birthArea +
        ", nationCode=" + nationCode +
        ", linkmaName=" + linkmaName +
        ", linkmanTel=" + linkmanTel +
        ", linkmanAdd=" + linkmanAdd +
        ", relaCode=" + relaCode +
        ", mari=" + mari +
        ", counCode=" + counCode +
        ", personageFlag=" + personageFlag +
        ", xy=" + xy +
        ", mcardNo=" + mcardNo +
        ", stopAcount=" + stopAcount +
        ", outDate=" + outDate +
        ", dressDeposit=" + dressDeposit +
        ", dressNo=" + dressNo +
        ", zg=" + zg +
        ", cautioner=" + cautioner +
        ", money=" + money +
        ", caseFlag=" + caseFlag +
        ", moneyAlert=" + moneyAlert +
        ", emplCode=" + emplCode +
        ", medicalType=" + medicalType +
        ", derateCost=" + derateCost +
        ", balancePrepay=" + balancePrepay +
        ", balanceCost=" + balanceCost +
        ", inIcu=" + inIcu +
        ", practiceDocCode=" + practiceDocCode +
        ", practiceDocName=" + practiceDocName +
        ", noviciateDocCode=" + noviciateDocCode +
        ", noviciateDocName=" + noviciateDocName +
        ", convoyNrsCode=" + convoyNrsCode +
        ", convoyNrsName=" + convoyNrsName +
        ", convoyToolCode=" + convoyToolCode +
        ", convoyToolName=" + convoyToolName +
        ", debzCost=" + debzCost +
        ", gwyCost=" + gwyCost +
        ", regDate=" + regDate +
        "}";
    }
}
