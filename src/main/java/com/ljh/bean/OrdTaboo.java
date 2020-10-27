package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 药品禁忌信息表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdTaboo implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 禁忌代码
     */
    @TableId(value = "TABOO_NO", type = IdType.AUTO)
    private String tabooNo;

    /**
     * 禁忌名称
     */
    private String tabooName;

    /**
     * 1配伍禁忌，2单独使用
     */
    private String tabooType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否有效，1是，2否
     */
    private String validFlag;

    /**
     * 输入码
     */
    private String spellCode;

    /**
     * 操作人
     */
    private String operCode;

    private LocalDateTime operDate;


    public String getTabooNo() {
        return tabooNo;
    }

    public void setTabooNo(String tabooNo) {
        this.tabooNo = tabooNo;
    }

    public String getTabooName() {
        return tabooName;
    }

    public void setTabooName(String tabooName) {
        this.tabooName = tabooName;
    }

    public String getTabooType() {
        return tabooType;
    }

    public void setTabooType(String tabooType) {
        this.tabooType = tabooType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "OrdTaboo{" +
        "tabooNo=" + tabooNo +
        ", tabooName=" + tabooName +
        ", tabooType=" + tabooType +
        ", remark=" + remark +
        ", validFlag=" + validFlag +
        ", spellCode=" + spellCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
