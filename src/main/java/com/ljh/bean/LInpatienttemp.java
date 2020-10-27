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
public class LInpatienttemp implements Serializable {

    private static final long serialVersionUID=1L;

    private String patientid;

    @TableId(value = "INPATIENTNO", type = IdType.AUTO)
    private String inpatientno;

    private LocalDateTime inputdate;

    private Integer age;

    private Integer sex;

    private String roomid;

    private Integer state;

    private String name;


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

    public LocalDateTime getInputdate() {
        return inputdate;
    }

    public void setInputdate(LocalDateTime inputdate) {
        this.inputdate = inputdate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LInpatienttemp{" +
        "patientid=" + patientid +
        ", inpatientno=" + inpatientno +
        ", inputdate=" + inputdate +
        ", age=" + age +
        ", sex=" + sex +
        ", roomid=" + roomid +
        ", state=" + state +
        ", name=" + name +
        "}";
    }
}
