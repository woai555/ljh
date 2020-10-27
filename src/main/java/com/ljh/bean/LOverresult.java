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
public class LOverresult implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "PRESCRIPTNO", type = IdType.AUTO)
    private String prescriptno;

    private Integer inorout;

    private String cardid;

    private String patientid;

    private String inpatientno;

    private String name;

    private String sex;

    private Integer age;

    private String address;

    private String homeplace;

    private Integer checkdeptid;

    private LocalDateTime checkdate;

    private BigDecimal checkresult;

    private String itemCode;


    public String getPrescriptno() {
        return prescriptno;
    }

    public void setPrescriptno(String prescriptno) {
        this.prescriptno = prescriptno;
    }

    public Integer getInorout() {
        return inorout;
    }

    public void setInorout(Integer inorout) {
        this.inorout = inorout;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getInpatientno() {
        return inpatientno;
    }

    public void setInpatientno(String inpatientno) {
        this.inpatientno = inpatientno;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomeplace() {
        return homeplace;
    }

    public void setHomeplace(String homeplace) {
        this.homeplace = homeplace;
    }

    public Integer getCheckdeptid() {
        return checkdeptid;
    }

    public void setCheckdeptid(Integer checkdeptid) {
        this.checkdeptid = checkdeptid;
    }

    public LocalDateTime getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(LocalDateTime checkdate) {
        this.checkdate = checkdate;
    }

    public BigDecimal getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(BigDecimal checkresult) {
        this.checkresult = checkresult;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "LOverresult{" +
        "prescriptno=" + prescriptno +
        ", inorout=" + inorout +
        ", cardid=" + cardid +
        ", patientid=" + patientid +
        ", inpatientno=" + inpatientno +
        ", name=" + name +
        ", sex=" + sex +
        ", age=" + age +
        ", address=" + address +
        ", homeplace=" + homeplace +
        ", checkdeptid=" + checkdeptid +
        ", checkdate=" + checkdate +
        ", checkresult=" + checkresult +
        ", itemCode=" + itemCode +
        "}";
    }
}
