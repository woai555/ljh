package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 病案首页基本信息档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsbase implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * INPATIENT_NO
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 住院病历号
     */
    private String patientNo;

    /**
     * 门诊病历号
     */
    private String cardNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 国家
     */
    private String counCode;

    /**
     * 民族
     */
    private String nationCode;

    /**
     * 职业
     */
    private String profCode;

    /**
     * 血型编码
     */
    private String bloodCode;

    /**
     * 婚否
     */
    private String mari;

    /**
     * 地区来源
     */
    private String inSource;

    /**
     * 家庭住址
     */
    private String homeAdd;

    /**
     * 家庭电话
     */
    private String homeTel;

    /**
     * 住址邮编
     */
    private String homeZip;

    /**
     * 单位地址
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
     * 联系人
     */
    private String linkmaName;

    /**
     * 与患者关系
     */
    private String relaCode;

    /**
     * 联系电话
     */
    private String linkmanTel;

    /**
     * 联系地址
     */
    private String linkmanAdd;

    /**
     * 门诊诊断
     */
    private String clinicIcd;

    /**
     * 诊断名称
     */
    private String clinicIcdnm;

    /**
     * 入院日期
     */
    private LocalDateTime inDate;

    /**
     * 入院科室代码
     */
    private String deptIn;

    /**
     * 入院科室名称
     */
    private String deptInnm;

    /**
     * 入院来源
     */
    private String inAvenue;

    /**
     * 入院状态
     */
    private String inCircs;

    /**
     * 确诊日期
     */
    private LocalDateTime diagDate;

    /**
     * 手术日期
     */
    private LocalDateTime operDate;

    /**
     * 出院日期
     */
    private LocalDateTime outDate;

    /**
     * 出院主诊断
     */
    private String icdCode;

    /**
     * 出院科室代码
     */
    private String deptCode;

    /**
     * 出院科室名称
     */
    private String deptName;

    /**
     * 转归代码
     */
    private String zg;

    /**
     * 死亡日期
     */
    private LocalDateTime deadDate;

    /**
     * 死亡外因
     */
    private String deadReason;

    /**
     * 住院次数
     */
    private Integer inTimes;

    /**
     * X光号
     */
    private String xNumb;

    /**
     * CT号
     */
    private String ctNumb;

    /**
     * MRI号
     */
    private String mriNumb;

    /**
     * 病理号
     */
    private String pathNumb;

    /**
     * 门急_入院符合
     */
    private String cePi;

    /**
     * 入出_院符合
     */
    private String piPo;

    /**
     * 术前_后符合
     */
    private String opbOpa;

    /**
     * 临床_X光符合
     */
    private String clX;

    /**
     * 临床_CT符合
     */
    private String clCt;

    /**
     * 临床_MRI符合
     */
    private String clMri;

    /**
     * 临床_病理符合
     */
    private String clPa;

    /**
     * 抢救次数
     */
    private Integer salvTimes;

    /**
     * 成功次数
     */
    private Integer succTimes;

    /**
     * 病案质量
     */
    private String mrQual;

    /**
     * 合格病案
     */
    private String mrElig;

    /**
     * 示教科研
     */
    private String techSerc;

    /**
     * 是否随诊
     */
    private String visiStat;

    /**
     * 随访期限
     */
    private LocalDateTime visiPeri;

    /**
     * 尸检
     */
    private String bodyCheck;

    /**
     * 药物过敏
     */
    private String anaphyFlag;

    /**
     * 住院医师代码
     */
    private String houseDocCode;

    /**
     * 住院医师姓名
     */
    private String houseDocName;

    /**
     * 主治医师代码
     */
    private String chargeDocCode;

    /**
     * 主治医师姓名
     */
    private String chargeDocName;

    /**
     * 主任医师代码
     */
    private String chiefDocCode;

    /**
     * 主任医师姓名
     */
    private String chiefDocName;

    /**
     * 是否二次入院
     */
    private String secoIn;

    /**
     * 167疾病分类
     */
    private String type167;

    /**
     * 损伤中毒分类
     */
    private String type167e;

    /**
     * 确诊天数
     */
    private Integer diagDays;

    /**
     * 住院天数
     */
    private Integer piDays;

    /**
     * 暂时不用
     */
    private Integer piTimes;

    /**
     * 1：对应损伤编码 2：不对应损伤编码
     */
    private String diagToe;

    /**
     * 死亡种类
     */
    private String deadKind;

    /**
     * 更改后出院日期
     */
    private LocalDateTime outDate2;

    /**
     * 是否有陪护
     */
    private String tendYn;

    /**
     * 1:是非病诊断 2：是疾病诊断
     */
    private String icdKind;

    /**
     * 是否健诊
     */
    private String icdOther;

    /**
     * 结算类别号
     */
    private String paykindCode;

    /**
     * 母亲住院号
     */
    private String mother;

    /**
     * 是否医院感染
     */
    private String ynInfect;

    /**
     * 是否低重儿
     */
    private String ynLowweigh;

    /**
     * 生产方式
     */
    private String birthMode;

    /**
     * 妊辰结果
     */
    private String birthEnd;

    /**
     * 是否婴儿
     */
    private String ynbaby;

    /**
     * 母亲姓名
     */
    private String motherName;

    /**
     * 病案号
     */
    private String mrmsNo;

    /**
     * 病案状态(O借出 I在架)
     */
    private String lenStus;

    /**
     * 乙肝表面抗原（阴性、阳性、未做）
     */
    private String hbsag;

    /**
     * 丙肝病毒抗体（阴性、阳性、未做）
     */
    private String hcvAb;

    /**
     * 获得性人类免疫缺陷病毒抗体（阴性、阳性、未做）
     */
    private String hivAb;

    /**
     * 放射与病理是否符合
     */
    private String fsBl;

    /**
     * 科主任
     */
    private String deptChiefCode;

    /**
     * 进修医师
     */
    private String jxDocCode;

    /**
     * 研究生实习医师
     */
    private String graDocCode;

    /**
     * 实习医师
     */
    private String praDocCode;

    /**
     * 编码员
     */
    private String codeingCode;

    /**
     * 质控医师
     */
    private String qualityDoc;

    /**
     * 质控护士
     */
    private String qualityNurse;

    /**
     * 检查时间
     */
    private LocalDateTime checkDate;

    /**
     * 手术、操作、治疗、检查、诊断为本院第一例项目
     */
    private String ynFirst;

    /**
     * Rh血型(阴、阳)
     */
    private String rhBlood;

    /**
     * 输血反应（有、无）
     */
    private String reactionBlood;

    /**
     * 输血品种
     */
    private String bloodKind;

    /**
     * 是否打印借阅单(0 已经打印完，1 要打印)
     */
    private String ynPrint;

    /**
     * 要调阅的时间
     */
    private LocalDateTime preDate;

    /**
     * 最后一次手术时间
     */
    private LocalDateTime laseOperdate;

    /**
     * 身份证号
     */
    private String idcardno;

    /**
     * 户口地址
     */
    private String homeplace;

    /**
     * 最后一次手术医师
     */
    private String lastOperator;

    /**
     * DSA号
     */
    private String dsaNumb;

    /**
     * PET号
     */
    private String petNumb;

    /**
     * ECT号
     */
    private String ectNumb;

    /**
     * X线次数
     */
    private BigDecimal xTimes;

    /**
     * CT次数
     */
    private BigDecimal ctTimes;

    /**
     * MR次数
     */
    private BigDecimal mrTimes;

    /**
     * DSA次数
     */
    private BigDecimal dsaTimes;

    /**
     * PET次数
     */
    private BigDecimal petTimes;

    /**
     * ECT次数
     */
    private BigDecimal ectTimes;

    /**
     * 红细胞数
     */
    private String bloodRed;

    /**
     * 血小板数
     */
    private String bloodPlatelet;

    /**
     * 血浆数
     */
    private String bloodPlasma;

    /**
     * 全血数
     */
    private String bloodWhole;

    /**
     * 其他输血数
     */
    private String bloodOther;

    /**
     * 说明
     */
    private String remark;

    /**
     * 术前住院天数
     */
    private Integer beforeoperDays;

    /**
     * 转科日期
     */
    private LocalDateTime changedeptDate;

    /**
     * 转往科室
     */
    private String changedeptcode;

    /**
     * 再转科室
     */
    private String changedeptcode2;

    /**
     * 尸体解剖号
     */
    private String bodyAnotomize;

    /**
     * 过敏药物名称
     */
    private String anaphyName;

    /**
     * 医保公费号
     */
    private String ybNo;

    /**
     * 院内感染名称
     */
    private String ynInfectname;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 入院病区
     */
    private String sickroomIn;

    /**
     * 转入病区
     */
    private String sickroomChange;

    /**
     * 出院病区
     */
    private String sickroomOut;

    /**
     * 年龄单位
     */
    private String unitAge;


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

    public String getCounCode() {
        return counCode;
    }

    public void setCounCode(String counCode) {
        this.counCode = counCode;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode;
    }

    public String getMari() {
        return mari;
    }

    public void setMari(String mari) {
        this.mari = mari;
    }

    public String getInSource() {
        return inSource;
    }

    public void setInSource(String inSource) {
        this.inSource = inSource;
    }

    public String getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd;
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

    public String getLinkmaName() {
        return linkmaName;
    }

    public void setLinkmaName(String linkmaName) {
        this.linkmaName = linkmaName;
    }

    public String getRelaCode() {
        return relaCode;
    }

    public void setRelaCode(String relaCode) {
        this.relaCode = relaCode;
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

    public String getClinicIcd() {
        return clinicIcd;
    }

    public void setClinicIcd(String clinicIcd) {
        this.clinicIcd = clinicIcd;
    }

    public String getClinicIcdnm() {
        return clinicIcdnm;
    }

    public void setClinicIcdnm(String clinicIcdnm) {
        this.clinicIcdnm = clinicIcdnm;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public String getDeptIn() {
        return deptIn;
    }

    public void setDeptIn(String deptIn) {
        this.deptIn = deptIn;
    }

    public String getDeptInnm() {
        return deptInnm;
    }

    public void setDeptInnm(String deptInnm) {
        this.deptInnm = deptInnm;
    }

    public String getInAvenue() {
        return inAvenue;
    }

    public void setInAvenue(String inAvenue) {
        this.inAvenue = inAvenue;
    }

    public String getInCircs() {
        return inCircs;
    }

    public void setInCircs(String inCircs) {
        this.inCircs = inCircs;
    }

    public LocalDateTime getDiagDate() {
        return diagDate;
    }

    public void setDiagDate(LocalDateTime diagDate) {
        this.diagDate = diagDate;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
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

    public String getZg() {
        return zg;
    }

    public void setZg(String zg) {
        this.zg = zg;
    }

    public LocalDateTime getDeadDate() {
        return deadDate;
    }

    public void setDeadDate(LocalDateTime deadDate) {
        this.deadDate = deadDate;
    }

    public String getDeadReason() {
        return deadReason;
    }

    public void setDeadReason(String deadReason) {
        this.deadReason = deadReason;
    }

    public Integer getInTimes() {
        return inTimes;
    }

    public void setInTimes(Integer inTimes) {
        this.inTimes = inTimes;
    }

    public String getxNumb() {
        return xNumb;
    }

    public void setxNumb(String xNumb) {
        this.xNumb = xNumb;
    }

    public String getCtNumb() {
        return ctNumb;
    }

    public void setCtNumb(String ctNumb) {
        this.ctNumb = ctNumb;
    }

    public String getMriNumb() {
        return mriNumb;
    }

    public void setMriNumb(String mriNumb) {
        this.mriNumb = mriNumb;
    }

    public String getPathNumb() {
        return pathNumb;
    }

    public void setPathNumb(String pathNumb) {
        this.pathNumb = pathNumb;
    }

    public String getCePi() {
        return cePi;
    }

    public void setCePi(String cePi) {
        this.cePi = cePi;
    }

    public String getPiPo() {
        return piPo;
    }

    public void setPiPo(String piPo) {
        this.piPo = piPo;
    }

    public String getOpbOpa() {
        return opbOpa;
    }

    public void setOpbOpa(String opbOpa) {
        this.opbOpa = opbOpa;
    }

    public String getClX() {
        return clX;
    }

    public void setClX(String clX) {
        this.clX = clX;
    }

    public String getClCt() {
        return clCt;
    }

    public void setClCt(String clCt) {
        this.clCt = clCt;
    }

    public String getClMri() {
        return clMri;
    }

    public void setClMri(String clMri) {
        this.clMri = clMri;
    }

    public String getClPa() {
        return clPa;
    }

    public void setClPa(String clPa) {
        this.clPa = clPa;
    }

    public Integer getSalvTimes() {
        return salvTimes;
    }

    public void setSalvTimes(Integer salvTimes) {
        this.salvTimes = salvTimes;
    }

    public Integer getSuccTimes() {
        return succTimes;
    }

    public void setSuccTimes(Integer succTimes) {
        this.succTimes = succTimes;
    }

    public String getMrQual() {
        return mrQual;
    }

    public void setMrQual(String mrQual) {
        this.mrQual = mrQual;
    }

    public String getMrElig() {
        return mrElig;
    }

    public void setMrElig(String mrElig) {
        this.mrElig = mrElig;
    }

    public String getTechSerc() {
        return techSerc;
    }

    public void setTechSerc(String techSerc) {
        this.techSerc = techSerc;
    }

    public String getVisiStat() {
        return visiStat;
    }

    public void setVisiStat(String visiStat) {
        this.visiStat = visiStat;
    }

    public LocalDateTime getVisiPeri() {
        return visiPeri;
    }

    public void setVisiPeri(LocalDateTime visiPeri) {
        this.visiPeri = visiPeri;
    }

    public String getBodyCheck() {
        return bodyCheck;
    }

    public void setBodyCheck(String bodyCheck) {
        this.bodyCheck = bodyCheck;
    }

    public String getAnaphyFlag() {
        return anaphyFlag;
    }

    public void setAnaphyFlag(String anaphyFlag) {
        this.anaphyFlag = anaphyFlag;
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

    public String getSecoIn() {
        return secoIn;
    }

    public void setSecoIn(String secoIn) {
        this.secoIn = secoIn;
    }

    public String getType167() {
        return type167;
    }

    public void setType167(String type167) {
        this.type167 = type167;
    }

    public String getType167e() {
        return type167e;
    }

    public void setType167e(String type167e) {
        this.type167e = type167e;
    }

    public Integer getDiagDays() {
        return diagDays;
    }

    public void setDiagDays(Integer diagDays) {
        this.diagDays = diagDays;
    }

    public Integer getPiDays() {
        return piDays;
    }

    public void setPiDays(Integer piDays) {
        this.piDays = piDays;
    }

    public Integer getPiTimes() {
        return piTimes;
    }

    public void setPiTimes(Integer piTimes) {
        this.piTimes = piTimes;
    }

    public String getDiagToe() {
        return diagToe;
    }

    public void setDiagToe(String diagToe) {
        this.diagToe = diagToe;
    }

    public String getDeadKind() {
        return deadKind;
    }

    public void setDeadKind(String deadKind) {
        this.deadKind = deadKind;
    }

    public LocalDateTime getOutDate2() {
        return outDate2;
    }

    public void setOutDate2(LocalDateTime outDate2) {
        this.outDate2 = outDate2;
    }

    public String getTendYn() {
        return tendYn;
    }

    public void setTendYn(String tendYn) {
        this.tendYn = tendYn;
    }

    public String getIcdKind() {
        return icdKind;
    }

    public void setIcdKind(String icdKind) {
        this.icdKind = icdKind;
    }

    public String getIcdOther() {
        return icdOther;
    }

    public void setIcdOther(String icdOther) {
        this.icdOther = icdOther;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getYnInfect() {
        return ynInfect;
    }

    public void setYnInfect(String ynInfect) {
        this.ynInfect = ynInfect;
    }

    public String getYnLowweigh() {
        return ynLowweigh;
    }

    public void setYnLowweigh(String ynLowweigh) {
        this.ynLowweigh = ynLowweigh;
    }

    public String getBirthMode() {
        return birthMode;
    }

    public void setBirthMode(String birthMode) {
        this.birthMode = birthMode;
    }

    public String getBirthEnd() {
        return birthEnd;
    }

    public void setBirthEnd(String birthEnd) {
        this.birthEnd = birthEnd;
    }

    public String getYnbaby() {
        return ynbaby;
    }

    public void setYnbaby(String ynbaby) {
        this.ynbaby = ynbaby;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMrmsNo() {
        return mrmsNo;
    }

    public void setMrmsNo(String mrmsNo) {
        this.mrmsNo = mrmsNo;
    }

    public String getLenStus() {
        return lenStus;
    }

    public void setLenStus(String lenStus) {
        this.lenStus = lenStus;
    }

    public String getHbsag() {
        return hbsag;
    }

    public void setHbsag(String hbsag) {
        this.hbsag = hbsag;
    }

    public String getHcvAb() {
        return hcvAb;
    }

    public void setHcvAb(String hcvAb) {
        this.hcvAb = hcvAb;
    }

    public String getHivAb() {
        return hivAb;
    }

    public void setHivAb(String hivAb) {
        this.hivAb = hivAb;
    }

    public String getFsBl() {
        return fsBl;
    }

    public void setFsBl(String fsBl) {
        this.fsBl = fsBl;
    }

    public String getDeptChiefCode() {
        return deptChiefCode;
    }

    public void setDeptChiefCode(String deptChiefCode) {
        this.deptChiefCode = deptChiefCode;
    }

    public String getJxDocCode() {
        return jxDocCode;
    }

    public void setJxDocCode(String jxDocCode) {
        this.jxDocCode = jxDocCode;
    }

    public String getGraDocCode() {
        return graDocCode;
    }

    public void setGraDocCode(String graDocCode) {
        this.graDocCode = graDocCode;
    }

    public String getPraDocCode() {
        return praDocCode;
    }

    public void setPraDocCode(String praDocCode) {
        this.praDocCode = praDocCode;
    }

    public String getCodeingCode() {
        return codeingCode;
    }

    public void setCodeingCode(String codeingCode) {
        this.codeingCode = codeingCode;
    }

    public String getQualityDoc() {
        return qualityDoc;
    }

    public void setQualityDoc(String qualityDoc) {
        this.qualityDoc = qualityDoc;
    }

    public String getQualityNurse() {
        return qualityNurse;
    }

    public void setQualityNurse(String qualityNurse) {
        this.qualityNurse = qualityNurse;
    }

    public LocalDateTime getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDateTime checkDate) {
        this.checkDate = checkDate;
    }

    public String getYnFirst() {
        return ynFirst;
    }

    public void setYnFirst(String ynFirst) {
        this.ynFirst = ynFirst;
    }

    public String getRhBlood() {
        return rhBlood;
    }

    public void setRhBlood(String rhBlood) {
        this.rhBlood = rhBlood;
    }

    public String getReactionBlood() {
        return reactionBlood;
    }

    public void setReactionBlood(String reactionBlood) {
        this.reactionBlood = reactionBlood;
    }

    public String getBloodKind() {
        return bloodKind;
    }

    public void setBloodKind(String bloodKind) {
        this.bloodKind = bloodKind;
    }

    public String getYnPrint() {
        return ynPrint;
    }

    public void setYnPrint(String ynPrint) {
        this.ynPrint = ynPrint;
    }

    public LocalDateTime getPreDate() {
        return preDate;
    }

    public void setPreDate(LocalDateTime preDate) {
        this.preDate = preDate;
    }

    public LocalDateTime getLaseOperdate() {
        return laseOperdate;
    }

    public void setLaseOperdate(LocalDateTime laseOperdate) {
        this.laseOperdate = laseOperdate;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getHomeplace() {
        return homeplace;
    }

    public void setHomeplace(String homeplace) {
        this.homeplace = homeplace;
    }

    public String getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator;
    }

    public String getDsaNumb() {
        return dsaNumb;
    }

    public void setDsaNumb(String dsaNumb) {
        this.dsaNumb = dsaNumb;
    }

    public String getPetNumb() {
        return petNumb;
    }

    public void setPetNumb(String petNumb) {
        this.petNumb = petNumb;
    }

    public String getEctNumb() {
        return ectNumb;
    }

    public void setEctNumb(String ectNumb) {
        this.ectNumb = ectNumb;
    }

    public BigDecimal getxTimes() {
        return xTimes;
    }

    public void setxTimes(BigDecimal xTimes) {
        this.xTimes = xTimes;
    }

    public BigDecimal getCtTimes() {
        return ctTimes;
    }

    public void setCtTimes(BigDecimal ctTimes) {
        this.ctTimes = ctTimes;
    }

    public BigDecimal getMrTimes() {
        return mrTimes;
    }

    public void setMrTimes(BigDecimal mrTimes) {
        this.mrTimes = mrTimes;
    }

    public BigDecimal getDsaTimes() {
        return dsaTimes;
    }

    public void setDsaTimes(BigDecimal dsaTimes) {
        this.dsaTimes = dsaTimes;
    }

    public BigDecimal getPetTimes() {
        return petTimes;
    }

    public void setPetTimes(BigDecimal petTimes) {
        this.petTimes = petTimes;
    }

    public BigDecimal getEctTimes() {
        return ectTimes;
    }

    public void setEctTimes(BigDecimal ectTimes) {
        this.ectTimes = ectTimes;
    }

    public String getBloodRed() {
        return bloodRed;
    }

    public void setBloodRed(String bloodRed) {
        this.bloodRed = bloodRed;
    }

    public String getBloodPlatelet() {
        return bloodPlatelet;
    }

    public void setBloodPlatelet(String bloodPlatelet) {
        this.bloodPlatelet = bloodPlatelet;
    }

    public String getBloodPlasma() {
        return bloodPlasma;
    }

    public void setBloodPlasma(String bloodPlasma) {
        this.bloodPlasma = bloodPlasma;
    }

    public String getBloodWhole() {
        return bloodWhole;
    }

    public void setBloodWhole(String bloodWhole) {
        this.bloodWhole = bloodWhole;
    }

    public String getBloodOther() {
        return bloodOther;
    }

    public void setBloodOther(String bloodOther) {
        this.bloodOther = bloodOther;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getBeforeoperDays() {
        return beforeoperDays;
    }

    public void setBeforeoperDays(Integer beforeoperDays) {
        this.beforeoperDays = beforeoperDays;
    }

    public LocalDateTime getChangedeptDate() {
        return changedeptDate;
    }

    public void setChangedeptDate(LocalDateTime changedeptDate) {
        this.changedeptDate = changedeptDate;
    }

    public String getChangedeptcode() {
        return changedeptcode;
    }

    public void setChangedeptcode(String changedeptcode) {
        this.changedeptcode = changedeptcode;
    }

    public String getChangedeptcode2() {
        return changedeptcode2;
    }

    public void setChangedeptcode2(String changedeptcode2) {
        this.changedeptcode2 = changedeptcode2;
    }

    public String getBodyAnotomize() {
        return bodyAnotomize;
    }

    public void setBodyAnotomize(String bodyAnotomize) {
        this.bodyAnotomize = bodyAnotomize;
    }

    public String getAnaphyName() {
        return anaphyName;
    }

    public void setAnaphyName(String anaphyName) {
        this.anaphyName = anaphyName;
    }

    public String getYbNo() {
        return ybNo;
    }

    public void setYbNo(String ybNo) {
        this.ybNo = ybNo;
    }

    public String getYnInfectname() {
        return ynInfectname;
    }

    public void setYnInfectname(String ynInfectname) {
        this.ynInfectname = ynInfectname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSickroomIn() {
        return sickroomIn;
    }

    public void setSickroomIn(String sickroomIn) {
        this.sickroomIn = sickroomIn;
    }

    public String getSickroomChange() {
        return sickroomChange;
    }

    public void setSickroomChange(String sickroomChange) {
        this.sickroomChange = sickroomChange;
    }

    public String getSickroomOut() {
        return sickroomOut;
    }

    public void setSickroomOut(String sickroomOut) {
        this.sickroomOut = sickroomOut;
    }

    public String getUnitAge() {
        return unitAge;
    }

    public void setUnitAge(String unitAge) {
        this.unitAge = unitAge;
    }

    @Override
    public String toString() {
        return "Mrmsbase{" +
        "inpatientNo=" + inpatientNo +
        ", patientNo=" + patientNo +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", counCode=" + counCode +
        ", nationCode=" + nationCode +
        ", profCode=" + profCode +
        ", bloodCode=" + bloodCode +
        ", mari=" + mari +
        ", inSource=" + inSource +
        ", homeAdd=" + homeAdd +
        ", homeTel=" + homeTel +
        ", homeZip=" + homeZip +
        ", workName=" + workName +
        ", workTel=" + workTel +
        ", workZip=" + workZip +
        ", linkmaName=" + linkmaName +
        ", relaCode=" + relaCode +
        ", linkmanTel=" + linkmanTel +
        ", linkmanAdd=" + linkmanAdd +
        ", clinicIcd=" + clinicIcd +
        ", clinicIcdnm=" + clinicIcdnm +
        ", inDate=" + inDate +
        ", deptIn=" + deptIn +
        ", deptInnm=" + deptInnm +
        ", inAvenue=" + inAvenue +
        ", inCircs=" + inCircs +
        ", diagDate=" + diagDate +
        ", operDate=" + operDate +
        ", outDate=" + outDate +
        ", icdCode=" + icdCode +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", zg=" + zg +
        ", deadDate=" + deadDate +
        ", deadReason=" + deadReason +
        ", inTimes=" + inTimes +
        ", xNumb=" + xNumb +
        ", ctNumb=" + ctNumb +
        ", mriNumb=" + mriNumb +
        ", pathNumb=" + pathNumb +
        ", cePi=" + cePi +
        ", piPo=" + piPo +
        ", opbOpa=" + opbOpa +
        ", clX=" + clX +
        ", clCt=" + clCt +
        ", clMri=" + clMri +
        ", clPa=" + clPa +
        ", salvTimes=" + salvTimes +
        ", succTimes=" + succTimes +
        ", mrQual=" + mrQual +
        ", mrElig=" + mrElig +
        ", techSerc=" + techSerc +
        ", visiStat=" + visiStat +
        ", visiPeri=" + visiPeri +
        ", bodyCheck=" + bodyCheck +
        ", anaphyFlag=" + anaphyFlag +
        ", houseDocCode=" + houseDocCode +
        ", houseDocName=" + houseDocName +
        ", chargeDocCode=" + chargeDocCode +
        ", chargeDocName=" + chargeDocName +
        ", chiefDocCode=" + chiefDocCode +
        ", chiefDocName=" + chiefDocName +
        ", secoIn=" + secoIn +
        ", type167=" + type167 +
        ", type167e=" + type167e +
        ", diagDays=" + diagDays +
        ", piDays=" + piDays +
        ", piTimes=" + piTimes +
        ", diagToe=" + diagToe +
        ", deadKind=" + deadKind +
        ", outDate2=" + outDate2 +
        ", tendYn=" + tendYn +
        ", icdKind=" + icdKind +
        ", icdOther=" + icdOther +
        ", paykindCode=" + paykindCode +
        ", mother=" + mother +
        ", ynInfect=" + ynInfect +
        ", ynLowweigh=" + ynLowweigh +
        ", birthMode=" + birthMode +
        ", birthEnd=" + birthEnd +
        ", ynbaby=" + ynbaby +
        ", motherName=" + motherName +
        ", mrmsNo=" + mrmsNo +
        ", lenStus=" + lenStus +
        ", hbsag=" + hbsag +
        ", hcvAb=" + hcvAb +
        ", hivAb=" + hivAb +
        ", fsBl=" + fsBl +
        ", deptChiefCode=" + deptChiefCode +
        ", jxDocCode=" + jxDocCode +
        ", graDocCode=" + graDocCode +
        ", praDocCode=" + praDocCode +
        ", codeingCode=" + codeingCode +
        ", qualityDoc=" + qualityDoc +
        ", qualityNurse=" + qualityNurse +
        ", checkDate=" + checkDate +
        ", ynFirst=" + ynFirst +
        ", rhBlood=" + rhBlood +
        ", reactionBlood=" + reactionBlood +
        ", bloodKind=" + bloodKind +
        ", ynPrint=" + ynPrint +
        ", preDate=" + preDate +
        ", laseOperdate=" + laseOperdate +
        ", idcardno=" + idcardno +
        ", homeplace=" + homeplace +
        ", lastOperator=" + lastOperator +
        ", dsaNumb=" + dsaNumb +
        ", petNumb=" + petNumb +
        ", ectNumb=" + ectNumb +
        ", xTimes=" + xTimes +
        ", ctTimes=" + ctTimes +
        ", mrTimes=" + mrTimes +
        ", dsaTimes=" + dsaTimes +
        ", petTimes=" + petTimes +
        ", ectTimes=" + ectTimes +
        ", bloodRed=" + bloodRed +
        ", bloodPlatelet=" + bloodPlatelet +
        ", bloodPlasma=" + bloodPlasma +
        ", bloodWhole=" + bloodWhole +
        ", bloodOther=" + bloodOther +
        ", remark=" + remark +
        ", beforeoperDays=" + beforeoperDays +
        ", changedeptDate=" + changedeptDate +
        ", changedeptcode=" + changedeptcode +
        ", changedeptcode2=" + changedeptcode2 +
        ", bodyAnotomize=" + bodyAnotomize +
        ", anaphyName=" + anaphyName +
        ", ybNo=" + ybNo +
        ", ynInfectname=" + ynInfectname +
        ", age=" + age +
        ", sickroomIn=" + sickroomIn +
        ", sickroomChange=" + sickroomChange +
        ", sickroomOut=" + sickroomOut +
        ", unitAge=" + unitAge +
        "}";
    }
}
