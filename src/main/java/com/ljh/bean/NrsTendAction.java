package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 护理计划实施单
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsTendAction implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 住院号
     */
    @TableId(value = "INPATIENT_NO", type = IdType.AUTO)
    private String inpatientNo;

    /**
     * 时间
     */
    private LocalDateTime actionTime;

    /**
     * 护理单元编码
     */
    private String nrscellCode;

    private String action1;

    private String action2;

    private String action3;

    private String action4;

    private String action5;

    private String action6;

    private String action7;

    private String action8;

    private String action9;

    private String action10;

    private String action11;

    private String action12;

    private String action13;

    private String action14;

    private String action15;

    private String action16;

    private String action17;

    private String action18;

    private String action19;

    private String action20;

    private String action21;

    private String action22;

    private String operCode;

    /**
     * 签名
     */
    private String operName;


    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo;
    }

    public LocalDateTime getActionTime() {
        return actionTime;
    }

    public void setActionTime(LocalDateTime actionTime) {
        this.actionTime = actionTime;
    }

    public String getNrscellCode() {
        return nrscellCode;
    }

    public void setNrscellCode(String nrscellCode) {
        this.nrscellCode = nrscellCode;
    }

    public String getAction1() {
        return action1;
    }

    public void setAction1(String action1) {
        this.action1 = action1;
    }

    public String getAction2() {
        return action2;
    }

    public void setAction2(String action2) {
        this.action2 = action2;
    }

    public String getAction3() {
        return action3;
    }

    public void setAction3(String action3) {
        this.action3 = action3;
    }

    public String getAction4() {
        return action4;
    }

    public void setAction4(String action4) {
        this.action4 = action4;
    }

    public String getAction5() {
        return action5;
    }

    public void setAction5(String action5) {
        this.action5 = action5;
    }

    public String getAction6() {
        return action6;
    }

    public void setAction6(String action6) {
        this.action6 = action6;
    }

    public String getAction7() {
        return action7;
    }

    public void setAction7(String action7) {
        this.action7 = action7;
    }

    public String getAction8() {
        return action8;
    }

    public void setAction8(String action8) {
        this.action8 = action8;
    }

    public String getAction9() {
        return action9;
    }

    public void setAction9(String action9) {
        this.action9 = action9;
    }

    public String getAction10() {
        return action10;
    }

    public void setAction10(String action10) {
        this.action10 = action10;
    }

    public String getAction11() {
        return action11;
    }

    public void setAction11(String action11) {
        this.action11 = action11;
    }

    public String getAction12() {
        return action12;
    }

    public void setAction12(String action12) {
        this.action12 = action12;
    }

    public String getAction13() {
        return action13;
    }

    public void setAction13(String action13) {
        this.action13 = action13;
    }

    public String getAction14() {
        return action14;
    }

    public void setAction14(String action14) {
        this.action14 = action14;
    }

    public String getAction15() {
        return action15;
    }

    public void setAction15(String action15) {
        this.action15 = action15;
    }

    public String getAction16() {
        return action16;
    }

    public void setAction16(String action16) {
        this.action16 = action16;
    }

    public String getAction17() {
        return action17;
    }

    public void setAction17(String action17) {
        this.action17 = action17;
    }

    public String getAction18() {
        return action18;
    }

    public void setAction18(String action18) {
        this.action18 = action18;
    }

    public String getAction19() {
        return action19;
    }

    public void setAction19(String action19) {
        this.action19 = action19;
    }

    public String getAction20() {
        return action20;
    }

    public void setAction20(String action20) {
        this.action20 = action20;
    }

    public String getAction21() {
        return action21;
    }

    public void setAction21(String action21) {
        this.action21 = action21;
    }

    public String getAction22() {
        return action22;
    }

    public void setAction22(String action22) {
        this.action22 = action22;
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

    @Override
    public String toString() {
        return "NrsTendAction{" +
        "inpatientNo=" + inpatientNo +
        ", actionTime=" + actionTime +
        ", nrscellCode=" + nrscellCode +
        ", action1=" + action1 +
        ", action2=" + action2 +
        ", action3=" + action3 +
        ", action4=" + action4 +
        ", action5=" + action5 +
        ", action6=" + action6 +
        ", action7=" + action7 +
        ", action8=" + action8 +
        ", action9=" + action9 +
        ", action10=" + action10 +
        ", action11=" + action11 +
        ", action12=" + action12 +
        ", action13=" + action13 +
        ", action14=" + action14 +
        ", action15=" + action15 +
        ", action16=" + action16 +
        ", action17=" + action17 +
        ", action18=" + action18 +
        ", action19=" + action19 +
        ", action20=" + action20 +
        ", action21=" + action21 +
        ", action22=" + action22 +
        ", operCode=" + operCode +
        ", operName=" + operName +
        "}";
    }
}
