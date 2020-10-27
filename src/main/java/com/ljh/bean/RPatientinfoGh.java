package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 歌华预约挂号病人基本信息表(R_PATIENTINFO_gh)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RPatientinfoGh implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    @TableId(value = "ORDER_ID", type = IdType.AUTO)
    private String orderId;

    /**
     * 病人姓名
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
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 籍贯
     */
    private String dist;

    /**
     * 民族
     */
    private String nationCode;

    /**
     * 婚姻状况
     */
    private String mari;

    /**
     * 职业
     */
    private String profCode;

    /**
     * 地区
     */
    private String area;

    /**
     * 国籍
     */
    private String counCode;

    /**
     * 血型
     */
    private String bloodCode;

    /**
     * 医疗证号
     */
    private String mcardNo;

    /**
     * 社保卡卡号
     */
    private String mcardId;

    /**
     * 结算类别号
     */
    private String paykindCode;

    /**
     * 合同单位号
     */
    private String pactCode;

    /**
     * 工作单位
     */
    private String workName;

    /**
     * 单位电话
     */
    private String workTel;

    /**
     * 单位邮编
     */
    private String workZip;

    /**
     * 单位地址
     */
    private String workAdd;

    /**
     * 户口或家庭所在
     */
    private String home;

    /**
     * 家庭电话
     */
    private String homeTel;

    /**
     * 户口或家庭邮政编码
     */
    private String homeZip;

    /**
     * 联系人姓名
     */
    private String linkmanName;

    /**
     * 联系人关系
     */
    private String relaCode;

    /**
     * 联系人电话
     */
    private String linkmanTel;

    /**
     * 联系人住址
     */
    private String linkmanAdd;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 午别
     */
    private String noonCode;

    /**
     * 预约看诊日期
     */
    private LocalDateTime bookDate;

    /**
     * 是否挂号，'0'未，'1'已,'2'作废或线上退号,‘3’超时未取号或取消锁号
     */
    private String ifReg;

    /**
     * 挂号员
     */
    private String regOper;

    /**
     * 实际挂号时间
     */
    private LocalDateTime regDate;

    /**
     * 就诊卡号
     */
    private String cardNo;

    /**
     * 预约类别1	门诊复诊预约
2	住院复诊预约
3	歌华有线
8	本院门户网站预约
10	手机预约
4	社区预约
5	院内预约
6	住院复诊预约
9	特需预约
7	电话预约
15	支付宝预约
16 本木预约

     */
    private BigDecimal bookType;

    /**
     * 号别编码
     */
    private String reglevlCode;

    /**
     * 号别名称
     */
    private String reglevlName;

    /**
     * 医师编码
     */
    private String doctCode;

    /**
     * 操作员
     */
    private String opercode;

    /**
     * 操作时间(微信支付时间)
     */
    private LocalDateTime operdate;

    /**
     * 时间段码
     */
    private String timeCode;

    /**
     * 复诊预约患者上次的就诊科室
     */
    private String firstDept;

    /**
     * 支付方式
     */
    private String payWay;

    /**
     * 是否占用分时段排班的号源
     */
    private String yntimecodeDef;

    /**
     * 支付宝订单号，（京医通锁号订单号）
     */
    private String aliorderid;

    /**
     * 12580导入的挂号网订单号
     */
    private String orderidGhw;

    /**
     * 方庄社区转诊预约写入
     */
    private String fzsqzzData;

    /**
     * 作废人(京医通二期线上退号021000)
     */
    private String cancelOper;

    /**
     * 作废时间（京医通二期线上退号时间）
     */
    private LocalDateTime cancelDate;

    /**
     * 是否发送通知
     */
    private String ynsendmsgAli;

    /**
     * 京医通预约挂号锁号类型1线上2自助机
     */
    private String jytChannel;

    /**
     * 区县/行政区域
     */
    private String distDistrict;

    /**
     * 京医通二期支付后产生的交易流水号
     */
    private String alitradeno;

    /**
     * 医保患者取号后报销金额
     */
    private BigDecimal bxFee;

    /**
     * 自助机取号返回报销金额时交易流水号
     */
    private String tradenoBakbx;

    /**
     * 京医通二期线上退号退款单号
     */
    private String refundNo;

    /**
     * 京医通二期挂号时使用的卡号
     */
    private String cardnoJyt;

    /**
     * 挂号费（方便京医通二期统计报表新建）
     */
    private BigDecimal regFee;

    /**
     * 诊疗费（方便京医通二期统计报表新建）
     */
    private BigDecimal diagFee;

    /**
     * 账户支付（方便京医通二期统计报表新建）
     */
    private BigDecimal payCost;

    /**
     * 是否京医通2期社区转诊 2 社区转诊
     */
    private String ynJyt2Zz;

    /**
     * 资源是否回归号池
     */
    private String ynRtn;

    /**
     * 第三方支付方式
     */
    private String payWayJyt;

    /**
     * 京医通线下取号标志
     */
    private String jytGetfromwindow;

    /**
     * 多渠道取号患者记录员预约操作时间
     */
    private LocalDateTime operdateOld;

    /**
     * 京医通异常订单备注
     */
    private String jytRemark;

    /**
     * 资源回归号池时间
     */
    private LocalDateTime rtnDate;

    /**
     * 取消原因
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
     * 是否上传医管局电子病历接口
     */
    private String ynUploadEmr;

    /**
     * 院区编码
     */
    private String hosArea;

    /**
     * 临床试验记录序号
     */
    private Long trialSeqno;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    public String getMari() {
        return mari;
    }

    public void setMari(String mari) {
        this.mari = mari;
    }

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCounCode() {
        return counCode;
    }

    public void setCounCode(String counCode) {
        this.counCode = counCode;
    }

    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public String getMcardId() {
        return mcardId;
    }

    public void setMcardId(String mcardId) {
        this.mcardId = mcardId;
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode;
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    public String getWorkZip() {
        return workZip;
    }

    public void setWorkZip(String workZip) {
        this.workZip = workZip;
    }

    public String getWorkAdd() {
        return workAdd;
    }

    public void setWorkAdd(String workAdd) {
        this.workAdd = workAdd;
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

    public String getRelaCode() {
        return relaCode;
    }

    public void setRelaCode(String relaCode) {
        this.relaCode = relaCode;
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel;
    }

    public String getLinkmanAdd() {
        return linkmanAdd;
    }

    public void setLinkmanAdd(String linkmanAdd) {
        this.linkmanAdd = linkmanAdd;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public LocalDateTime getBookDate() {
        return bookDate;
    }

    public void setBookDate(LocalDateTime bookDate) {
        this.bookDate = bookDate;
    }

    public String getIfReg() {
        return ifReg;
    }

    public void setIfReg(String ifReg) {
        this.ifReg = ifReg;
    }

    public String getRegOper() {
        return regOper;
    }

    public void setRegOper(String regOper) {
        this.regOper = regOper;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public BigDecimal getBookType() {
        return bookType;
    }

    public void setBookType(BigDecimal bookType) {
        this.bookType = bookType;
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

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode;
    }

    public String getOpercode() {
        return opercode;
    }

    public void setOpercode(String opercode) {
        this.opercode = opercode;
    }

    public LocalDateTime getOperdate() {
        return operdate;
    }

    public void setOperdate(LocalDateTime operdate) {
        this.operdate = operdate;
    }

    public String getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public String getFirstDept() {
        return firstDept;
    }

    public void setFirstDept(String firstDept) {
        this.firstDept = firstDept;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getYntimecodeDef() {
        return yntimecodeDef;
    }

    public void setYntimecodeDef(String yntimecodeDef) {
        this.yntimecodeDef = yntimecodeDef;
    }

    public String getAliorderid() {
        return aliorderid;
    }

    public void setAliorderid(String aliorderid) {
        this.aliorderid = aliorderid;
    }

    public String getOrderidGhw() {
        return orderidGhw;
    }

    public void setOrderidGhw(String orderidGhw) {
        this.orderidGhw = orderidGhw;
    }

    public String getFzsqzzData() {
        return fzsqzzData;
    }

    public void setFzsqzzData(String fzsqzzData) {
        this.fzsqzzData = fzsqzzData;
    }

    public String getCancelOper() {
        return cancelOper;
    }

    public void setCancelOper(String cancelOper) {
        this.cancelOper = cancelOper;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getYnsendmsgAli() {
        return ynsendmsgAli;
    }

    public void setYnsendmsgAli(String ynsendmsgAli) {
        this.ynsendmsgAli = ynsendmsgAli;
    }

    public String getJytChannel() {
        return jytChannel;
    }

    public void setJytChannel(String jytChannel) {
        this.jytChannel = jytChannel;
    }

    public String getDistDistrict() {
        return distDistrict;
    }

    public void setDistDistrict(String distDistrict) {
        this.distDistrict = distDistrict;
    }

    public String getAlitradeno() {
        return alitradeno;
    }

    public void setAlitradeno(String alitradeno) {
        this.alitradeno = alitradeno;
    }

    public BigDecimal getBxFee() {
        return bxFee;
    }

    public void setBxFee(BigDecimal bxFee) {
        this.bxFee = bxFee;
    }

    public String getTradenoBakbx() {
        return tradenoBakbx;
    }

    public void setTradenoBakbx(String tradenoBakbx) {
        this.tradenoBakbx = tradenoBakbx;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getCardnoJyt() {
        return cardnoJyt;
    }

    public void setCardnoJyt(String cardnoJyt) {
        this.cardnoJyt = cardnoJyt;
    }

    public BigDecimal getRegFee() {
        return regFee;
    }

    public void setRegFee(BigDecimal regFee) {
        this.regFee = regFee;
    }

    public BigDecimal getDiagFee() {
        return diagFee;
    }

    public void setDiagFee(BigDecimal diagFee) {
        this.diagFee = diagFee;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public String getYnJyt2Zz() {
        return ynJyt2Zz;
    }

    public void setYnJyt2Zz(String ynJyt2Zz) {
        this.ynJyt2Zz = ynJyt2Zz;
    }

    public String getYnRtn() {
        return ynRtn;
    }

    public void setYnRtn(String ynRtn) {
        this.ynRtn = ynRtn;
    }

    public String getPayWayJyt() {
        return payWayJyt;
    }

    public void setPayWayJyt(String payWayJyt) {
        this.payWayJyt = payWayJyt;
    }

    public String getJytGetfromwindow() {
        return jytGetfromwindow;
    }

    public void setJytGetfromwindow(String jytGetfromwindow) {
        this.jytGetfromwindow = jytGetfromwindow;
    }

    public LocalDateTime getOperdateOld() {
        return operdateOld;
    }

    public void setOperdateOld(LocalDateTime operdateOld) {
        this.operdateOld = operdateOld;
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

    public String getYnUploadEmr() {
        return ynUploadEmr;
    }

    public void setYnUploadEmr(String ynUploadEmr) {
        this.ynUploadEmr = ynUploadEmr;
    }

    public String getHosArea() {
        return hosArea;
    }

    public void setHosArea(String hosArea) {
        this.hosArea = hosArea;
    }

    public Long getTrialSeqno() {
        return trialSeqno;
    }

    public void setTrialSeqno(Long trialSeqno) {
        this.trialSeqno = trialSeqno;
    }

    @Override
    public String toString() {
        return "RPatientinfoGh{" +
        "orderId=" + orderId +
        ", name=" + name +
        ", idenno=" + idenno +
        ", sexCode=" + sexCode +
        ", birthday=" + birthday +
        ", dist=" + dist +
        ", nationCode=" + nationCode +
        ", mari=" + mari +
        ", profCode=" + profCode +
        ", area=" + area +
        ", counCode=" + counCode +
        ", bloodCode=" + bloodCode +
        ", mcardNo=" + mcardNo +
        ", mcardId=" + mcardId +
        ", paykindCode=" + paykindCode +
        ", pactCode=" + pactCode +
        ", workName=" + workName +
        ", workTel=" + workTel +
        ", workZip=" + workZip +
        ", workAdd=" + workAdd +
        ", home=" + home +
        ", homeTel=" + homeTel +
        ", homeZip=" + homeZip +
        ", linkmanName=" + linkmanName +
        ", relaCode=" + relaCode +
        ", linkmanTel=" + linkmanTel +
        ", linkmanAdd=" + linkmanAdd +
        ", deptCode=" + deptCode +
        ", noonCode=" + noonCode +
        ", bookDate=" + bookDate +
        ", ifReg=" + ifReg +
        ", regOper=" + regOper +
        ", regDate=" + regDate +
        ", cardNo=" + cardNo +
        ", bookType=" + bookType +
        ", reglevlCode=" + reglevlCode +
        ", reglevlName=" + reglevlName +
        ", doctCode=" + doctCode +
        ", opercode=" + opercode +
        ", operdate=" + operdate +
        ", timeCode=" + timeCode +
        ", firstDept=" + firstDept +
        ", payWay=" + payWay +
        ", yntimecodeDef=" + yntimecodeDef +
        ", aliorderid=" + aliorderid +
        ", orderidGhw=" + orderidGhw +
        ", fzsqzzData=" + fzsqzzData +
        ", cancelOper=" + cancelOper +
        ", cancelDate=" + cancelDate +
        ", ynsendmsgAli=" + ynsendmsgAli +
        ", jytChannel=" + jytChannel +
        ", distDistrict=" + distDistrict +
        ", alitradeno=" + alitradeno +
        ", bxFee=" + bxFee +
        ", tradenoBakbx=" + tradenoBakbx +
        ", refundNo=" + refundNo +
        ", cardnoJyt=" + cardnoJyt +
        ", regFee=" + regFee +
        ", diagFee=" + diagFee +
        ", payCost=" + payCost +
        ", ynJyt2Zz=" + ynJyt2Zz +
        ", ynRtn=" + ynRtn +
        ", payWayJyt=" + payWayJyt +
        ", jytGetfromwindow=" + jytGetfromwindow +
        ", operdateOld=" + operdateOld +
        ", jytRemark=" + jytRemark +
        ", rtnDate=" + rtnDate +
        ", cancelReason=" + cancelReason +
        ", rtnResource=" + rtnResource +
        ", autoCancelMinutes=" + autoCancelMinutes +
        ", payfeeJyt=" + payfeeJyt +
        ", ynUploadEmr=" + ynUploadEmr +
        ", hosArea=" + hosArea +
        ", trialSeqno=" + trialSeqno +
        "}";
    }
}
