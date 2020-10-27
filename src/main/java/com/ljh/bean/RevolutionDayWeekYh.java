package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医改监测日/周报表(医耗联动)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RevolutionDayWeekYh implements Serializable {

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
     * 门急诊收入
     */
    private BigDecimal day1;

    /**
     * 门诊医事服务费收入
     */
    private BigDecimal day2;

    /**
     * 普通号门诊医事服务费收入
     */
    private BigDecimal day3;

    /**
     * 副主任门诊医事服务费收入
     */
    private BigDecimal day4;

    /**
     * 主任门诊医事服务费收入
     */
    private BigDecimal day5;

    /**
     * 知名专家门诊医事服务费收入
     */
    private BigDecimal day6;

    /**
     * 急诊医事服务费收入
     */
    private BigDecimal day7;

    /**
     * 门急诊药品收入
     */
    private BigDecimal day8;

    /**
     * 门急诊中草药收入
     */
    private BigDecimal day9;

    /**
     * 门急诊检查收入
     */
    private BigDecimal day10;

    /**
     * 门急诊CT检查收入
     */
    private BigDecimal day11;

    /**
     * 门急诊核磁检查收入
     */
    private BigDecimal day12;

    /**
     * 门急诊针灸治疗收入
     */
    private BigDecimal day13;

    /**
     * 门急诊推拿按摩治疗收入
     */
    private BigDecimal day14;

    /**
     * 出院收入
     */
    private BigDecimal day15;

    /**
     * 出院药品收入
     */
    private BigDecimal day16;

    /**
     * 出院中草药收入
     */
    private BigDecimal day17;

    /**
     * 出院医事服务费收入
     */
    private BigDecimal day18;

    /**
     * 出院检查收入
     */
    private BigDecimal day19;

    /**
     * 出院CT检查收入
     */
    private BigDecimal day20;

    /**
     * 出院核磁检查收入
     */
    private BigDecimal day21;

    /**
     * 门急诊总诊疗人次
     */
    private Long day22;

    /**
     * 门诊人次
     */
    private Long day23;

    /**
     * 普通号门诊人次
     */
    private Long day24;

    /**
     * 副主任门诊医事服务费收入
     */
    private Long day25;

    /**
     * 主任门诊医事服务费收入
     */
    private Long day26;

    /**
     * 知名专家门诊医事服务费收入
     */
    private Long day27;

    /**
     * 急诊人次
     */
    private Long day28;

    /**
     * 针灸科门诊人次
     */
    private Long day29;

    /**
     * 推拿按摩科门诊人次
     */
    private Long day30;

    /**
     * 出院人次
     */
    private Long day31;

    /**
     * 门急诊CT检查人次
     */
    private Long day32;

    /**
     * 门急诊核磁检查人次
     */
    private Long day33;

    /**
     * 住院CT检查人次
     */
    private Long day34;

    /**
     * 住院核磁检查人次
     */
    private Long day35;

    /**
     * 门诊病理检查收入
     */
    private BigDecimal day36;

    /**
     * 门诊化验收入
     */
    private BigDecimal day37;

    /**
     * 门诊治疗收入
     */
    private BigDecimal day38;

    /**
     * 门诊康复治疗收入
     */
    private BigDecimal day39;

    /**
     * 门诊精神治疗收入
     */
    private BigDecimal day40;

    /**
     * 门诊中医治疗收入
     */
    private BigDecimal day41;

    /**
     * 门诊手术收入
     */
    private BigDecimal day42;

    /**
     * 门诊卫生材料收入
     */
    private BigDecimal day43;

    /**
     * 门诊高值耗材收入
     */
    private BigDecimal day44;

    /**
     * 住院病理检查收入
     */
    private BigDecimal day45;

    /**
     * 住院化验收入
     */
    private BigDecimal day46;

    /**
     * 住院手术收入
     */
    private BigDecimal day47;

    /**
     * 住院卫生材料收入
     */
    private BigDecimal day48;

    /**
     * 住院高值耗材收入
     */
    private BigDecimal day49;

    /**
     * 住院治疗收入
     */
    private BigDecimal day50;

    /**
     * 住院康复治疗收入
     */
    private BigDecimal day51;

    /**
     * 住院精神治疗收入
     */
    private BigDecimal day52;

    /**
     * 住院中医治疗收入
     */
    private BigDecimal day53;

    /**
     * 门诊病理检查人次
     */
    private Long day54;

    /**
     * 住院病理检查人次
     */
    private Long day55;


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

    public Long getDay22() {
        return day22;
    }

    public void setDay22(Long day22) {
        this.day22 = day22;
    }

    public Long getDay23() {
        return day23;
    }

    public void setDay23(Long day23) {
        this.day23 = day23;
    }

    public Long getDay24() {
        return day24;
    }

    public void setDay24(Long day24) {
        this.day24 = day24;
    }

    public Long getDay25() {
        return day25;
    }

    public void setDay25(Long day25) {
        this.day25 = day25;
    }

    public Long getDay26() {
        return day26;
    }

    public void setDay26(Long day26) {
        this.day26 = day26;
    }

    public Long getDay27() {
        return day27;
    }

    public void setDay27(Long day27) {
        this.day27 = day27;
    }

    public Long getDay28() {
        return day28;
    }

    public void setDay28(Long day28) {
        this.day28 = day28;
    }

    public Long getDay29() {
        return day29;
    }

    public void setDay29(Long day29) {
        this.day29 = day29;
    }

    public Long getDay30() {
        return day30;
    }

    public void setDay30(Long day30) {
        this.day30 = day30;
    }

    public Long getDay31() {
        return day31;
    }

    public void setDay31(Long day31) {
        this.day31 = day31;
    }

    public Long getDay32() {
        return day32;
    }

    public void setDay32(Long day32) {
        this.day32 = day32;
    }

    public Long getDay33() {
        return day33;
    }

    public void setDay33(Long day33) {
        this.day33 = day33;
    }

    public Long getDay34() {
        return day34;
    }

    public void setDay34(Long day34) {
        this.day34 = day34;
    }

    public Long getDay35() {
        return day35;
    }

    public void setDay35(Long day35) {
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

    public BigDecimal getDay47() {
        return day47;
    }

    public void setDay47(BigDecimal day47) {
        this.day47 = day47;
    }

    public BigDecimal getDay48() {
        return day48;
    }

    public void setDay48(BigDecimal day48) {
        this.day48 = day48;
    }

    public BigDecimal getDay49() {
        return day49;
    }

    public void setDay49(BigDecimal day49) {
        this.day49 = day49;
    }

    public BigDecimal getDay50() {
        return day50;
    }

    public void setDay50(BigDecimal day50) {
        this.day50 = day50;
    }

    public BigDecimal getDay51() {
        return day51;
    }

    public void setDay51(BigDecimal day51) {
        this.day51 = day51;
    }

    public BigDecimal getDay52() {
        return day52;
    }

    public void setDay52(BigDecimal day52) {
        this.day52 = day52;
    }

    public BigDecimal getDay53() {
        return day53;
    }

    public void setDay53(BigDecimal day53) {
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

    @Override
    public String toString() {
        return "RevolutionDayWeekYh{" +
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
        "}";
    }
}
