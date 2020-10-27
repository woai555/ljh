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
public class RPatientinfoRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 就诊卡号
     */
    private String cardNo;

    /**
     * 病人姓名
     */
    private String name;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 性别
     */
    private String sexCode;

    /**
     * 身份证号
     */
    private String idenno;

    /**
     * 血型
     */
    private String bloodCode;

    /**
     * 职业
     */
    private String profCode;

    /**
     * 工作单位
     */
    private String workName;

    /**
     * 单位电话
     */
    private String workTel;

    /**
     * 单位邮编
     */
    private String workZip;

    /**
     * 户口或家庭所在
     */
    private String home;

    /**
     * 家庭电话
     */
    private String homeTel;

    /**
     * 户口或家庭邮政编码
     */
    private String homeZip;

    /**
     * 籍贯
     */
    private String dist;

    /**
     * 民族
     */
    private String nationCode;

    /**
     * 联系人姓名
     */
    private String linkmanName;

    /**
     * 联系人电话
     */
    private String linkmanTel;

    /**
     * 联系人住址
     */
    private String linkmanAdd;

    /**
     * 联系人关系
     */
    private String relaCode;

    /**
     * 婚姻状况
     */
    private String mari;

    /**
     * 国籍
     */
    private String counCode;

    /**
     * 结算类别号
     */
    private String paykindCode;

    /**
     * 结算类别名称
     */
    private String paykindName;

    /**
     * 合同单位号
     */
    private String pactCode;

    /**
     * 合同单位名称
     */
    private String pactName;

    /**
     * 医疗证号
     */
    private String mcardNo;

    /**
     * 地区
     */
    private String area;

    /**
     * 医疗费用
     */
    private BigDecimal framt;

    /**
     * 过敏原
     */
    private String ynalgy;

    /**
     * 药物过敏
     */
    private String yndrug;

    /**
     * 重要疾病
     */
    private String yndise;

    /**
     * 帐户密码
     */
    private String actCode;

    /**
     * 帐户总额
     */
    private BigDecimal actAmt;

    /**
     * 上期帐户余额
     */
    private BigDecimal lactSum;

    /**
     * 上期银行余额
     */
    private BigDecimal lbankSum;

    /**
     * 欠费次数
     */
    private Integer arrearTimes;

    /**
     * 欠费金额
     */
    private BigDecimal arrearSum;

    /**
     * 住院来源
     */
    private String inhosSrc;

    /**
     * 最近住院日期
     */
    private LocalDateTime inhosDate;

    /**
     * 住院次数
     */
    private Integer inhosTimes;

    /**
     * 最近出院日期
     */
    private LocalDateTime outhosDate;

    /**
     * 初诊日期
     */
    private LocalDateTime firSeeDate;

    /**
     * 最近挂号日期
     */
    private LocalDateTime lregDate;

    /**
     * 违约次数
     */
    private BigDecimal disobyCnt;

    /**
     * 违约惩罚截止日
     */
    private LocalDateTime endDate;

    /**
     * 病历页数
     */
    private Integer page;

    /**
     * 备注
     */
    private String mark;

    /**
     * 最近改动日期
     */
    private LocalDateTime operDate;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 门诊病历号
     */
    private String clinicNo;

    /**
     * 住院号
     */
    private String patientNo;

    /**
     * 银行账号
     */
    private String bankNo;

    /**
     * 单位地址
     */
    private String workAdd;

    /**
     * 实名编码
     */
    private String factcode;

    /**
     * 实名就诊卡号
     */
    private String factjzkh;

    /**
     * 流水号
     */
    private BigDecimal seqNo;

    /**
     * 医联卡号
     */
    private String ylcardNo;

    /**
     * 0插入，1修改
     */
    private String status;

    /**
     * AA已提交平台
     */
    private String jcpttj;

    /**
     * 建卡类型
     */
    private String cardtype;

    /**
     * 临时卡号
     */
    private String tempNo;

    /**
     * 1 已提交
     */
    private String apptj;


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

    public BigDecimal getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(BigDecimal seqNo) {
        this.seqNo = seqNo;
    }

    public String getYlcardNo() {
        return ylcardNo;
    }

    public void setYlcardNo(String ylcardNo) {
        this.ylcardNo = ylcardNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJcpttj() {
        return jcpttj;
    }

    public void setJcpttj(String jcpttj) {
        this.jcpttj = jcpttj;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public String getTempNo() {
        return tempNo;
    }

    public void setTempNo(String tempNo) {
        this.tempNo = tempNo;
    }

    public String getApptj() {
        return apptj;
    }

    public void setApptj(String apptj) {
        this.apptj = apptj;
    }

    @Override
    public String toString() {
        return "RPatientinfoRecord{" +
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
        ", seqNo=" + seqNo +
        ", ylcardNo=" + ylcardNo +
        ", status=" + status +
        ", jcpttj=" + jcpttj +
        ", cardtype=" + cardtype +
        ", tempNo=" + tempNo +
        ", apptj=" + apptj +
        "}";
    }
}
