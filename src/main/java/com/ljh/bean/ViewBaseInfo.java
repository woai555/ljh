package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * VIEW_BASE_INFO
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class ViewBaseInfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String inpatientNo;

    private String name;

    private String sex;

    private LocalDateTime birthday;

    private BigDecimal height;

    private BigDecimal weight;

    private String bloodCode;

    private LocalDateTime inDate;

    private String deptCode;

    private String deptName;

    private String paykindCode;

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

    private LocalDateTime balanceDate;

    private String profCode;

    private String workName;

    private String workTel;

    private String workZip;

    private String home;

    private String homeTel;

    private String homeZip;

    private String linkmaName;

    private String linkmanTel;

    private String linkmanAdd;

    private String mari;

    private String zg;

    private LocalDateTime outDate;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
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

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
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

    public LocalDateTime getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(LocalDateTime balanceDate) {
        this.balanceDate = balanceDate;
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

    public String getMari() {
        return mari;
    }

    public void setMari(String mari) {
        this.mari = mari;
    }

    public String getZg() {
        return zg;
    }

    public void setZg(String zg) {
        this.zg = zg;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    @Override
    public String toString() {
        return "ViewBaseInfo{" +
        "inpatientNo=" + inpatientNo +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", height=" + height +
        ", weight=" + weight +
        ", bloodCode=" + bloodCode +
        ", inDate=" + inDate +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", paykindCode=" + paykindCode +
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
        ", balanceDate=" + balanceDate +
        ", profCode=" + profCode +
        ", workName=" + workName +
        ", workTel=" + workTel +
        ", workZip=" + workZip +
        ", home=" + home +
        ", homeTel=" + homeTel +
        ", homeZip=" + homeZip +
        ", linkmaName=" + linkmaName +
        ", linkmanTel=" + linkmanTel +
        ", linkmanAdd=" + linkmanAdd +
        ", mari=" + mari +
        ", zg=" + zg +
        ", outDate=" + outDate +
        "}";
    }
}
