package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医改监测月报表(医管局)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RevolutionMonthYgj implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 起始日期
     */
    @TableId(value = "BEGINDATE", type = IdType.AUTO)
    private LocalDateTime begindate;

    /**
     * 终止日期
     */
    private LocalDateTime enddate;

    /**
     * 操作时间
     */
    private LocalDateTime opertime;

    /**
     * 卫生材料收入
     */
    private BigDecimal day1;

    /**
     * 药品收入
     */
    private BigDecimal day2;

    /**
     * 其中：中药饮片收入
     */
    private BigDecimal day3;

    /**
     * 西药收入
     */
    private BigDecimal day4;

    /**
     * 中成药收入
     */
    private BigDecimal day5;

    /**
     * 基本药物收入
     */
    private BigDecimal day6;

    /**
     * 国家谈判抗癌药品收入
     */
    private BigDecimal day7;

    /**
     * 国家药品集中采购药品收入
     */
    private BigDecimal day8;

    /**
     * 抗菌药物收入
     */
    private BigDecimal day9;

    /**
     * 自费药物收入
     */
    private BigDecimal day10;

    /**
     * 辅助用药收入
     */
    private BigDecimal day11;

    /**
     * 中药注射剂收入
     */
    private BigDecimal day12;

    /**
     * 卫生材料收入
     */
    private BigDecimal day13;

    /**
     * 其中：一次性检查用耗材收入
     */
    private BigDecimal day14;

    /**
     * 一次性治疗用耗材收入
     */
    private BigDecimal day15;

    /**
     * 一次性手术用耗材收入
     */
    private BigDecimal day16;

    /**
     * 一次性介入用耗材收入
     */
    private BigDecimal day17;

    /**
     * 药品收入
     */
    private BigDecimal day18;

    /**
     * 其中：中药饮片收入
     */
    private BigDecimal day19;

    /**
     * 西药收入
     */
    private BigDecimal day20;

    /**
     * 中成药收入
     */
    private BigDecimal day21;

    /**
     * 基本药物收入
     */
    private BigDecimal day22;

    /**
     * 国家谈判抗癌药品收入
     */
    private BigDecimal day23;

    /**
     * 国家药品集中采购药品收入
     */
    private BigDecimal day24;

    /**
     * 抗菌药物收入
     */
    private BigDecimal day25;

    /**
     * 自费药物收入
     */
    private BigDecimal day26;

    /**
     * 辅助用药收入
     */
    private BigDecimal day27;

    /**
     * 中药注射剂收入
     */
    private BigDecimal day28;

    /**
     * 财政基本补助收入
     */
    private BigDecimal day29;

    /**
     * 医院医疗成本
     */
    private BigDecimal day30;

    /**
     * 其中：药品费支出
     */
    private BigDecimal day31;

    /**
     * 卫生材料支出
     */
    private BigDecimal day32;

    /**
     * 其中：可单独收费卫生材料支出
     */
    private BigDecimal day33;

    /**
     * 高值耗材支出
     */
    private BigDecimal day34;

    /**
     * 国产卫生材料支出
     */
    private BigDecimal day35;

    /**
     * 京津冀联合采购医用耗材支出
     */
    private BigDecimal day36;

    /**
     * 其中：在职职工工资福利性费用
     */
    private BigDecimal day37;

    /**
     * 其中：医务人员在职职工工资福利性费用
     */
    private BigDecimal day38;

    /**
     * 其中：管理人员在职职工工资福利性费用
     */
    private BigDecimal day39;

    /**
     * 其中：在编职工工资福利性费用
     */
    private BigDecimal day40;

    /**
     * 其中：医务人员在编职工工资福利性费用
     */
    private BigDecimal day41;

    /**
     * 其中：管理人员在编职工工资福利性费用
     */
    private BigDecimal day42;

    /**
     * 其中：上牌和服务支出
     */
    private BigDecimal day43;

    /**
     * 其中：固定资产折旧
     */
    private BigDecimal day44;

    /**
     * 其中：无形资产推销
     */
    private BigDecimal day45;

    /**
     * 其中：计提专用基金
     */
    private BigDecimal day46;

    /**
     * 出院手术人次数（不含在院）
     */
    private Long day47;

    /**
     * 编制人数
     */
    private Long day48;

    /**
     * 在职职工人数
     */
    private Long day49;

    /**
     * 其中：医务人员人数
     */
    private Long day50;

    /**
     * 其中：管理人员人数
     */
    private Long day51;

    /**
     * 在职在编职工人数
     */
    private Long day52;

    /**
     * 其中：医务人员人数
     */
    private Long day53;

    /**
     * 其中：管理人员人数
     */
    private Long day54;

    /**
     * 编制床位数
     */
    private Long day55;

    /**
     * 平均开放床位
     */
    private Long day56;


    public LocalDateTime getBegindate() {
        return begindate;
    }

    public void setBegindate(LocalDateTime begindate) {
        this.begindate = begindate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    public LocalDateTime getOpertime() {
        return opertime;
    }

    public void setOpertime(LocalDateTime opertime) {
        this.opertime = opertime;
    }

    public BigDecimal getDay1() {
        return day1;
    }

    public void setDay1(BigDecimal day1) {
        this.day1 = day1;
    }

    public BigDecimal getDay2() {
        return day2;
    }

    public void setDay2(BigDecimal day2) {
        this.day2 = day2;
    }

    public BigDecimal getDay3() {
        return day3;
    }

    public void setDay3(BigDecimal day3) {
        this.day3 = day3;
    }

    public BigDecimal getDay4() {
        return day4;
    }

    public void setDay4(BigDecimal day4) {
        this.day4 = day4;
    }

    public BigDecimal getDay5() {
        return day5;
    }

    public void setDay5(BigDecimal day5) {
        this.day5 = day5;
    }

    public BigDecimal getDay6() {
        return day6;
    }

    public void setDay6(BigDecimal day6) {
        this.day6 = day6;
    }

    public BigDecimal getDay7() {
        return day7;
    }

    public void setDay7(BigDecimal day7) {
        this.day7 = day7;
    }

    public BigDecimal getDay8() {
        return day8;
    }

    public void setDay8(BigDecimal day8) {
        this.day8 = day8;
    }

    public BigDecimal getDay9() {
        return day9;
    }

    public void setDay9(BigDecimal day9) {
        this.day9 = day9;
    }

    public BigDecimal getDay10() {
        return day10;
    }

    public void setDay10(BigDecimal day10) {
        this.day10 = day10;
    }

    public BigDecimal getDay11() {
        return day11;
    }

    public void setDay11(BigDecimal day11) {
        this.day11 = day11;
    }

    public BigDecimal getDay12() {
        return day12;
    }

    public void setDay12(BigDecimal day12) {
        this.day12 = day12;
    }

    public BigDecimal getDay13() {
        return day13;
    }

    public void setDay13(BigDecimal day13) {
        this.day13 = day13;
    }

    public BigDecimal getDay14() {
        return day14;
    }

    public void setDay14(BigDecimal day14) {
        this.day14 = day14;
    }

    public BigDecimal getDay15() {
        return day15;
    }

    public void setDay15(BigDecimal day15) {
        this.day15 = day15;
    }

    public BigDecimal getDay16() {
        return day16;
    }

    public void setDay16(BigDecimal day16) {
        this.day16 = day16;
    }

    public BigDecimal getDay17() {
        return day17;
    }

    public void setDay17(BigDecimal day17) {
        this.day17 = day17;
    }

    public BigDecimal getDay18() {
        return day18;
    }

    public void setDay18(BigDecimal day18) {
        this.day18 = day18;
    }

    public BigDecimal getDay19() {
        return day19;
    }

    public void setDay19(BigDecimal day19) {
        this.day19 = day19;
    }

    public BigDecimal getDay20() {
        return day20;
    }

    public void setDay20(BigDecimal day20) {
        this.day20 = day20;
    }

    public BigDecimal getDay21() {
        return day21;
    }

    public void setDay21(BigDecimal day21) {
        this.day21 = day21;
    }

    public BigDecimal getDay22() {
        return day22;
    }

    public void setDay22(BigDecimal day22) {
        this.day22 = day22;
    }

    public BigDecimal getDay23() {
        return day23;
    }

    public void setDay23(BigDecimal day23) {
        this.day23 = day23;
    }

    public BigDecimal getDay24() {
        return day24;
    }

    public void setDay24(BigDecimal day24) {
        this.day24 = day24;
    }

    public BigDecimal getDay25() {
        return day25;
    }

    public void setDay25(BigDecimal day25) {
        this.day25 = day25;
    }

    public BigDecimal getDay26() {
        return day26;
    }

    public void setDay26(BigDecimal day26) {
        this.day26 = day26;
    }

    public BigDecimal getDay27() {
        return day27;
    }

    public void setDay27(BigDecimal day27) {
        this.day27 = day27;
    }

    public BigDecimal getDay28() {
        return day28;
    }

    public void setDay28(BigDecimal day28) {
        this.day28 = day28;
    }

    public BigDecimal getDay29() {
        return day29;
    }

    public void setDay29(BigDecimal day29) {
        this.day29 = day29;
    }

    public BigDecimal getDay30() {
        return day30;
    }

    public void setDay30(BigDecimal day30) {
        this.day30 = day30;
    }

    public BigDecimal getDay31() {
        return day31;
    }

    public void setDay31(BigDecimal day31) {
        this.day31 = day31;
    }

    public BigDecimal getDay32() {
        return day32;
    }

    public void setDay32(BigDecimal day32) {
        this.day32 = day32;
    }

    public BigDecimal getDay33() {
        return day33;
    }

    public void setDay33(BigDecimal day33) {
        this.day33 = day33;
    }

    public BigDecimal getDay34() {
        return day34;
    }

    public void setDay34(BigDecimal day34) {
        this.day34 = day34;
    }

    public BigDecimal getDay35() {
        return day35;
    }

    public void setDay35(BigDecimal day35) {
        this.day35 = day35;
    }

    public BigDecimal getDay36() {
        return day36;
    }

    public void setDay36(BigDecimal day36) {
        this.day36 = day36;
    }

    public BigDecimal getDay37() {
        return day37;
    }

    public void setDay37(BigDecimal day37) {
        this.day37 = day37;
    }

    public BigDecimal getDay38() {
        return day38;
    }

    public void setDay38(BigDecimal day38) {
        this.day38 = day38;
    }

    public BigDecimal getDay39() {
        return day39;
    }

    public void setDay39(BigDecimal day39) {
        this.day39 = day39;
    }

    public BigDecimal getDay40() {
        return day40;
    }

    public void setDay40(BigDecimal day40) {
        this.day40 = day40;
    }

    public BigDecimal getDay41() {
        return day41;
    }

    public void setDay41(BigDecimal day41) {
        this.day41 = day41;
    }

    public BigDecimal getDay42() {
        return day42;
    }

    public void setDay42(BigDecimal day42) {
        this.day42 = day42;
    }

    public BigDecimal getDay43() {
        return day43;
    }

    public void setDay43(BigDecimal day43) {
        this.day43 = day43;
    }

    public BigDecimal getDay44() {
        return day44;
    }

    public void setDay44(BigDecimal day44) {
        this.day44 = day44;
    }

    public BigDecimal getDay45() {
        return day45;
    }

    public void setDay45(BigDecimal day45) {
        this.day45 = day45;
    }

    public BigDecimal getDay46() {
        return day46;
    }

    public void setDay46(BigDecimal day46) {
        this.day46 = day46;
    }

    public Long getDay47() {
        return day47;
    }

    public void setDay47(Long day47) {
        this.day47 = day47;
    }

    public Long getDay48() {
        return day48;
    }

    public void setDay48(Long day48) {
        this.day48 = day48;
    }

    public Long getDay49() {
        return day49;
    }

    public void setDay49(Long day49) {
        this.day49 = day49;
    }

    public Long getDay50() {
        return day50;
    }

    public void setDay50(Long day50) {
        this.day50 = day50;
    }

    public Long getDay51() {
        return day51;
    }

    public void setDay51(Long day51) {
        this.day51 = day51;
    }

    public Long getDay52() {
        return day52;
    }

    public void setDay52(Long day52) {
        this.day52 = day52;
    }

    public Long getDay53() {
        return day53;
    }

    public void setDay53(Long day53) {
        this.day53 = day53;
    }

    public Long getDay54() {
        return day54;
    }

    public void setDay54(Long day54) {
        this.day54 = day54;
    }

    public Long getDay55() {
        return day55;
    }

    public void setDay55(Long day55) {
        this.day55 = day55;
    }

    public Long getDay56() {
        return day56;
    }

    public void setDay56(Long day56) {
        this.day56 = day56;
    }

    @Override
    public String toString() {
        return "RevolutionMonthYgj{" +
        "begindate=" + begindate +
        ", enddate=" + enddate +
        ", opertime=" + opertime +
        ", day1=" + day1 +
        ", day2=" + day2 +
        ", day3=" + day3 +
        ", day4=" + day4 +
        ", day5=" + day5 +
        ", day6=" + day6 +
        ", day7=" + day7 +
        ", day8=" + day8 +
        ", day9=" + day9 +
        ", day10=" + day10 +
        ", day11=" + day11 +
        ", day12=" + day12 +
        ", day13=" + day13 +
        ", day14=" + day14 +
        ", day15=" + day15 +
        ", day16=" + day16 +
        ", day17=" + day17 +
        ", day18=" + day18 +
        ", day19=" + day19 +
        ", day20=" + day20 +
        ", day21=" + day21 +
        ", day22=" + day22 +
        ", day23=" + day23 +
        ", day24=" + day24 +
        ", day25=" + day25 +
        ", day26=" + day26 +
        ", day27=" + day27 +
        ", day28=" + day28 +
        ", day29=" + day29 +
        ", day30=" + day30 +
        ", day31=" + day31 +
        ", day32=" + day32 +
        ", day33=" + day33 +
        ", day34=" + day34 +
        ", day35=" + day35 +
        ", day36=" + day36 +
        ", day37=" + day37 +
        ", day38=" + day38 +
        ", day39=" + day39 +
        ", day40=" + day40 +
        ", day41=" + day41 +
        ", day42=" + day42 +
        ", day43=" + day43 +
        ", day44=" + day44 +
        ", day45=" + day45 +
        ", day46=" + day46 +
        ", day47=" + day47 +
        ", day48=" + day48 +
        ", day49=" + day49 +
        ", day50=" + day50 +
        ", day51=" + day51 +
        ", day52=" + day52 +
        ", day53=" + day53 +
        ", day54=" + day54 +
        ", day55=" + day55 +
        ", day56=" + day56 +
        "}";
    }
}
