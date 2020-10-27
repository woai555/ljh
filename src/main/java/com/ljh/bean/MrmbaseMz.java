package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 门诊病案首页
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MrmbaseMz implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 门诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 挂号时间
     */
    private LocalDateTime regDtime;

    /**
     * 序号
     */
    private BigDecimal xh;

    /**
     * 病案首页登记人
     */
    private String oper;

    /**
     * 病案首页录入时间
     */
    private LocalDateTime operDate;

    /**
     * 姓名
     */
    private String pname;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private LocalDateTime birthday;

    /**
     * 年龄，一周岁上的用
     */
    private BigDecimal ageYears;

    /**
     * 年龄，不足一周岁的填写天数
     */
    private BigDecimal ageDays;

    /**
     * 国籍代码
     */
    private String nationality;

    /**
     * 民族
     */
    private String nation;

    /**
     * 身份证
     */
    private String idenNo;

    /**
     * 婚姻状况
     */
    private String marriage;

    /**
     * 出生地省（区、市）
     */
    private String birthSheng;

    /**
     * 出生地市
     */
    private String birthShi;

    /**
     * 出生地县
     */
    private String birthXian;

    /**
     * 现住址区县代码
     */
    private String liveAddcode;

    /**
     * 现住址省（区、市）（居住半年以上）
     */
    private String liveSheng;

    /**
     * 现住址市
     */
    private String liveShi;

    /**
     * 现住址县
     */
    private String liveXian;

    /**
     * 现住址邮政编码（居住半年以上）
     */
    private String liveCode;

    /**
     * 职业编码
     */
    private String professionCode;

    /**
     * 工作单位及地址
     */
    private String workAdd;

    /**
     * 工作单位电话
     */
    private String workTel;

    /**
     * 工作单位邮政编码
     */
    private String workYb;

    /**
     * 联系人姓名
     */
    private String linkName;

    /**
     * 联系人关系代码
     */
    private String linkCode;

    /**
     * 联系人地址
     */
    private String linkAdd;

    /**
     * 联系人电话
     */
    private String linkTel;

    /**
     * 医疗付费方式代码
     */
    private String paykindCode;

    /**
     * 医疗保险手册(卡)号
     */
    private String mcardNo;

    /**
     * 门急诊ID(院内门急诊唯一标识)
     */
    private String clinicCode;

    /**
     * 医联码
     */
    private String ylCardno;

    /**
     * 就诊科别代码
     */
    private String deptCode;

    /**
     * 就诊类别代码
     */
    private String medicalType;

    /**
     * 就诊日期
     */
    private LocalDateTime regDate;

    /**
     * 治疗开始日期
     */
    private LocalDateTime treatBgndate;

    /**
     * 治疗结束日期
     */
    private LocalDateTime treatEnddate;

    /**
     * 急诊入观日期
     */
    private LocalDateTime inDate;

    /**
     * 急诊出观日期
     */
    private LocalDateTime outDate;

    /**
     * 急诊留观患者离院方式代码
     */
    private String outType;

    /**
     * 拟接收医疗机构名称
     */
    private String receiveHospital;

    /**
     * 科主任
     */
    private String director;

    /**
     * 副主任医师
     */
    private String directorVice;

    /**
     * 主治医师
     */
    private String doctCharge;

    /**
     * 住院医师
     */
    private String doctResident;

    /**
     * 主诊医师
     */
    private String doctAttend;

    /**
     * 医师签名（医师执业证书编码）
     */
    private String doctCode;

    /**
     * 总费用
     */
    private BigDecimal costAll;

    /**
     * 自付费用
     */
    private BigDecimal costOwn;

    /**
     * 诊察费
     */
    private BigDecimal costZc;

    /**
     * 一般检查费
     */
    private BigDecimal costExamGeneral;

    /**
     * 临床物理治疗费
     */
    private BigDecimal costPhysicTreat;

    /**
     * 介入治疗费
     */
    private BigDecimal costIntervene;

    /**
     * 特殊治疗费
     */
    private BigDecimal costSpecTreat;

    /**
     * 康复治疗费
     */
    private BigDecimal costRecoverTreat;

    /**
     * 中医治疗费
     */
    private BigDecimal costTcm;

    /**
     * 一般治疗费
     */
    private BigDecimal costTreatGeneral;

    /**
     * 精神治疗费
     */
    private BigDecimal costMindTreat;

    /**
     * 接生费
     */
    private BigDecimal costMidwife;

    /**
     * 麻醉费
     */
    private BigDecimal costAnesth;

    /**
     * 手术费
     */
    private BigDecimal costOperation;

    /**
     * 护理治疗费
     */
    private BigDecimal costNursingTreat;

    /**
     * 护理费
     */
    private BigDecimal costNursing;

    /**
     * 核素检查
     */
    private BigDecimal costNuclideExam;

    /**
     * 核素治疗
     */
    private BigDecimal costNuclideTreat;

    /**
     * 超声费
     */
    private BigDecimal costUltra;

    /**
     * 放射费
     */
    private BigDecimal costXray;

    /**
     * 化验费
     */
    private BigDecimal costLabExam;

    /**
     * 病历费
     */
    private BigDecimal costPathology;

    /**
     * 监护及辅助呼吸费
     */
    private BigDecimal costRic;

    /**
     * 治疗用一次性医用材料费
     */
    private BigDecimal costMatTreat;

    /**
     * 介入用一次性医用材料费
     */
    private BigDecimal costMatIntervene;

    /**
     * 手术用一次性医用材料费
     */
    private BigDecimal costMatOper;

    /**
     * 检查用一次性医用材料费
     */
    private BigDecimal costMatExam;

    /**
     * 床位费
     */
    private BigDecimal costDailyroom;

    /**
     * 挂号费
     */
    private BigDecimal costReg;

    /**
     * 输氧费
     */
    private BigDecimal costOxygen;

    /**
     * 输血费
     */
    private BigDecimal costBlood;

    /**
     * 西药费
     */
    private BigDecimal costMedicine;

    /**
     * 抗菌药物费
     */
    private BigDecimal costAntibiotic;

    /**
     * 白蛋白类制品费
     */
    private BigDecimal costAlbumin;

    /**
     * 球蛋白类制品费
     */
    private BigDecimal costGlobulin;

    /**
     * 凝血因子类制品费
     */
    private BigDecimal costCoagulation;

    /**
     * 细胞因子类制品费
     */
    private BigDecimal costCytokine;

    /**
     * 中成药费
     */
    private BigDecimal costTHerb;

    /**
     * 中草药房
     */
    private BigDecimal costTMedicine;

    /**
     * 其他费用
     */
    private BigDecimal costOther;

    /**
     * 审核标志
     */
    private String examFlag;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDtime() {
        return regDtime;
    }

    public void setRegDtime(LocalDateTime regDtime) {
        this.regDtime = regDtime;
    }

    public BigDecimal getXh() {
        return xh;
    }

    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

    public BigDecimal getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(BigDecimal ageYears) {
        this.ageYears = ageYears;
    }

    public BigDecimal getAgeDays() {
        return ageDays;
    }

    public void setAgeDays(BigDecimal ageDays) {
        this.ageDays = ageDays;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdenNo() {
        return idenNo;
    }

    public void setIdenNo(String idenNo) {
        this.idenNo = idenNo;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getBirthSheng() {
        return birthSheng;
    }

    public void setBirthSheng(String birthSheng) {
        this.birthSheng = birthSheng;
    }

    public String getBirthShi() {
        return birthShi;
    }

    public void setBirthShi(String birthShi) {
        this.birthShi = birthShi;
    }

    public String getBirthXian() {
        return birthXian;
    }

    public void setBirthXian(String birthXian) {
        this.birthXian = birthXian;
    }

    public String getLiveAddcode() {
        return liveAddcode;
    }

    public void setLiveAddcode(String liveAddcode) {
        this.liveAddcode = liveAddcode;
    }

    public String getLiveSheng() {
        return liveSheng;
    }

    public void setLiveSheng(String liveSheng) {
        this.liveSheng = liveSheng;
    }

    public String getLiveShi() {
        return liveShi;
    }

    public void setLiveShi(String liveShi) {
        this.liveShi = liveShi;
    }

    public String getLiveXian() {
        return liveXian;
    }

    public void setLiveXian(String liveXian) {
        this.liveXian = liveXian;
    }

    public String getLiveCode() {
        return liveCode;
    }

    public void setLiveCode(String liveCode) {
        this.liveCode = liveCode;
    }

    public String getProfessionCode() {
        return professionCode;
    }

    public void setProfessionCode(String professionCode) {
        this.professionCode = professionCode;
    }

    public String getWorkAdd() {
        return workAdd;
    }

    public void setWorkAdd(String workAdd) {
        this.workAdd = workAdd;
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    public String getWorkYb() {
        return workYb;
    }

    public void setWorkYb(String workYb) {
        this.workYb = workYb;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getLinkAdd() {
        return linkAdd;
    }

    public void setLinkAdd(String linkAdd) {
        this.linkAdd = linkAdd;
    }

    public String getLinkTel() {
        return linkTel;
    }

    public void setLinkTel(String linkTel) {
        this.linkTel = linkTel;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public String getYlCardno() {
        return ylCardno;
    }

    public void setYlCardno(String ylCardno) {
        this.ylCardno = ylCardno;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public LocalDateTime getTreatBgndate() {
        return treatBgndate;
    }

    public void setTreatBgndate(LocalDateTime treatBgndate) {
        this.treatBgndate = treatBgndate;
    }

    public LocalDateTime getTreatEnddate() {
        return treatEnddate;
    }

    public void setTreatEnddate(LocalDateTime treatEnddate) {
        this.treatEnddate = treatEnddate;
    }

    public LocalDateTime getInDate() {
        return inDate;
    }

    public void setInDate(LocalDateTime inDate) {
        this.inDate = inDate;
    }

    public LocalDateTime getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDateTime outDate) {
        this.outDate = outDate;
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType;
    }

    public String getReceiveHospital() {
        return receiveHospital;
    }

    public void setReceiveHospital(String receiveHospital) {
        this.receiveHospital = receiveHospital;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirectorVice() {
        return directorVice;
    }

    public void setDirectorVice(String directorVice) {
        this.directorVice = directorVice;
    }

    public String getDoctCharge() {
        return doctCharge;
    }

    public void setDoctCharge(String doctCharge) {
        this.doctCharge = doctCharge;
    }

    public String getDoctResident() {
        return doctResident;
    }

    public void setDoctResident(String doctResident) {
        this.doctResident = doctResident;
    }

    public String getDoctAttend() {
        return doctAttend;
    }

    public void setDoctAttend(String doctAttend) {
        this.doctAttend = doctAttend;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public BigDecimal getCostAll() {
        return costAll;
    }

    public void setCostAll(BigDecimal costAll) {
        this.costAll = costAll;
    }

    public BigDecimal getCostOwn() {
        return costOwn;
    }

    public void setCostOwn(BigDecimal costOwn) {
        this.costOwn = costOwn;
    }

    public BigDecimal getCostZc() {
        return costZc;
    }

    public void setCostZc(BigDecimal costZc) {
        this.costZc = costZc;
    }

    public BigDecimal getCostExamGeneral() {
        return costExamGeneral;
    }

    public void setCostExamGeneral(BigDecimal costExamGeneral) {
        this.costExamGeneral = costExamGeneral;
    }

    public BigDecimal getCostPhysicTreat() {
        return costPhysicTreat;
    }

    public void setCostPhysicTreat(BigDecimal costPhysicTreat) {
        this.costPhysicTreat = costPhysicTreat;
    }

    public BigDecimal getCostIntervene() {
        return costIntervene;
    }

    public void setCostIntervene(BigDecimal costIntervene) {
        this.costIntervene = costIntervene;
    }

    public BigDecimal getCostSpecTreat() {
        return costSpecTreat;
    }

    public void setCostSpecTreat(BigDecimal costSpecTreat) {
        this.costSpecTreat = costSpecTreat;
    }

    public BigDecimal getCostRecoverTreat() {
        return costRecoverTreat;
    }

    public void setCostRecoverTreat(BigDecimal costRecoverTreat) {
        this.costRecoverTreat = costRecoverTreat;
    }

    public BigDecimal getCostTcm() {
        return costTcm;
    }

    public void setCostTcm(BigDecimal costTcm) {
        this.costTcm = costTcm;
    }

    public BigDecimal getCostTreatGeneral() {
        return costTreatGeneral;
    }

    public void setCostTreatGeneral(BigDecimal costTreatGeneral) {
        this.costTreatGeneral = costTreatGeneral;
    }

    public BigDecimal getCostMindTreat() {
        return costMindTreat;
    }

    public void setCostMindTreat(BigDecimal costMindTreat) {
        this.costMindTreat = costMindTreat;
    }

    public BigDecimal getCostMidwife() {
        return costMidwife;
    }

    public void setCostMidwife(BigDecimal costMidwife) {
        this.costMidwife = costMidwife;
    }

    public BigDecimal getCostAnesth() {
        return costAnesth;
    }

    public void setCostAnesth(BigDecimal costAnesth) {
        this.costAnesth = costAnesth;
    }

    public BigDecimal getCostOperation() {
        return costOperation;
    }

    public void setCostOperation(BigDecimal costOperation) {
        this.costOperation = costOperation;
    }

    public BigDecimal getCostNursingTreat() {
        return costNursingTreat;
    }

    public void setCostNursingTreat(BigDecimal costNursingTreat) {
        this.costNursingTreat = costNursingTreat;
    }

    public BigDecimal getCostNursing() {
        return costNursing;
    }

    public void setCostNursing(BigDecimal costNursing) {
        this.costNursing = costNursing;
    }

    public BigDecimal getCostNuclideExam() {
        return costNuclideExam;
    }

    public void setCostNuclideExam(BigDecimal costNuclideExam) {
        this.costNuclideExam = costNuclideExam;
    }

    public BigDecimal getCostNuclideTreat() {
        return costNuclideTreat;
    }

    public void setCostNuclideTreat(BigDecimal costNuclideTreat) {
        this.costNuclideTreat = costNuclideTreat;
    }

    public BigDecimal getCostUltra() {
        return costUltra;
    }

    public void setCostUltra(BigDecimal costUltra) {
        this.costUltra = costUltra;
    }

    public BigDecimal getCostXray() {
        return costXray;
    }

    public void setCostXray(BigDecimal costXray) {
        this.costXray = costXray;
    }

    public BigDecimal getCostLabExam() {
        return costLabExam;
    }

    public void setCostLabExam(BigDecimal costLabExam) {
        this.costLabExam = costLabExam;
    }

    public BigDecimal getCostPathology() {
        return costPathology;
    }

    public void setCostPathology(BigDecimal costPathology) {
        this.costPathology = costPathology;
    }

    public BigDecimal getCostRic() {
        return costRic;
    }

    public void setCostRic(BigDecimal costRic) {
        this.costRic = costRic;
    }

    public BigDecimal getCostMatTreat() {
        return costMatTreat;
    }

    public void setCostMatTreat(BigDecimal costMatTreat) {
        this.costMatTreat = costMatTreat;
    }

    public BigDecimal getCostMatIntervene() {
        return costMatIntervene;
    }

    public void setCostMatIntervene(BigDecimal costMatIntervene) {
        this.costMatIntervene = costMatIntervene;
    }

    public BigDecimal getCostMatOper() {
        return costMatOper;
    }

    public void setCostMatOper(BigDecimal costMatOper) {
        this.costMatOper = costMatOper;
    }

    public BigDecimal getCostMatExam() {
        return costMatExam;
    }

    public void setCostMatExam(BigDecimal costMatExam) {
        this.costMatExam = costMatExam;
    }

    public BigDecimal getCostDailyroom() {
        return costDailyroom;
    }

    public void setCostDailyroom(BigDecimal costDailyroom) {
        this.costDailyroom = costDailyroom;
    }

    public BigDecimal getCostReg() {
        return costReg;
    }

    public void setCostReg(BigDecimal costReg) {
        this.costReg = costReg;
    }

    public BigDecimal getCostOxygen() {
        return costOxygen;
    }

    public void setCostOxygen(BigDecimal costOxygen) {
        this.costOxygen = costOxygen;
    }

    public BigDecimal getCostBlood() {
        return costBlood;
    }

    public void setCostBlood(BigDecimal costBlood) {
        this.costBlood = costBlood;
    }

    public BigDecimal getCostMedicine() {
        return costMedicine;
    }

    public void setCostMedicine(BigDecimal costMedicine) {
        this.costMedicine = costMedicine;
    }

    public BigDecimal getCostAntibiotic() {
        return costAntibiotic;
    }

    public void setCostAntibiotic(BigDecimal costAntibiotic) {
        this.costAntibiotic = costAntibiotic;
    }

    public BigDecimal getCostAlbumin() {
        return costAlbumin;
    }

    public void setCostAlbumin(BigDecimal costAlbumin) {
        this.costAlbumin = costAlbumin;
    }

    public BigDecimal getCostGlobulin() {
        return costGlobulin;
    }

    public void setCostGlobulin(BigDecimal costGlobulin) {
        this.costGlobulin = costGlobulin;
    }

    public BigDecimal getCostCoagulation() {
        return costCoagulation;
    }

    public void setCostCoagulation(BigDecimal costCoagulation) {
        this.costCoagulation = costCoagulation;
    }

    public BigDecimal getCostCytokine() {
        return costCytokine;
    }

    public void setCostCytokine(BigDecimal costCytokine) {
        this.costCytokine = costCytokine;
    }

    public BigDecimal getCostTHerb() {
        return costTHerb;
    }

    public void setCostTHerb(BigDecimal costTHerb) {
        this.costTHerb = costTHerb;
    }

    public BigDecimal getCostTMedicine() {
        return costTMedicine;
    }

    public void setCostTMedicine(BigDecimal costTMedicine) {
        this.costTMedicine = costTMedicine;
    }

    public BigDecimal getCostOther() {
        return costOther;
    }

    public void setCostOther(BigDecimal costOther) {
        this.costOther = costOther;
    }

    public String getExamFlag() {
        return examFlag;
    }

    public void setExamFlag(String examFlag) {
        this.examFlag = examFlag;
    }

    @Override
    public String toString() {
        return "MrmbaseMz{" +
        "cardNo=" + cardNo +
        ", regDtime=" + regDtime +
        ", xh=" + xh +
        ", oper=" + oper +
        ", operDate=" + operDate +
        ", pname=" + pname +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", ageYears=" + ageYears +
        ", ageDays=" + ageDays +
        ", nationality=" + nationality +
        ", nation=" + nation +
        ", idenNo=" + idenNo +
        ", marriage=" + marriage +
        ", birthSheng=" + birthSheng +
        ", birthShi=" + birthShi +
        ", birthXian=" + birthXian +
        ", liveAddcode=" + liveAddcode +
        ", liveSheng=" + liveSheng +
        ", liveShi=" + liveShi +
        ", liveXian=" + liveXian +
        ", liveCode=" + liveCode +
        ", professionCode=" + professionCode +
        ", workAdd=" + workAdd +
        ", workTel=" + workTel +
        ", workYb=" + workYb +
        ", linkName=" + linkName +
        ", linkCode=" + linkCode +
        ", linkAdd=" + linkAdd +
        ", linkTel=" + linkTel +
        ", paykindCode=" + paykindCode +
        ", mcardNo=" + mcardNo +
        ", clinicCode=" + clinicCode +
        ", ylCardno=" + ylCardno +
        ", deptCode=" + deptCode +
        ", medicalType=" + medicalType +
        ", regDate=" + regDate +
        ", treatBgndate=" + treatBgndate +
        ", treatEnddate=" + treatEnddate +
        ", inDate=" + inDate +
        ", outDate=" + outDate +
        ", outType=" + outType +
        ", receiveHospital=" + receiveHospital +
        ", director=" + director +
        ", directorVice=" + directorVice +
        ", doctCharge=" + doctCharge +
        ", doctResident=" + doctResident +
        ", doctAttend=" + doctAttend +
        ", doctCode=" + doctCode +
        ", costAll=" + costAll +
        ", costOwn=" + costOwn +
        ", costZc=" + costZc +
        ", costExamGeneral=" + costExamGeneral +
        ", costPhysicTreat=" + costPhysicTreat +
        ", costIntervene=" + costIntervene +
        ", costSpecTreat=" + costSpecTreat +
        ", costRecoverTreat=" + costRecoverTreat +
        ", costTcm=" + costTcm +
        ", costTreatGeneral=" + costTreatGeneral +
        ", costMindTreat=" + costMindTreat +
        ", costMidwife=" + costMidwife +
        ", costAnesth=" + costAnesth +
        ", costOperation=" + costOperation +
        ", costNursingTreat=" + costNursingTreat +
        ", costNursing=" + costNursing +
        ", costNuclideExam=" + costNuclideExam +
        ", costNuclideTreat=" + costNuclideTreat +
        ", costUltra=" + costUltra +
        ", costXray=" + costXray +
        ", costLabExam=" + costLabExam +
        ", costPathology=" + costPathology +
        ", costRic=" + costRic +
        ", costMatTreat=" + costMatTreat +
        ", costMatIntervene=" + costMatIntervene +
        ", costMatOper=" + costMatOper +
        ", costMatExam=" + costMatExam +
        ", costDailyroom=" + costDailyroom +
        ", costReg=" + costReg +
        ", costOxygen=" + costOxygen +
        ", costBlood=" + costBlood +
        ", costMedicine=" + costMedicine +
        ", costAntibiotic=" + costAntibiotic +
        ", costAlbumin=" + costAlbumin +
        ", costGlobulin=" + costGlobulin +
        ", costCoagulation=" + costCoagulation +
        ", costCytokine=" + costCytokine +
        ", costTHerb=" + costTHerb +
        ", costTMedicine=" + costTMedicine +
        ", costOther=" + costOther +
        ", examFlag=" + examFlag +
        "}";
    }
}
