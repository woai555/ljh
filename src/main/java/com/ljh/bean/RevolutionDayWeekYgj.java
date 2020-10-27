package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医改监测日/周报表（医管局）
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RevolutionDayWeekYgj implements Serializable {

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
     * 药品收入
     */
    private BigDecimal day1;

    /**
     * 其中：中药饮片收入
     */
    private BigDecimal day2;

    /**
     * 西药收入
     */
    private BigDecimal day3;

    /**
     * 中成药收入
     */
    private BigDecimal day4;

    /**
     * 基本药物收入
     */
    private BigDecimal day5;

    /**
     * 国家谈判抗癌药品收入
     */
    private BigDecimal day6;

    /**
     * 国家药品集中采购药品收入
     */
    private BigDecimal day7;

    /**
     * 抗菌药物收入
     */
    private BigDecimal day8;

    /**
     * 自费药物收入
     */
    private BigDecimal day9;

    /**
     * 辅助用药收入
     */
    private BigDecimal day10;

    /**
     * 中药注射剂收入
     */
    private BigDecimal day11;

    /**
     * 卫生材料收入
     */
    private BigDecimal day12;

    /**
     * 其中：一次性检查用耗材收入
     */
    private BigDecimal day13;

    /**
     * 一次性治疗用耗材收入
     */
    private BigDecimal day14;

    /**
     * 一次性手术用耗材收入
     */
    private BigDecimal day15;

    /**
     * 一次性介入用耗材收入
     */
    private BigDecimal day16;

    /**
     * 药品收入
     */
    private BigDecimal day17;

    /**
     * 其中：中药饮片收入
     */
    private BigDecimal day18;

    /**
     * 西药收入
     */
    private BigDecimal day19;

    /**
     * 中成药收入
     */
    private BigDecimal day20;

    /**
     * 基本药物收入
     */
    private BigDecimal day21;

    /**
     * 国家谈判抗癌药品收入
     */
    private BigDecimal day22;

    /**
     * 国家药品集中采购药品收入
     */
    private BigDecimal day23;

    /**
     * 抗菌药物收入
     */
    private BigDecimal day24;

    /**
     * 自费药物收入
     */
    private BigDecimal day25;

    /**
     * 辅助用药收入
     */
    private BigDecimal day26;

    /**
     * 中药注射剂收入
     */
    private BigDecimal day27;

    /**
     * 药品费支出
     */
    private BigDecimal day28;

    /**
     * 卫生材料支出
     */
    private BigDecimal day29;

    /**
     * 其中：可单独收费卫生材料支出
     */
    private BigDecimal day30;

    /**
     * 高值耗材支出
     */
    private BigDecimal day31;

    /**
     * 出院手术人次数
     */
    private Long day32;


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

    public Long getDay32() {
        return day32;
    }

    public void setDay32(Long day32) {
        this.day32 = day32;
    }

    @Override
    public String toString() {
        return "RevolutionDayWeekYgj{" +
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
        "}";
    }
}
