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
public class RPatientinfoClrmcard implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String name;

    private LocalDateTime birthday;

    private String sexCode;

    private String idenno;

    private String bloodCode;

    private String profCode;

    private String workName;

    private String workTel;

    private String workZip;

    private String home;

    private String homeTel;

    private String homeZip;

    private String dist;

    private String nationCode;

    private String linkmanName;

    private String linkmanTel;

    private String linkmanAdd;

    private String relaCode;

    private String mari;

    private String counCode;

    private String paykindCode;

    private String paykindName;

    private String pactCode;

    private String pactName;

    private String mcardNo;

    private String area;

    private BigDecimal framt;

    private String ynalgy;

    private String yndrug;

    private String yndise;

    private String actCode;

    private BigDecimal actAmt;

    private BigDecimal lactSum;

    private BigDecimal lbankSum;

    private Integer arrearTimes;

    private BigDecimal arrearSum;

    private String inhosSrc;

    private LocalDateTime inhosDate;

    private Integer inhosTimes;

    private LocalDateTime outhosDate;

    private LocalDateTime firSeeDate;

    private LocalDateTime lregDate;

    private BigDecimal disobyCnt;

    private LocalDateTime endDate;

    private Integer page;

    private String mark;

    private LocalDateTime operDate;

    private String operCode;

    private String clinicNo;

    private String patientNo;

    private String bankNo;

    private String workAdd;

    private String factcode;

    private String factjzkh;

    private String djbFlag;

    private String mcardId;

    private String ylcardNo;

    private String ylcardUnload;

    private String distProvince;

    private String distCity;

    private String distDistrict;

    private String distStreet;

    private String homeProvince;

    private String homeCity;

    private String homeDistrict;

    private String homeStreet;

    private String bltzFlag;

    private LocalDateTime blCreatetime;

    private String blDept;

    private String patiSource;

    private String patiJgSheng;

    private String patiJgShi;

    private String patiJgXian;

    private String patiCsdSheng;

    private String patiCsdShi;

    private String patiCsdXian;

    private String ybFun;

    private BigDecimal weight;

    private BigDecimal months;

    private String cardnoJyt;

    private String yltFlag;

    private String identype;


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

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode;
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

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
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

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPaykindName() {
        return paykindName;
    }

    public void setPaykindName(String paykindName) {
        this.paykindName = paykindName;
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

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public BigDecimal getFramt() {
        return framt;
    }

    public void setFramt(BigDecimal framt) {
        this.framt = framt;
    }

    public String getYnalgy() {
        return ynalgy;
    }

    public void setYnalgy(String ynalgy) {
        this.ynalgy = ynalgy;
    }

    public String getYndrug() {
        return yndrug;
    }

    public void setYndrug(String yndrug) {
        this.yndrug = yndrug;
    }

    public String getYndise() {
        return yndise;
    }

    public void setYndise(String yndise) {
        this.yndise = yndise;
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode;
    }

    public BigDecimal getActAmt() {
        return actAmt;
    }

    public void setActAmt(BigDecimal actAmt) {
        this.actAmt = actAmt;
    }

    public BigDecimal getLactSum() {
        return lactSum;
    }

    public void setLactSum(BigDecimal lactSum) {
        this.lactSum = lactSum;
    }

    public BigDecimal getLbankSum() {
        return lbankSum;
    }

    public void setLbankSum(BigDecimal lbankSum) {
        this.lbankSum = lbankSum;
    }

    public Integer getArrearTimes() {
        return arrearTimes;
    }

    public void setArrearTimes(Integer arrearTimes) {
        this.arrearTimes = arrearTimes;
    }

    public BigDecimal getArrearSum() {
        return arrearSum;
    }

    public void setArrearSum(BigDecimal arrearSum) {
        this.arrearSum = arrearSum;
    }

    public String getInhosSrc() {
        return inhosSrc;
    }

    public void setInhosSrc(String inhosSrc) {
        this.inhosSrc = inhosSrc;
    }

    public LocalDateTime getInhosDate() {
        return inhosDate;
    }

    public void setInhosDate(LocalDateTime inhosDate) {
        this.inhosDate = inhosDate;
    }

    public Integer getInhosTimes() {
        return inhosTimes;
    }

    public void setInhosTimes(Integer inhosTimes) {
        this.inhosTimes = inhosTimes;
    }

    public LocalDateTime getOuthosDate() {
        return outhosDate;
    }

    public void setOuthosDate(LocalDateTime outhosDate) {
        this.outhosDate = outhosDate;
    }

    public LocalDateTime getFirSeeDate() {
        return firSeeDate;
    }

    public void setFirSeeDate(LocalDateTime firSeeDate) {
        this.firSeeDate = firSeeDate;
    }

    public LocalDateTime getLregDate() {
        return lregDate;
    }

    public void setLregDate(LocalDateTime lregDate) {
        this.lregDate = lregDate;
    }

    public BigDecimal getDisobyCnt() {
        return disobyCnt;
    }

    public void setDisobyCnt(BigDecimal disobyCnt) {
        this.disobyCnt = disobyCnt;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getWorkAdd() {
        return workAdd;
    }

    public void setWorkAdd(String workAdd) {
        this.workAdd = workAdd;
    }

    public String getFactcode() {
        return factcode;
    }

    public void setFactcode(String factcode) {
        this.factcode = factcode;
    }

    public String getFactjzkh() {
        return factjzkh;
    }

    public void setFactjzkh(String factjzkh) {
        this.factjzkh = factjzkh;
    }

    public String getDjbFlag() {
        return djbFlag;
    }

    public void setDjbFlag(String djbFlag) {
        this.djbFlag = djbFlag;
    }

    public String getMcardId() {
        return mcardId;
    }

    public void setMcardId(String mcardId) {
        this.mcardId = mcardId;
    }

    public String getYlcardNo() {
        return ylcardNo;
    }

    public void setYlcardNo(String ylcardNo) {
        this.ylcardNo = ylcardNo;
    }

    public String getYlcardUnload() {
        return ylcardUnload;
    }

    public void setYlcardUnload(String ylcardUnload) {
        this.ylcardUnload = ylcardUnload;
    }

    public String getDistProvince() {
        return distProvince;
    }

    public void setDistProvince(String distProvince) {
        this.distProvince = distProvince;
    }

    public String getDistCity() {
        return distCity;
    }

    public void setDistCity(String distCity) {
        this.distCity = distCity;
    }

    public String getDistDistrict() {
        return distDistrict;
    }

    public void setDistDistrict(String distDistrict) {
        this.distDistrict = distDistrict;
    }

    public String getDistStreet() {
        return distStreet;
    }

    public void setDistStreet(String distStreet) {
        this.distStreet = distStreet;
    }

    public String getHomeProvince() {
        return homeProvince;
    }

    public void setHomeProvince(String homeProvince) {
        this.homeProvince = homeProvince;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity;
    }

    public String getHomeDistrict() {
        return homeDistrict;
    }

    public void setHomeDistrict(String homeDistrict) {
        this.homeDistrict = homeDistrict;
    }

    public String getHomeStreet() {
        return homeStreet;
    }

    public void setHomeStreet(String homeStreet) {
        this.homeStreet = homeStreet;
    }

    public String getBltzFlag() {
        return bltzFlag;
    }

    public void setBltzFlag(String bltzFlag) {
        this.bltzFlag = bltzFlag;
    }

    public LocalDateTime getBlCreatetime() {
        return blCreatetime;
    }

    public void setBlCreatetime(LocalDateTime blCreatetime) {
        this.blCreatetime = blCreatetime;
    }

    public String getBlDept() {
        return blDept;
    }

    public void setBlDept(String blDept) {
        this.blDept = blDept;
    }

    public String getPatiSource() {
        return patiSource;
    }

    public void setPatiSource(String patiSource) {
        this.patiSource = patiSource;
    }

    public String getPatiJgSheng() {
        return patiJgSheng;
    }

    public void setPatiJgSheng(String patiJgSheng) {
        this.patiJgSheng = patiJgSheng;
    }

    public String getPatiJgShi() {
        return patiJgShi;
    }

    public void setPatiJgShi(String patiJgShi) {
        this.patiJgShi = patiJgShi;
    }

    public String getPatiJgXian() {
        return patiJgXian;
    }

    public void setPatiJgXian(String patiJgXian) {
        this.patiJgXian = patiJgXian;
    }

    public String getPatiCsdSheng() {
        return patiCsdSheng;
    }

    public void setPatiCsdSheng(String patiCsdSheng) {
        this.patiCsdSheng = patiCsdSheng;
    }

    public String getPatiCsdShi() {
        return patiCsdShi;
    }

    public void setPatiCsdShi(String patiCsdShi) {
        this.patiCsdShi = patiCsdShi;
    }

    public String getPatiCsdXian() {
        return patiCsdXian;
    }

    public void setPatiCsdXian(String patiCsdXian) {
        this.patiCsdXian = patiCsdXian;
    }

    public String getYbFun() {
        return ybFun;
    }

    public void setYbFun(String ybFun) {
        this.ybFun = ybFun;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getMonths() {
        return months;
    }

    public void setMonths(BigDecimal months) {
        this.months = months;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public String getYltFlag() {
        return yltFlag;
    }

    public void setYltFlag(String yltFlag) {
        this.yltFlag = yltFlag;
    }

    public String getIdentype() {
        return identype;
    }

    public void setIdentype(String identype) {
        this.identype = identype;
    }

    @Override
    public String toString() {
        return "RPatientinfoClrmcard{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", birthday=" + birthday +
        ", sexCode=" + sexCode +
        ", idenno=" + idenno +
        ", bloodCode=" + bloodCode +
        ", profCode=" + profCode +
        ", workName=" + workName +
        ", workTel=" + workTel +
        ", workZip=" + workZip +
        ", home=" + home +
        ", homeTel=" + homeTel +
        ", homeZip=" + homeZip +
        ", dist=" + dist +
        ", nationCode=" + nationCode +
        ", linkmanName=" + linkmanName +
        ", linkmanTel=" + linkmanTel +
        ", linkmanAdd=" + linkmanAdd +
        ", relaCode=" + relaCode +
        ", mari=" + mari +
        ", counCode=" + counCode +
        ", paykindCode=" + paykindCode +
        ", paykindName=" + paykindName +
        ", pactCode=" + pactCode +
        ", pactName=" + pactName +
        ", mcardNo=" + mcardNo +
        ", area=" + area +
        ", framt=" + framt +
        ", ynalgy=" + ynalgy +
        ", yndrug=" + yndrug +
        ", yndise=" + yndise +
        ", actCode=" + actCode +
        ", actAmt=" + actAmt +
        ", lactSum=" + lactSum +
        ", lbankSum=" + lbankSum +
        ", arrearTimes=" + arrearTimes +
        ", arrearSum=" + arrearSum +
        ", inhosSrc=" + inhosSrc +
        ", inhosDate=" + inhosDate +
        ", inhosTimes=" + inhosTimes +
        ", outhosDate=" + outhosDate +
        ", firSeeDate=" + firSeeDate +
        ", lregDate=" + lregDate +
        ", disobyCnt=" + disobyCnt +
        ", endDate=" + endDate +
        ", page=" + page +
        ", mark=" + mark +
        ", operDate=" + operDate +
        ", operCode=" + operCode +
        ", clinicNo=" + clinicNo +
        ", patientNo=" + patientNo +
        ", bankNo=" + bankNo +
        ", workAdd=" + workAdd +
        ", factcode=" + factcode +
        ", factjzkh=" + factjzkh +
        ", djbFlag=" + djbFlag +
        ", mcardId=" + mcardId +
        ", ylcardNo=" + ylcardNo +
        ", ylcardUnload=" + ylcardUnload +
        ", distProvince=" + distProvince +
        ", distCity=" + distCity +
        ", distDistrict=" + distDistrict +
        ", distStreet=" + distStreet +
        ", homeProvince=" + homeProvince +
        ", homeCity=" + homeCity +
        ", homeDistrict=" + homeDistrict +
        ", homeStreet=" + homeStreet +
        ", bltzFlag=" + bltzFlag +
        ", blCreatetime=" + blCreatetime +
        ", blDept=" + blDept +
        ", patiSource=" + patiSource +
        ", patiJgSheng=" + patiJgSheng +
        ", patiJgShi=" + patiJgShi +
        ", patiJgXian=" + patiJgXian +
        ", patiCsdSheng=" + patiCsdSheng +
        ", patiCsdShi=" + patiCsdShi +
        ", patiCsdXian=" + patiCsdXian +
        ", ybFun=" + ybFun +
        ", weight=" + weight +
        ", months=" + months +
        ", cardnoJyt=" + cardnoJyt +
        ", yltFlag=" + yltFlag +
        ", identype=" + identype +
        "}";
    }
}
