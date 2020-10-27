package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病人基本信息表(R_PatientInfo)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientinfo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 就诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
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
     * 单机版标志
     */
    private String djbFlag;

    /**
     * 社保卡卡号
     */
    private String mcardId;

    /**
     * 医联卡号
     */
    private String ylcardNo;

    /**
     * 医联卡信息上传标记，1为上传成功
     */
    private String ylcardUnload;

    /**
     * 户籍所在省(区、市)
     */
    private String distProvince;

    /**
     * 户籍市
     */
    private String distCity;

    /**
     * 区县
     */
    private String distDistrict;

    /**
     * 乡镇街道
     */
    private String distStreet;

    /**
     * 现住址省(区、市)
     */
    private String homeProvince;

    /**
     * 现住址市
     */
    private String homeCity;

    /**
     * 现住址区县
     */
    private String homeDistrict;

    /**
     * 现住址乡镇街道
     */
    private String homeStreet;

    /**
     * 病历打印通知
     */
    private String bltzFlag;

    /**
     * 建病历时间
     */
    private LocalDateTime blCreatetime;

    /**
     * 建病历科室
     */
    private String blDept;

    /**
     * 病人来源
     */
    private String patiSource;

    /**
     * 籍贯（省市）
     */
    private String patiJgSheng;

    /**
     * 籍贯（市）
     */
    private String patiJgShi;

    /**
     * 籍贯（县）
     */
    private String patiJgXian;

    /**
     * 出生地（省市）
     */
    private String patiCsdSheng;

    /**
     * 出生地（市）
     */
    private String patiCsdShi;

    /**
     * 出生地（县）
     */
    private String patiCsdXian;

    /**
     * 医保险种类别
     */
    private String ybFun;

    /**
     * 新生儿体重（单位克）
     */
    private BigDecimal weight;

    /**
     * 新生儿建病历时月龄
     */
    private BigDecimal months;

    /**
     * 京医通卡卡号
     */
    private String cardnoJyt;

    /**
     * 是否存在于医联体信息平台中
     */
    private String yltFlag;

    /**
     * 证件类型
     */
    private String identype;

    /**
     * 社保卡前九位
     */
    private String mcardnoNew;

    /**
     * 集成平台ID号
     */
    private String jcptno;

    /**
     * 人员类型2单位
     */
    private String patiType;

    /**
     * 统一社会信用代码
     */
    private String creditId;

    /**
     * 临时在京区县编码
     */
    private String bjDistrict;

    /**
     * 临时在京住址
     */
    private String bjAddress;

    /**
     * 是否填写病历调查
     */
    private String bldcFlag;


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

    public String getMcardnoNew() {
        return mcardnoNew;
    }

    public void setMcardnoNew(String mcardnoNew) {
        this.mcardnoNew = mcardnoNew;
    }

    public String getJcptno() {
        return jcptno;
    }

    public void setJcptno(String jcptno) {
        this.jcptno = jcptno;
    }

    public String getPatiType() {
        return patiType;
    }

    public void setPatiType(String patiType) {
        this.patiType = patiType;
    }

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public String getBjDistrict() {
        return bjDistrict;
    }

    public void setBjDistrict(String bjDistrict) {
        this.bjDistrict = bjDistrict;
    }

    public String getBjAddress() {
        return bjAddress;
    }

    public void setBjAddress(String bjAddress) {
        this.bjAddress = bjAddress;
    }

    public String getBldcFlag() {
        return bldcFlag;
    }

    public void setBldcFlag(String bldcFlag) {
        this.bldcFlag = bldcFlag;
    }

    @Override
    public String toString() {
        return "RPatientinfo{" +
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
        ", mcardnoNew=" + mcardnoNew +
        ", jcptno=" + jcptno +
        ", patiType=" + patiType +
        ", creditId=" + creditId +
        ", bjDistrict=" + bjDistrict +
        ", bjAddress=" + bjAddress +
        ", bldcFlag=" + bldcFlag +
        "}";
    }
}
