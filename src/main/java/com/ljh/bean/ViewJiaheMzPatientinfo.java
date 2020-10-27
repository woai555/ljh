package com.ljh.bean;

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
public class ViewJiaheMzPatientinfo implements Serializable {

    private static final long serialVersionUID=1L;

    private String 就诊卡号;

    private String 病人姓名;

    private LocalDateTime 出生日期;

    private String sexCode;

    private String 性别;

    private String 身份证号;

    private String bloodCode;

    private String 血型;

    private String profCode;

    private String 职业;

    private String 工作单位;

    private String 籍贯;

    private String nationCode;

    private String 民族;

    private String mari;

    private String 婚姻状况;

    private String counCode;

    private String 国籍;

    private String 结算类别号;

    private String 结算类别名称;

    private String 门诊病历号;

    private String 住院号;

    private String 户籍所在省区市;

    private String 户籍市;

    private String 区县;

    private String 乡镇街道;

    private String 现住址省区市;

    private String 现住址市;

    private String homeDistrict;

    private String 现住址区县;

    private String 现住址乡镇街道;

    private String 病人来源;

    private String ybFun;

    private String 医保险种类别;

    private String 京医通卡卡号;

    private String 单位电话;

    private String 单位邮编;

    private String 家庭电话;

    private String 联系人姓名;

    private String 联系人电话;

    private LocalDateTime 建病历时间;

    private String 社保卡卡号;

    private LocalDateTime registrationTime;


    public String get就诊卡号() {
        return 就诊卡号;
    }

    public void set就诊卡号(String 就诊卡号) {
        this.就诊卡号 = 就诊卡号;
    }

    public String get病人姓名() {
        return 病人姓名;
    }

    public void set病人姓名(String 病人姓名) {
        this.病人姓名 = 病人姓名;
    }

    public LocalDateTime get出生日期() {
        return 出生日期;
    }

    public void set出生日期(LocalDateTime 出生日期) {
        this.出生日期 = 出生日期;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String get性别() {
        return 性别;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    public String get身份证号() {
        return 身份证号;
    }

    public void set身份证号(String 身份证号) {
        this.身份证号 = 身份证号;
    }

    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode;
    }

    public String get血型() {
        return 血型;
    }

    public void set血型(String 血型) {
        this.血型 = 血型;
    }

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String get职业() {
        return 职业;
    }

    public void set职业(String 职业) {
        this.职业 = 职业;
    }

    public String get工作单位() {
        return 工作单位;
    }

    public void set工作单位(String 工作单位) {
        this.工作单位 = 工作单位;
    }

    public String get籍贯() {
        return 籍贯;
    }

    public void set籍贯(String 籍贯) {
        this.籍贯 = 籍贯;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String get民族() {
        return 民族;
    }

    public void set民族(String 民族) {
        this.民族 = 民族;
    }

    public String getMari() {
        return mari;
    }

    public void setMari(String mari) {
        this.mari = mari;
    }

    public String get婚姻状况() {
        return 婚姻状况;
    }

    public void set婚姻状况(String 婚姻状况) {
        this.婚姻状况 = 婚姻状况;
    }

    public String getCounCode() {
        return counCode;
    }

    public void setCounCode(String counCode) {
        this.counCode = counCode;
    }

    public String get国籍() {
        return 国籍;
    }

    public void set国籍(String 国籍) {
        this.国籍 = 国籍;
    }

    public String get结算类别号() {
        return 结算类别号;
    }

    public void set结算类别号(String 结算类别号) {
        this.结算类别号 = 结算类别号;
    }

    public String get结算类别名称() {
        return 结算类别名称;
    }

    public void set结算类别名称(String 结算类别名称) {
        this.结算类别名称 = 结算类别名称;
    }

    public String get门诊病历号() {
        return 门诊病历号;
    }

    public void set门诊病历号(String 门诊病历号) {
        this.门诊病历号 = 门诊病历号;
    }

    public String get住院号() {
        return 住院号;
    }

    public void set住院号(String 住院号) {
        this.住院号 = 住院号;
    }

    public String get户籍所在省区市() {
        return 户籍所在省区市;
    }

    public void set户籍所在省区市(String 户籍所在省区市) {
        this.户籍所在省区市 = 户籍所在省区市;
    }

    public String get户籍市() {
        return 户籍市;
    }

    public void set户籍市(String 户籍市) {
        this.户籍市 = 户籍市;
    }

    public String get区县() {
        return 区县;
    }

    public void set区县(String 区县) {
        this.区县 = 区县;
    }

    public String get乡镇街道() {
        return 乡镇街道;
    }

    public void set乡镇街道(String 乡镇街道) {
        this.乡镇街道 = 乡镇街道;
    }

    public String get现住址省区市() {
        return 现住址省区市;
    }

    public void set现住址省区市(String 现住址省区市) {
        this.现住址省区市 = 现住址省区市;
    }

    public String get现住址市() {
        return 现住址市;
    }

    public void set现住址市(String 现住址市) {
        this.现住址市 = 现住址市;
    }

    public String getHomeDistrict() {
        return homeDistrict;
    }

    public void setHomeDistrict(String homeDistrict) {
        this.homeDistrict = homeDistrict;
    }

    public String get现住址区县() {
        return 现住址区县;
    }

    public void set现住址区县(String 现住址区县) {
        this.现住址区县 = 现住址区县;
    }

    public String get现住址乡镇街道() {
        return 现住址乡镇街道;
    }

    public void set现住址乡镇街道(String 现住址乡镇街道) {
        this.现住址乡镇街道 = 现住址乡镇街道;
    }

    public String get病人来源() {
        return 病人来源;
    }

    public void set病人来源(String 病人来源) {
        this.病人来源 = 病人来源;
    }

    public String getYbFun() {
        return ybFun;
    }

    public void setYbFun(String ybFun) {
        this.ybFun = ybFun;
    }

    public String get医保险种类别() {
        return 医保险种类别;
    }

    public void set医保险种类别(String 医保险种类别) {
        this.医保险种类别 = 医保险种类别;
    }

    public String get京医通卡卡号() {
        return 京医通卡卡号;
    }

    public void set京医通卡卡号(String 京医通卡卡号) {
        this.京医通卡卡号 = 京医通卡卡号;
    }

    public String get单位电话() {
        return 单位电话;
    }

    public void set单位电话(String 单位电话) {
        this.单位电话 = 单位电话;
    }

    public String get单位邮编() {
        return 单位邮编;
    }

    public void set单位邮编(String 单位邮编) {
        this.单位邮编 = 单位邮编;
    }

    public String get家庭电话() {
        return 家庭电话;
    }

    public void set家庭电话(String 家庭电话) {
        this.家庭电话 = 家庭电话;
    }

    public String get联系人姓名() {
        return 联系人姓名;
    }

    public void set联系人姓名(String 联系人姓名) {
        this.联系人姓名 = 联系人姓名;
    }

    public String get联系人电话() {
        return 联系人电话;
    }

    public void set联系人电话(String 联系人电话) {
        this.联系人电话 = 联系人电话;
    }

    public LocalDateTime get建病历时间() {
        return 建病历时间;
    }

    public void set建病历时间(LocalDateTime 建病历时间) {
        this.建病历时间 = 建病历时间;
    }

    public String get社保卡卡号() {
        return 社保卡卡号;
    }

    public void set社保卡卡号(String 社保卡卡号) {
        this.社保卡卡号 = 社保卡卡号;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return "ViewJiaheMzPatientinfo{" +
        "就诊卡号=" + 就诊卡号 +
        ", 病人姓名=" + 病人姓名 +
        ", 出生日期=" + 出生日期 +
        ", sexCode=" + sexCode +
        ", 性别=" + 性别 +
        ", 身份证号=" + 身份证号 +
        ", bloodCode=" + bloodCode +
        ", 血型=" + 血型 +
        ", profCode=" + profCode +
        ", 职业=" + 职业 +
        ", 工作单位=" + 工作单位 +
        ", 籍贯=" + 籍贯 +
        ", nationCode=" + nationCode +
        ", 民族=" + 民族 +
        ", mari=" + mari +
        ", 婚姻状况=" + 婚姻状况 +
        ", counCode=" + counCode +
        ", 国籍=" + 国籍 +
        ", 结算类别号=" + 结算类别号 +
        ", 结算类别名称=" + 结算类别名称 +
        ", 门诊病历号=" + 门诊病历号 +
        ", 住院号=" + 住院号 +
        ", 户籍所在省区市=" + 户籍所在省区市 +
        ", 户籍市=" + 户籍市 +
        ", 区县=" + 区县 +
        ", 乡镇街道=" + 乡镇街道 +
        ", 现住址省区市=" + 现住址省区市 +
        ", 现住址市=" + 现住址市 +
        ", homeDistrict=" + homeDistrict +
        ", 现住址区县=" + 现住址区县 +
        ", 现住址乡镇街道=" + 现住址乡镇街道 +
        ", 病人来源=" + 病人来源 +
        ", ybFun=" + ybFun +
        ", 医保险种类别=" + 医保险种类别 +
        ", 京医通卡卡号=" + 京医通卡卡号 +
        ", 单位电话=" + 单位电话 +
        ", 单位邮编=" + 单位邮编 +
        ", 家庭电话=" + 家庭电话 +
        ", 联系人姓名=" + 联系人姓名 +
        ", 联系人电话=" + 联系人电话 +
        ", 建病历时间=" + 建病历时间 +
        ", 社保卡卡号=" + 社保卡卡号 +
        ", registrationTime=" + registrationTime +
        "}";
    }
}
