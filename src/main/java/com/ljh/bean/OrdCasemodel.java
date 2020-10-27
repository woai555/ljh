package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 问诊模板记录表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdCasemodel implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 组套代码
     */
    @TableId(value = "GROUP_ID", type = IdType.AUTO)
    private String groupId;

    /**
     * 组套名称
     */
    private String groupName;

    /**
     * 组套类型,1科室组套，2医生组套
     */
    private String groupType;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 医生代码
     */
    private String doctCode;

    /**
     * 拼音码
     */
    private String spellCode;

    /**
     * 主诉
     */
    private String hostTell;

    /**
     * 现病史
     */
    private String currentIllness;

    /**
     * 既往史
     */
    private String anamnesis;

    /**
     * 过敏史
     */
    private String allergen;

    /**
     * 检体
     */
    private String checkbody;

    /**
     * 备注
     */
    private String remark;

    /**
     * 个人史
     */
    private String individual;

    /**
     * 其它
     */
    private String other;

    /**
     * 辅助检查
     */
    private String adminical;


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getHostTell() {
        return hostTell;
    }

    public void setHostTell(String hostTell) {
        this.hostTell = hostTell;
    }

    public String getCurrentIllness() {
        return currentIllness;
    }

    public void setCurrentIllness(String currentIllness) {
        this.currentIllness = currentIllness;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public String getCheckbody() {
        return checkbody;
    }

    public void setCheckbody(String checkbody) {
        this.checkbody = checkbody;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getAdminical() {
        return adminical;
    }

    public void setAdminical(String adminical) {
        this.adminical = adminical;
    }

    @Override
    public String toString() {
        return "OrdCasemodel{" +
        "groupId=" + groupId +
        ", groupName=" + groupName +
        ", groupType=" + groupType +
        ", deptCode=" + deptCode +
        ", doctCode=" + doctCode +
        ", spellCode=" + spellCode +
        ", hostTell=" + hostTell +
        ", currentIllness=" + currentIllness +
        ", anamnesis=" + anamnesis +
        ", allergen=" + allergen +
        ", checkbody=" + checkbody +
        ", remark=" + remark +
        ", individual=" + individual +
        ", other=" + other +
        ", adminical=" + adminical +
        "}";
    }
}
