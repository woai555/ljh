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
public class RDoctreglmtDetail implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer lmtno;

    private String noonCode;

    private String emplCode;

    private String deptCode;

    private String reglevlCode;

    private String timeCode;

    private LocalDateTime regStart;

    private LocalDateTime regEnd;

    /**
     * 1预约优先
     */
    private String yyhy;

    /**
     * 0有效1预约占用2现场占用 -1 作废
     */
    private Integer status;

    private String cardNo;

    private LocalDateTime regDate;

    @TableId(value = "SEE_DATE", type = IdType.AUTO)
    private LocalDateTime seeDate;

    /**
     * 1停诊0正常
     */
    private String reducedFlag;

    /**
     * 时段内顺序号
     */
    private Integer seqTimecode;

    /**
     * 看诊时间提醒
     */
    private String timeView;

    /**
     * 是否为分时段排班1是0 否
     */
    private String fsdpb;

    /**
     * 加号来源
     */
    private String addSource;

    private String operCode;

    private LocalDateTime operDate;


    public Integer getLmtno() {
        return lmtno;
    }

    public void setLmtno(Integer lmtno) {
        this.lmtno = lmtno;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public LocalDateTime getRegStart() {
        return regStart;
    }

    public void setRegStart(LocalDateTime regStart) {
        this.regStart = regStart;
    }

    public LocalDateTime getRegEnd() {
        return regEnd;
    }

    public void setRegEnd(LocalDateTime regEnd) {
        this.regEnd = regEnd;
    }

    public String getYyhy() {
        return yyhy;
    }

    public void setYyhy(String yyhy) {
        this.yyhy = yyhy;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

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

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getReducedFlag() {
        return reducedFlag;
    }

    public void setReducedFlag(String reducedFlag) {
        this.reducedFlag = reducedFlag;
    }

    public Integer getSeqTimecode() {
        return seqTimecode;
    }

    public void setSeqTimecode(Integer seqTimecode) {
        this.seqTimecode = seqTimecode;
    }

    public String getTimeView() {
        return timeView;
    }

    public void setTimeView(String timeView) {
        this.timeView = timeView;
    }

    public String getFsdpb() {
        return fsdpb;
    }

    public void setFsdpb(String fsdpb) {
        this.fsdpb = fsdpb;
    }

    public String getAddSource() {
        return addSource;
    }

    public void setAddSource(String addSource) {
        this.addSource = addSource;
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
        return "RDoctreglmtDetail{" +
        "lmtno=" + lmtno +
        ", noonCode=" + noonCode +
        ", emplCode=" + emplCode +
        ", deptCode=" + deptCode +
        ", reglevlCode=" + reglevlCode +
        ", timeCode=" + timeCode +
        ", regStart=" + regStart +
        ", regEnd=" + regEnd +
        ", yyhy=" + yyhy +
        ", status=" + status +
        ", cardNo=" + cardNo +
        ", regDate=" + regDate +
        ", seeDate=" + seeDate +
        ", reducedFlag=" + reducedFlag +
        ", seqTimecode=" + seqTimecode +
        ", timeView=" + timeView +
        ", fsdpb=" + fsdpb +
        ", addSource=" + addSource +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
