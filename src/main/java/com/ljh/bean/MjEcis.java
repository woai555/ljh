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
public class MjEcis implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 分诊流水号
     */
    @TableId(value = "TRIAGESERIALNO", type = IdType.AUTO)
    private String triageserialno;

    /**
     * 门诊卡号
     */
    private String patientid;

    /**
     * 证件号码
     */
    private String documentno;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别 1男2女 3未知
     */
    private String sex;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 民族
     */
    private String nation;

    /**
     * 费别patientinfo.chargetype
     */
    private String chargetype;

    /**
     * 联系人
     */
    private String contactperson;

    /**
     * 联系电话
     */
    private String contactphone;

    /**
     * 地址
     */
    private String address;

    /**
     * 医保卡号
     */
    private String cardno;

    /**
     * 1:京医通 2医保
     */
    private Integer cardtype;

    /**
     * 去向科室编码
     */
    private String triagedirectioncode;

    /**
     * 去向科室名称
     */
    private String triagedirectionname;

    /**
     * 操作员
     */
    private String operatorname;

    /**
     * 参考 patientinfo.chargetypecode
     */
    private String chargetypecode;

    /**
     * 证件类型
     */
    private String identype;

    /**
     * 分诊级别 字典视图 dict_level
     */
    private String ecislevel;

    /**
     * 分诊时间
     */
    private LocalDateTime operdate;

    /**
     * 体温
     */
    private BigDecimal animalHeat;

    /**
     * 血压
     */
    private String bloodPressure;

    /**
     * 神智 字典视图 dict_mind
     */
    private String mind;

    /**
     * 脉搏
     */
    private Integer pulse;

    /**
     * 呼吸
     */
    private Integer breath;

    /**
     * 血氧
     */
    private Integer bloodOxygen;

    /**
     * 体重
     */
    private BigDecimal weight;

    /**
     * 症状大类编码<数据字典:dict_symptom>
     */
    private BigDecimal symptomCode1;

    private BigDecimal symptomCode2;

    private BigDecimal symptomCode3;

    private BigDecimal symptomCode4;

    private BigDecimal symptomCode5;

    /**
     * 症状明细编码<数据字典:dict_symptom>
     */
    private BigDecimal symptomdetailCode1;

    /**
     * 症状明细名称
     */
    private String symptomdetailName1;

    private BigDecimal symptomdetailCode2;

    private String symptomdetailName2;

    private BigDecimal symptomdetailCode3;

    private String symptomdetailName3;

    private BigDecimal symptomdetailCode4;

    private String symptomdetailName4;

    private BigDecimal symptomdetailCode5;

    private String symptomdetailName5;

    /**
     * 来院方式
     */
    private String comeType;


    public String getTriageserialno() {
        return triageserialno;
    }

    public void setTriageserialno(String triageserialno) {
        this.triageserialno = triageserialno;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getDocumentno() {
        return documentno;
    }

    public void setDocumentno(String documentno) {
        this.documentno = documentno;
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

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getChargetype() {
        return chargetype;
    }

    public void setChargetype(String chargetype) {
        this.chargetype = chargetype;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Integer getCardtype() {
        return cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    public String getTriagedirectioncode() {
        return triagedirectioncode;
    }

    public void setTriagedirectioncode(String triagedirectioncode) {
        this.triagedirectioncode = triagedirectioncode;
    }

    public String getTriagedirectionname() {
        return triagedirectionname;
    }

    public void setTriagedirectionname(String triagedirectionname) {
        this.triagedirectionname = triagedirectionname;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public String getChargetypecode() {
        return chargetypecode;
    }

    public void setChargetypecode(String chargetypecode) {
        this.chargetypecode = chargetypecode;
    }

    public String getIdentype() {
        return identype;
    }

    public void setIdentype(String identype) {
        this.identype = identype;
    }

    public String getEcislevel() {
        return ecislevel;
    }

    public void setEcislevel(String ecislevel) {
        this.ecislevel = ecislevel;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    public BigDecimal getAnimalHeat() {
        return animalHeat;
    }

    public void setAnimalHeat(BigDecimal animalHeat) {
        this.animalHeat = animalHeat;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getMind() {
        return mind;
    }

    public void setMind(String mind) {
        this.mind = mind;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public Integer getBreath() {
        return breath;
    }

    public void setBreath(Integer breath) {
        this.breath = breath;
    }

    public Integer getBloodOxygen() {
        return bloodOxygen;
    }

    public void setBloodOxygen(Integer bloodOxygen) {
        this.bloodOxygen = bloodOxygen;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getSymptomCode1() {
        return symptomCode1;
    }

    public void setSymptomCode1(BigDecimal symptomCode1) {
        this.symptomCode1 = symptomCode1;
    }

    public BigDecimal getSymptomCode2() {
        return symptomCode2;
    }

    public void setSymptomCode2(BigDecimal symptomCode2) {
        this.symptomCode2 = symptomCode2;
    }

    public BigDecimal getSymptomCode3() {
        return symptomCode3;
    }

    public void setSymptomCode3(BigDecimal symptomCode3) {
        this.symptomCode3 = symptomCode3;
    }

    public BigDecimal getSymptomCode4() {
        return symptomCode4;
    }

    public void setSymptomCode4(BigDecimal symptomCode4) {
        this.symptomCode4 = symptomCode4;
    }

    public BigDecimal getSymptomCode5() {
        return symptomCode5;
    }

    public void setSymptomCode5(BigDecimal symptomCode5) {
        this.symptomCode5 = symptomCode5;
    }

    public BigDecimal getSymptomdetailCode1() {
        return symptomdetailCode1;
    }

    public void setSymptomdetailCode1(BigDecimal symptomdetailCode1) {
        this.symptomdetailCode1 = symptomdetailCode1;
    }

    public String getSymptomdetailName1() {
        return symptomdetailName1;
    }

    public void setSymptomdetailName1(String symptomdetailName1) {
        this.symptomdetailName1 = symptomdetailName1;
    }

    public BigDecimal getSymptomdetailCode2() {
        return symptomdetailCode2;
    }

    public void setSymptomdetailCode2(BigDecimal symptomdetailCode2) {
        this.symptomdetailCode2 = symptomdetailCode2;
    }

    public String getSymptomdetailName2() {
        return symptomdetailName2;
    }

    public void setSymptomdetailName2(String symptomdetailName2) {
        this.symptomdetailName2 = symptomdetailName2;
    }

    public BigDecimal getSymptomdetailCode3() {
        return symptomdetailCode3;
    }

    public void setSymptomdetailCode3(BigDecimal symptomdetailCode3) {
        this.symptomdetailCode3 = symptomdetailCode3;
    }

    public String getSymptomdetailName3() {
        return symptomdetailName3;
    }

    public void setSymptomdetailName3(String symptomdetailName3) {
        this.symptomdetailName3 = symptomdetailName3;
    }

    public BigDecimal getSymptomdetailCode4() {
        return symptomdetailCode4;
    }

    public void setSymptomdetailCode4(BigDecimal symptomdetailCode4) {
        this.symptomdetailCode4 = symptomdetailCode4;
    }

    public String getSymptomdetailName4() {
        return symptomdetailName4;
    }

    public void setSymptomdetailName4(String symptomdetailName4) {
        this.symptomdetailName4 = symptomdetailName4;
    }

    public BigDecimal getSymptomdetailCode5() {
        return symptomdetailCode5;
    }

    public void setSymptomdetailCode5(BigDecimal symptomdetailCode5) {
        this.symptomdetailCode5 = symptomdetailCode5;
    }

    public String getSymptomdetailName5() {
        return symptomdetailName5;
    }

    public void setSymptomdetailName5(String symptomdetailName5) {
        this.symptomdetailName5 = symptomdetailName5;
    }

    public String getComeType() {
        return comeType;
    }

    public void setComeType(String comeType) {
        this.comeType = comeType;
    }

    @Override
    public String toString() {
        return "MjEcis{" +
        "triageserialno=" + triageserialno +
        ", patientid=" + patientid +
        ", documentno=" + documentno +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", nation=" + nation +
        ", chargetype=" + chargetype +
        ", contactperson=" + contactperson +
        ", contactphone=" + contactphone +
        ", address=" + address +
        ", cardno=" + cardno +
        ", cardtype=" + cardtype +
        ", triagedirectioncode=" + triagedirectioncode +
        ", triagedirectionname=" + triagedirectionname +
        ", operatorname=" + operatorname +
        ", chargetypecode=" + chargetypecode +
        ", identype=" + identype +
        ", ecislevel=" + ecislevel +
        ", operdate=" + operdate +
        ", animalHeat=" + animalHeat +
        ", bloodPressure=" + bloodPressure +
        ", mind=" + mind +
        ", pulse=" + pulse +
        ", breath=" + breath +
        ", bloodOxygen=" + bloodOxygen +
        ", weight=" + weight +
        ", symptomCode1=" + symptomCode1 +
        ", symptomCode2=" + symptomCode2 +
        ", symptomCode3=" + symptomCode3 +
        ", symptomCode4=" + symptomCode4 +
        ", symptomCode5=" + symptomCode5 +
        ", symptomdetailCode1=" + symptomdetailCode1 +
        ", symptomdetailName1=" + symptomdetailName1 +
        ", symptomdetailCode2=" + symptomdetailCode2 +
        ", symptomdetailName2=" + symptomdetailName2 +
        ", symptomdetailCode3=" + symptomdetailCode3 +
        ", symptomdetailName3=" + symptomdetailName3 +
        ", symptomdetailCode4=" + symptomdetailCode4 +
        ", symptomdetailName4=" + symptomdetailName4 +
        ", symptomdetailCode5=" + symptomdetailCode5 +
        ", symptomdetailName5=" + symptomdetailName5 +
        ", comeType=" + comeType +
        "}";
    }
}
