package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 工伤患者挂号就诊记录
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RReginfoInjury implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 挂号时间
     */
    private LocalDateTime regDate;

    /**
     * 工伤证号
     */
    private String injuryId;

    /**
     * 负伤日期
     */
    private LocalDateTime injuryTime;

    /**
     * 负伤经过
     */
    private String injuryProces;

    /**
     * 认定部位/职业病名称
     */
    private String partordisease;

    /**
     * 是否勾选传给医保
     */
    private String checked;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getInjuryId() {
        return injuryId;
    }

    public void setInjuryId(String injuryId) {
        this.injuryId = injuryId;
    }

    public LocalDateTime getInjuryTime() {
        return injuryTime;
    }

    public void setInjuryTime(LocalDateTime injuryTime) {
        this.injuryTime = injuryTime;
    }

    public String getInjuryProces() {
        return injuryProces;
    }

    public void setInjuryProces(String injuryProces) {
        this.injuryProces = injuryProces;
    }

    public String getPartordisease() {
        return partordisease;
    }

    public void setPartordisease(String partordisease) {
        this.partordisease = partordisease;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "RReginfoInjury{" +
        "cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", injuryId=" + injuryId +
        ", injuryTime=" + injuryTime +
        ", injuryProces=" + injuryProces +
        ", partordisease=" + partordisease +
        ", checked=" + checked +
        "}";
    }
}
