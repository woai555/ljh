package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 挂号主表(R_Register)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RRegister implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 看诊日期
     */
    private LocalDateTime seeDate;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 就诊卡号
     */
    @TableId(value = "CARD_NO", type = IdType.AUTO)
    private String cardNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号
     */
    private String idenno;

    /**
     * 性别
     */
    private String sexCode;

    /**
     * 出生日
     */
    private LocalDateTime birthday;

    /**
     * 结算类别号
     */
    private String paykindCode;

    /**
     * 结算类别名称
     */
    private String paykindName;

    /**
     * 医疗证号
     */
    private String mcardNo;

    /**
     * 合同号
     */
    private String pactCode;

    /**
     * 合同单位名称
     */
    private String pactName;

    /**
     * 挂号日期
     */
    private LocalDateTime regDate;

    /**
     * 挂号级别
     */
    private String reglevlCode;

    /**
     * 挂号级别名称
     */
    private String reglevlName;

    /**
     * 科室号
     */
    private String deptCode;

    /**
     * 科室名称
     */
    private String deptName;

    /**
     * 看诊序号
     */
    private Integer seeno;

    /**
     * 医师代号
     */
    private String emplCode;

    /**
     * 医师姓名
     */
    private String doctName;

    /**
     * 挂号收费标志
     */
    private String ynregchrg;

    /**
     * 是否预约
     */
    private String ynbook;

    /**
     * 挂号费
     */
    private BigDecimal regFee;

    /**
     * 检查费
     */
    private BigDecimal chckFee;

    /**
     * 诊察费
     */
    private BigDecimal diagFee;

    /**
     * 附加费
     */
    private BigDecimal othFee;

    /**
     * 初复急诊标志
     */
    private String ynfru;

    /**
     * 退号标志
2:未缴费锁号
3：异常取消锁号
     */
    private String yncancel;

    /**
     * 自费比例
     */
    private BigDecimal ownRatio;

    /**
     * 公费比例
     */
    private BigDecimal pubRatio;

    /**
     * 自付比例
     */
    private BigDecimal payRatio;

    /**
     * 操作员代码
     */
    private String operCode;

    /**
     * 是否看诊
     */
    private String ynsee;

    /**
     * 门诊号
     */
    private String clinicCode;

    /**
     * 减免比例
     */
    private BigDecimal discountRatio;

    /**
     * 退号时间
     */
    private LocalDateTime cancelDate;

    /**
     * 退号员代码
     */
    private String cancelOpercode;

    /**
     * 医疗类别
     */
    private String medicalType;

    /**
     * 疾病代码
     */
    private String icdCode;

    /**
     * 结束标志
     */
    private String endFlag;

    /**
     * 审批人
     */
    private String examCode;

    /**
     * 审批时间
     */
    private LocalDateTime examDate;

    /**
     * 门诊病历号
     */
    private String clinicNo;

    /**
     * 单机版标志
     */
    private String djbFlag;

    /**
     * 是否加号
     */
    private String ynAdd;

    /**
     * 报销费用
     */
    private BigDecimal bxFee;

    /**
     * 医保交易流水号
     */
    private String tradeno;

    /**
     * 实际看诊医师编码
     */
    private String realDoctid;

    /**
     * 实际看诊医师名称
     */
    private String realDoctname;

    /**
     * 诊断名称
     */
    private String icdName;

    /**
     * ip地址
     */
    private String ipaddress;

    /**
     * mac地址
     */
    private String macaddress;

    /**
     * 机器名
     */
    private String machinename;

    /**
     * 医联卡号
     */
    private String ylcardNo;

    /**
     * 时间段
     */
    private String noonTime;

    /**
     * ia_consigntion不可报效金额支付方式 
1  现金
2  支票
3  汇票
4  一卡通
5  转押金
6  扣帐户
7  记帐
8  扣保险帐户
9  免费
10  医保
11  欠费
12  网上支付
14  京医通卡
15  支付宝
     */
    private String payWay;

    /**
     * 退号类型
     */
    private String quitType;

    /**
     * 京医通卡结算交易流水号
     */
    private String tradenoJyt;

    /**
     * 险种类别
     */
    private String fundtype;

    /**
     * 欠费补收挂号信息记录原欠费挂号信息的门诊号
     */
    private String clinicCodeOld;

    /**
     * 是否占用分时段排班的号源
     */
    private String yntimecodeDef;

    /**
     * 退号支付方式
     */
    private String payWayQuit;

    /**
     * 支付宝收费时间
     */
    private LocalDateTime alipayDate;

    /**
     * 支付宝订单号，（京医通锁号订单号）
     */
    private String aliorderid;

    /**
     * 支付宝系统交易流水号
     */
    private String alipaytradeno;

    /**
     * 是否像支付宝窗口发送消息（3京医通二期窗口取号，4京医通二期窗口退号）
     */
    private String ynsendmsgAli;

    /**
     * 爽约退号是否已腾退资源
     */
    private String ynRtn;

    /**
     * 自助机取号返回报销金额时交易流水号窗口取号为1,null表示没取号
     */
    private String tradenoBakbx;

    /**
     * 京医通二期his交易流水号 card_no||reg_date
     */
    private String hisregno;

    /**
     * 京医通二期挂号时使用的卡号
     */
    private String cardnoJyt;

    /**
     * 医保账户支付费用
     */
    private BigDecimal payCost;

    /**
     * 退号时退还医保账户金额
     */
    private BigDecimal payCostQuit;

    /**
     * 1线上锁号，2自助机锁号3荣威4app5窗口
     */
    private String jytChannel;

    /**
     * 京医通2期转诊
     */
    private String ynJyt2Zz;

    /**
     * 第三方支付方式
     */
    private String payWayJyt;

    /**
     * 京医通线下退号返回的退号流水号
     */
    private String refundNo;

    /**
     * 京医通线下取号标志
     */
    private String jytGetfromwindow;

    /**
     * 京医通异常订单备注1,APP挂号时存储王府井的支付流水号
     */
    private String jytRemark;

    /**
     * 资源回归号池时间
     */
    private LocalDateTime rtnDate;

    /**
     * 取消原因,pay_way=11时表示欠费原因
     */
    private String cancelReason;

    /**
     * 回收字段
     */
    private String rtnResource;

    /**
     * 锁号未支付取消锁号时限
     */
    private Integer autoCancelMinutes;

    /**
     * 第三方实际支付金额
     */
    private BigDecimal payfeeJyt;

    /**
     * 院区编码
     */
    private String hosArea;

    /**
     * 米健分诊号
     */
    private String triageserialno;

    /**
     * 临床试验记录序号
     */
    private Long trialSeqno;


    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

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

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
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

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPaykindName() {
        return paykindName;
    }

    public void setPaykindName(String paykindName) {
        this.paykindName = paykindName;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getPactName() {
        return pactName;
    }

    public void setPactName(String pactName) {
        this.pactName = pactName;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode;
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getSeeno() {
        return seeno;
    }

    public void setSeeno(Integer seeno) {
        this.seeno = seeno;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName;
    }

    public String getYnregchrg() {
        return ynregchrg;
    }

    public void setYnregchrg(String ynregchrg) {
        this.ynregchrg = ynregchrg;
    }

    public String getYnbook() {
        return ynbook;
    }

    public void setYnbook(String ynbook) {
        this.ynbook = ynbook;
    }

    public BigDecimal getRegFee() {
        return regFee;
    }

    public void setRegFee(BigDecimal regFee) {
        this.regFee = regFee;
    }

    public BigDecimal getChckFee() {
        return chckFee;
    }

    public void setChckFee(BigDecimal chckFee) {
        this.chckFee = chckFee;
    }

    public BigDecimal getDiagFee() {
        return diagFee;
    }

    public void setDiagFee(BigDecimal diagFee) {
        this.diagFee = diagFee;
    }

    public BigDecimal getOthFee() {
        return othFee;
    }

    public void setOthFee(BigDecimal othFee) {
        this.othFee = othFee;
    }

    public String getYnfru() {
        return ynfru;
    }

    public void setYnfru(String ynfru) {
        this.ynfru = ynfru;
    }

    public String getYncancel() {
        return yncancel;
    }

    public void setYncancel(String yncancel) {
        this.yncancel = yncancel;
    }

    public BigDecimal getOwnRatio() {
        return ownRatio;
    }

    public void setOwnRatio(BigDecimal ownRatio) {
        this.ownRatio = ownRatio;
    }

    public BigDecimal getPubRatio() {
        return pubRatio;
    }

    public void setPubRatio(BigDecimal pubRatio) {
        this.pubRatio = pubRatio;
    }

    public BigDecimal getPayRatio() {
        return payRatio;
    }

    public void setPayRatio(BigDecimal payRatio) {
        this.payRatio = payRatio;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getYnsee() {
        return ynsee;
    }

    public void setYnsee(String ynsee) {
        this.ynsee = ynsee;
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode;
    }

    public BigDecimal getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getCancelOpercode() {
        return cancelOpercode;
    }

    public void setCancelOpercode(String cancelOpercode) {
        this.cancelOpercode = cancelOpercode;
    }

    public String getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getEndFlag() {
        return endFlag;
    }

    public void setEndFlag(String endFlag) {
        this.endFlag = endFlag;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDateTime examDate) {
        this.examDate = examDate;
    }

    public String getClinicNo() {
        return clinicNo;
    }

    public void setClinicNo(String clinicNo) {
        this.clinicNo = clinicNo;
    }

    public String getDjbFlag() {
        return djbFlag;
    }

    public void setDjbFlag(String djbFlag) {
        this.djbFlag = djbFlag;
    }

    public String getYnAdd() {
        return ynAdd;
    }

    public void setYnAdd(String ynAdd) {
        this.ynAdd = ynAdd;
    }

    public BigDecimal getBxFee() {
        return bxFee;
    }

    public void setBxFee(BigDecimal bxFee) {
        this.bxFee = bxFee;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getRealDoctid() {
        return realDoctid;
    }

    public void setRealDoctid(String realDoctid) {
        this.realDoctid = realDoctid;
    }

    public String getRealDoctname() {
        return realDoctname;
    }

    public void setRealDoctname(String realDoctname) {
        this.realDoctname = realDoctname;
    }

    public String getIcdName() {
        return icdName;
    }

    public void setIcdName(String icdName) {
        this.icdName = icdName;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public String getYlcardNo() {
        return ylcardNo;
    }

    public void setYlcardNo(String ylcardNo) {
        this.ylcardNo = ylcardNo;
    }

    public String getNoonTime() {
        return noonTime;
    }

    public void setNoonTime(String noonTime) {
        this.noonTime = noonTime;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getQuitType() {
        return quitType;
    }

    public void setQuitType(String quitType) {
        this.quitType = quitType;
    }

    public String getTradenoJyt() {
        return tradenoJyt;
    }

    public void setTradenoJyt(String tradenoJyt) {
        this.tradenoJyt = tradenoJyt;
    }

    public String getFundtype() {
        return fundtype;
    }

    public void setFundtype(String fundtype) {
        this.fundtype = fundtype;
    }

    public String getClinicCodeOld() {
        return clinicCodeOld;
    }

    public void setClinicCodeOld(String clinicCodeOld) {
        this.clinicCodeOld = clinicCodeOld;
    }

    public String getYntimecodeDef() {
        return yntimecodeDef;
    }

    public void setYntimecodeDef(String yntimecodeDef) {
        this.yntimecodeDef = yntimecodeDef;
    }

    public String getPayWayQuit() {
        return payWayQuit;
    }

    public void setPayWayQuit(String payWayQuit) {
        this.payWayQuit = payWayQuit;
    }

    public LocalDateTime getAlipayDate() {
        return alipayDate;
    }

    public void setAlipayDate(LocalDateTime alipayDate) {
        this.alipayDate = alipayDate;
    }

    public String getAliorderid() {
        return aliorderid;
    }

    public void setAliorderid(String aliorderid) {
        this.aliorderid = aliorderid;
    }

    public String getAlipaytradeno() {
        return alipaytradeno;
    }

    public void setAlipaytradeno(String alipaytradeno) {
        this.alipaytradeno = alipaytradeno;
    }

    public String getYnsendmsgAli() {
        return ynsendmsgAli;
    }

    public void setYnsendmsgAli(String ynsendmsgAli) {
        this.ynsendmsgAli = ynsendmsgAli;
    }

    public String getYnRtn() {
        return ynRtn;
    }

    public void setYnRtn(String ynRtn) {
        this.ynRtn = ynRtn;
    }

    public String getTradenoBakbx() {
        return tradenoBakbx;
    }

    public void setTradenoBakbx(String tradenoBakbx) {
        this.tradenoBakbx = tradenoBakbx;
    }

    public String getHisregno() {
        return hisregno;
    }

    public void setHisregno(String hisregno) {
        this.hisregno = hisregno;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public BigDecimal getPayCostQuit() {
        return payCostQuit;
    }

    public void setPayCostQuit(BigDecimal payCostQuit) {
        this.payCostQuit = payCostQuit;
    }

    public String getJytChannel() {
        return jytChannel;
    }

    public void setJytChannel(String jytChannel) {
        this.jytChannel = jytChannel;
    }

    public String getYnJyt2Zz() {
        return ynJyt2Zz;
    }

    public void setYnJyt2Zz(String ynJyt2Zz) {
        this.ynJyt2Zz = ynJyt2Zz;
    }

    public String getPayWayJyt() {
        return payWayJyt;
    }

    public void setPayWayJyt(String payWayJyt) {
        this.payWayJyt = payWayJyt;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getJytGetfromwindow() {
        return jytGetfromwindow;
    }

    public void setJytGetfromwindow(String jytGetfromwindow) {
        this.jytGetfromwindow = jytGetfromwindow;
    }

    public String getJytRemark() {
        return jytRemark;
    }

    public void setJytRemark(String jytRemark) {
        this.jytRemark = jytRemark;
    }

    public LocalDateTime getRtnDate() {
        return rtnDate;
    }

    public void setRtnDate(LocalDateTime rtnDate) {
        this.rtnDate = rtnDate;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getRtnResource() {
        return rtnResource;
    }

    public void setRtnResource(String rtnResource) {
        this.rtnResource = rtnResource;
    }

    public Integer getAutoCancelMinutes() {
        return autoCancelMinutes;
    }

    public void setAutoCancelMinutes(Integer autoCancelMinutes) {
        this.autoCancelMinutes = autoCancelMinutes;
    }

    public BigDecimal getPayfeeJyt() {
        return payfeeJyt;
    }

    public void setPayfeeJyt(BigDecimal payfeeJyt) {
        this.payfeeJyt = payfeeJyt;
    }

    public String getHosArea() {
        return hosArea;
    }

    public void setHosArea(String hosArea) {
        this.hosArea = hosArea;
    }

    public String getTriageserialno() {
        return triageserialno;
    }

    public void setTriageserialno(String triageserialno) {
        this.triageserialno = triageserialno;
    }

    public Long getTrialSeqno() {
        return trialSeqno;
    }

    public void setTrialSeqno(Long trialSeqno) {
        this.trialSeqno = trialSeqno;
    }

    @Override
    public String toString() {
        return "RRegister{" +
        "seeDate=" + seeDate +
        ", noonCode=" + noonCode +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", idenno=" + idenno +
        ", sexCode=" + sexCode +
        ", birthday=" + birthday +
        ", paykindCode=" + paykindCode +
        ", paykindName=" + paykindName +
        ", mcardNo=" + mcardNo +
        ", pactCode=" + pactCode +
        ", pactName=" + pactName +
        ", regDate=" + regDate +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", deptCode=" + deptCode +
        ", deptName=" + deptName +
        ", seeno=" + seeno +
        ", emplCode=" + emplCode +
        ", doctName=" + doctName +
        ", ynregchrg=" + ynregchrg +
        ", ynbook=" + ynbook +
        ", regFee=" + regFee +
        ", chckFee=" + chckFee +
        ", diagFee=" + diagFee +
        ", othFee=" + othFee +
        ", ynfru=" + ynfru +
        ", yncancel=" + yncancel +
        ", ownRatio=" + ownRatio +
        ", pubRatio=" + pubRatio +
        ", payRatio=" + payRatio +
        ", operCode=" + operCode +
        ", ynsee=" + ynsee +
        ", clinicCode=" + clinicCode +
        ", discountRatio=" + discountRatio +
        ", cancelDate=" + cancelDate +
        ", cancelOpercode=" + cancelOpercode +
        ", medicalType=" + medicalType +
        ", icdCode=" + icdCode +
        ", endFlag=" + endFlag +
        ", examCode=" + examCode +
        ", examDate=" + examDate +
        ", clinicNo=" + clinicNo +
        ", djbFlag=" + djbFlag +
        ", ynAdd=" + ynAdd +
        ", bxFee=" + bxFee +
        ", tradeno=" + tradeno +
        ", realDoctid=" + realDoctid +
        ", realDoctname=" + realDoctname +
        ", icdName=" + icdName +
        ", ipaddress=" + ipaddress +
        ", macaddress=" + macaddress +
        ", machinename=" + machinename +
        ", ylcardNo=" + ylcardNo +
        ", noonTime=" + noonTime +
        ", payWay=" + payWay +
        ", quitType=" + quitType +
        ", tradenoJyt=" + tradenoJyt +
        ", fundtype=" + fundtype +
        ", clinicCodeOld=" + clinicCodeOld +
        ", yntimecodeDef=" + yntimecodeDef +
        ", payWayQuit=" + payWayQuit +
        ", alipayDate=" + alipayDate +
        ", aliorderid=" + aliorderid +
        ", alipaytradeno=" + alipaytradeno +
        ", ynsendmsgAli=" + ynsendmsgAli +
        ", ynRtn=" + ynRtn +
        ", tradenoBakbx=" + tradenoBakbx +
        ", hisregno=" + hisregno +
        ", cardnoJyt=" + cardnoJyt +
        ", payCost=" + payCost +
        ", payCostQuit=" + payCostQuit +
        ", jytChannel=" + jytChannel +
        ", ynJyt2Zz=" + ynJyt2Zz +
        ", payWayJyt=" + payWayJyt +
        ", refundNo=" + refundNo +
        ", jytGetfromwindow=" + jytGetfromwindow +
        ", jytRemark=" + jytRemark +
        ", rtnDate=" + rtnDate +
        ", cancelReason=" + cancelReason +
        ", rtnResource=" + rtnResource +
        ", autoCancelMinutes=" + autoCancelMinutes +
        ", payfeeJyt=" + payfeeJyt +
        ", hosArea=" + hosArea +
        ", triageserialno=" + triageserialno +
        ", trialSeqno=" + trialSeqno +
        "}";
    }
}
