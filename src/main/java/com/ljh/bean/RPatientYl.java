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
public class RPatientYl implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 一联卡号
     */
    @TableId(value = "YLCARD_ID", type = IdType.AUTO)
    private String ylcardId;

    /**
     * 病人姓名
     */
    private String name;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 证件类型 1居民身份证 2中国人民解放军军人证 3中国人民武装警察身份证 4港澳居民来往大陆通行证 5台湾居民来往大陆通行证6护照  7机动车驾驶证 9其他
     */
    private Integer indennoType;

    /**
     * 证件号码
     */
    private String endenno;

    /**
     * 民族
     */
    private Integer nation;

    /**
     * 国籍，1 中国  2外籍
     */
    private Integer country;

    /**
     * 婚姻状况，1未婚2已婚3离婚4丧偶
     */
    private Integer mary;

    /**
     * 是否专程来京就医。1是2否
     */
    private Integer comeBj;

    /**
     * 工作单位
     */
    private String workName;

    /**
     * 在京现住址
     */
    private String adressBj;

    /**
     * 在京现住址行政区划编码
     */
    private String adresscodeBj;

    /**
     * 联系人姓名
     */
    private String linkmanName;

    /**
     * 联系人身份证号码
     */
    private String linkmanIdenno;

    /**
     * 联系人电话
     */
    private String linkmanTel;

    /**
     * his卡号
     */
    private String hisCardno;


    public String getYlcardId() {
        return ylcardId;
    }

    public void setYlcardId(String ylcardId) {
        this.ylcardId = ylcardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public Integer getIndennoType() {
        return indennoType;
    }

    public void setIndennoType(Integer indennoType) {
        this.indennoType = indennoType;
    }

    public String getEndenno() {
        return endenno;
    }

    public void setEndenno(String endenno) {
        this.endenno = endenno;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getMary() {
        return mary;
    }

    public void setMary(Integer mary) {
        this.mary = mary;
    }

    public Integer getComeBj() {
        return comeBj;
    }

    public void setComeBj(Integer comeBj) {
        this.comeBj = comeBj;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getAdressBj() {
        return adressBj;
    }

    public void setAdressBj(String adressBj) {
        this.adressBj = adressBj;
    }

    public String getAdresscodeBj() {
        return adresscodeBj;
    }

    public void setAdresscodeBj(String adresscodeBj) {
        this.adresscodeBj = adresscodeBj;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    public String getLinkmanIdenno() {
        return linkmanIdenno;
    }

    public void setLinkmanIdenno(String linkmanIdenno) {
        this.linkmanIdenno = linkmanIdenno;
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }

    public String getHisCardno() {
        return hisCardno;
    }

    public void setHisCardno(String hisCardno) {
        this.hisCardno = hisCardno;
    }

    @Override
    public String toString() {
        return "RPatientYl{" +
        "ylcardId=" + ylcardId +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", indennoType=" + indennoType +
        ", endenno=" + endenno +
        ", nation=" + nation +
        ", country=" + country +
        ", mary=" + mary +
        ", comeBj=" + comeBj +
        ", workName=" + workName +
        ", adressBj=" + adressBj +
        ", adresscodeBj=" + adresscodeBj +
        ", linkmanName=" + linkmanName +
        ", linkmanIdenno=" + linkmanIdenno +
        ", linkmanTel=" + linkmanTel +
        ", hisCardno=" + hisCardno +
        "}";
    }
}
