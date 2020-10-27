package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 护理计划记录单
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsTendPlan implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 计划时间
     */
    private LocalDateTime planTime;

    /**
     * 护理诊断/问题
     */
    private String question;

    /**
     * 预期目标
     */
    private String preAim;

    /**
     * 护理措施
     */
    private String action;

    private String operCode;

    /**
     * 计划人
     */
    private String operName;

    /**
     * 评估时间
     */
    private LocalDateTime evaluateTime;

    /**
     * 评估结果
     */
    private String evaluateRes;

    /**
     * 评估人签名
     */
    private String evaluateOper;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public LocalDateTime getPlanTime() {
        return planTime;
    }

    public void setPlanTime(LocalDateTime planTime) {
        this.planTime = planTime;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getPreAim() {
        return preAim;
    }

    public void setPreAim(String preAim) {
        this.preAim = preAim;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public LocalDateTime getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(LocalDateTime evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public String getEvaluateRes() {
        return evaluateRes;
    }

    public void setEvaluateRes(String evaluateRes) {
        this.evaluateRes = evaluateRes;
    }

    public String getEvaluateOper() {
        return evaluateOper;
    }

    public void setEvaluateOper(String evaluateOper) {
        this.evaluateOper = evaluateOper;
    }

    @Override
    public String toString() {
        return "NrsTendPlan{" +
        "inpatientNo=" + inpatientNo +
        ", planTime=" + planTime +
        ", question=" + question +
        ", preAim=" + preAim +
        ", action=" + action +
        ", operCode=" + operCode +
        ", operName=" + operName +
        ", evaluateTime=" + evaluateTime +
        ", evaluateRes=" + evaluateRes +
        ", evaluateOper=" + evaluateOper +
        "}";
    }
}
