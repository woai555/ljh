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
public class VJhPatient implements Serializable {

    private static final long serialVersionUID=1L;

    private String cardNo;

    private String name;

    private String sexCode;

    private LocalDateTime birthday;

    private String idenno;

    private String nationCode;

    private String home;

    private String homeTel;

    private String mari;

    private String homeZip;

    private String linkmanName;

    private String linkmanAdd;

    private String linkmanTel;


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

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
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

    public String getMari() {
        return mari;
    }

    public void setMari(String mari) {
        this.mari = mari;
    }

    public String getHomeZip() {
        return homeZip;
    }

    public void setHomeZip(String homeZip) {
        this.homeZip = homeZip;
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    public String getLinkmanAdd() {
        return linkmanAdd;
    }

    public void setLinkmanAdd(String linkmanAdd) {
        this.linkmanAdd = linkmanAdd;
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }

    @Override
    public String toString() {
        return "VJhPatient{" +
        "cardNo=" + cardNo +
        ", name=" + name +
        ", sexCode=" + sexCode +
        ", birthday=" + birthday +
        ", idenno=" + idenno +
        ", nationCode=" + nationCode +
        ", home=" + home +
        ", homeTel=" + homeTel +
        ", mari=" + mari +
        ", homeZip=" + homeZip +
        ", linkmanName=" + linkmanName +
        ", linkmanAdd=" + linkmanAdd +
        ", linkmanTel=" + linkmanTel +
        "}";
    }
}
