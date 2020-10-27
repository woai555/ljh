package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 配药单资料档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpdqumt implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 药房代码
     */
    @TableId(value = "DRUGED_DEPTCD", type = IdType.AUTO)
    private String drugedDeptcd;

    /**
     * 药房名称
     */
    private String drugedDeptnm;

    /**
     * 配药日期
     */
    private LocalDateTime drugedDate;

    /**
     * 配药单属性：1长期明细/2临时明细/3汇总
     */
    private String queType;

    /**
     * 配药单组别代码--mdpdqutp.que_code
     */
    private String setCode;

    /**
     * 配药单号
     */
    private String setSeqn;

    /**
     * 住院科室代码
     */
    private String deptCode;

    /**
     * 住院科室名称
     */
    private String deptName;

    /**
     * 护士站代码
     */
    private String nurseCellCode;

    /**
     * 护士站名称
     */
    private String nurseCellName;

    /**
     * 住院流水号
     */
    private String inpatientNo;

    /**
     * 床位号
     */
    private String bedNo;

    /**
     * 住院号
     */
    private String patientNo;

    /**
     * 患者姓名
     */
    private String name;

    /**
     * 患者性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 药品编码
     */
    private String drugCode;

    /**
     * 药品院内代码
     */
    private String userCode;

    /**
     * 药品名称
     */
    private String tradeName;

    /**
     * 药品规格
     */
    private String specs;

    /**
     * 基本剂量
     */
    private BigDecimal baseDose;

    /**
     * 剂量单位
     */
    private String doseUnit;

    /**
     * 每次剂量
     */
    private BigDecimal doseOnce;

    /**
     * 用法代码
     */
    private String usageCode;

    /**
     * 用法英文代码
     */
    private String englishAb;

    /**
     * 用法名称
     */
    private String useName;

    /**
     * 频次代码
     */
    private String dfqFreq;

    /**
     * 频次名称
     */
    private String dfqCexp;

    /**
     * 总量
     */
    private BigDecimal qtyTot;

    /**
     * 最小单位
     */
    private String minUnit;

    /**
     * 单价
     */
    private BigDecimal salePrice;

    /**
     * 处方流水号
     */
    private String noteNo;

    /**
     * 打印状态:1未打印/2已打
     */
    private String prnFlag;

    /**
     * 摆药员代码
     */
    private String drugedOpcd;

    /**
     * 摆药员姓名
     */
    private String drugedOpnm;

    /**
     * 打印日期
     */
    private LocalDateTime prnDate;

    /**
     * 打印员代码
     */
    private String prnOpcd;

    /**
     * 打印员姓名
     */
    private String prnOpnm;

    /**
     * 摆药天数
     */
    private Integer days;

    /**
     * 付数（草药）
     */
    private Integer potion;

    /**
     * 组合序号
     */
    private String combNo;

    /**
     * 库存流水号
     */
    private Long sequenceCode;


    public String getDrugedDeptcd() {
        return drugedDeptcd;
    }

    public void setDrugedDeptcd(String drugedDeptcd) {
        this.drugedDeptcd = drugedDeptcd;
    }

    public String getDrugedDeptnm() {
        return drugedDeptnm;
    }

    public void setDrugedDeptnm(String drugedDeptnm) {
        this.drugedDeptnm = drugedDeptnm;
    }

    public LocalDateTime getDrugedDate() {
        return drugedDate;
    }

    public void setDrugedDate(LocalDateTime drugedDate) {
        this.drugedDate = drugedDate;
    }

    public String getQueType() {
        return queType;
    }

    public void setQueType(String queType) {
        this.queType = queType;
    }

    public String getSetCode() {
        return setCode;
    }

    public void setSetCode(String setCode) {
        this.setCode = setCode;
    }

    public String getSetSeqn() {
        return setSeqn;
    }

    public void setSetSeqn(String setSeqn) {
        this.setSeqn = setSeqn;
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

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public BigDecimal getBaseDose() {
        return baseDose;
    }

    public void setBaseDose(BigDecimal baseDose) {
        this.baseDose = baseDose;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    public BigDecimal getDoseOnce() {
        return doseOnce;
    }

    public void setDoseOnce(BigDecimal doseOnce) {
        this.doseOnce = doseOnce;
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode;
    }

    public String getEnglishAb() {
        return englishAb;
    }

    public void setEnglishAb(String englishAb) {
        this.englishAb = englishAb;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getDfqFreq() {
        return dfqFreq;
    }

    public void setDfqFreq(String dfqFreq) {
        this.dfqFreq = dfqFreq;
    }

    public String getDfqCexp() {
        return dfqCexp;
    }

    public void setDfqCexp(String dfqCexp) {
        this.dfqCexp = dfqCexp;
    }

    public BigDecimal getQtyTot() {
        return qtyTot;
    }

    public void setQtyTot(BigDecimal qtyTot) {
        this.qtyTot = qtyTot;
    }

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getNoteNo() {
        return noteNo;
    }

    public void setNoteNo(String noteNo) {
        this.noteNo = noteNo;
    }

    public String getPrnFlag() {
        return prnFlag;
    }

    public void setPrnFlag(String prnFlag) {
        this.prnFlag = prnFlag;
    }

    public String getDrugedOpcd() {
        return drugedOpcd;
    }

    public void setDrugedOpcd(String drugedOpcd) {
        this.drugedOpcd = drugedOpcd;
    }

    public String getDrugedOpnm() {
        return drugedOpnm;
    }

    public void setDrugedOpnm(String drugedOpnm) {
        this.drugedOpnm = drugedOpnm;
    }

    public LocalDateTime getPrnDate() {
        return prnDate;
    }

    public void setPrnDate(LocalDateTime prnDate) {
        this.prnDate = prnDate;
    }

    public String getPrnOpcd() {
        return prnOpcd;
    }

    public void setPrnOpcd(String prnOpcd) {
        this.prnOpcd = prnOpcd;
    }

    public String getPrnOpnm() {
        return prnOpnm;
    }

    public void setPrnOpnm(String prnOpnm) {
        this.prnOpnm = prnOpnm;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getPotion() {
        return potion;
    }

    public void setPotion(Integer potion) {
        this.potion = potion;
    }

    public String getCombNo() {
        return combNo;
    }

    public void setCombNo(String combNo) {
        this.combNo = combNo;
    }

    public Long getSequenceCode() {
        return sequenceCode;
    }

    public void setSequenceCode(Long sequenceCode) {
        this.sequenceCode = sequenceCode;
    }

    @Override
    public String toString() {
        return "Mdpdqumt{" +
        "drugedDeptcd=" + drugedDeptcd +
        ", drugedDeptnm=" + drugedDeptnm +
        ", drugedDate=" + drugedDate +
        ", queType=" + queType +
        ", setCode=" + setCode +
        ", setSeqn=" + setSeqn +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", nurseCellCode=" + nurseCellCode +
        ", nurseCellName=" + nurseCellName +
        ", inpatientNo=" + inpatientNo +
        ", bedNo=" + bedNo +
        ", patientNo=" + patientNo +
        ", name=" + name +
        ", sex=" + sex +
        ", age=" + age +
        ", drugCode=" + drugCode +
        ", userCode=" + userCode +
        ", tradeName=" + tradeName +
        ", specs=" + specs +
        ", baseDose=" + baseDose +
        ", doseUnit=" + doseUnit +
        ", doseOnce=" + doseOnce +
        ", usageCode=" + usageCode +
        ", englishAb=" + englishAb +
        ", useName=" + useName +
        ", dfqFreq=" + dfqFreq +
        ", dfqCexp=" + dfqCexp +
        ", qtyTot=" + qtyTot +
        ", minUnit=" + minUnit +
        ", salePrice=" + salePrice +
        ", noteNo=" + noteNo +
        ", prnFlag=" + prnFlag +
        ", drugedOpcd=" + drugedOpcd +
        ", drugedOpnm=" + drugedOpnm +
        ", prnDate=" + prnDate +
        ", prnOpcd=" + prnOpcd +
        ", prnOpnm=" + prnOpnm +
        ", days=" + days +
        ", potion=" + potion +
        ", combNo=" + combNo +
        ", sequenceCode=" + sequenceCode +
        "}";
    }
}
