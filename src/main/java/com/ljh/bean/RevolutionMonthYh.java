package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 医改监测月报表(医耗联动)
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RevolutionMonthYh implements Serializable {

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
     * 医疗收入
     */
    private BigDecimal day1;

    /**
     * 门急诊收入
     */
    private BigDecimal day2;

    /**
     * 门诊医事服务费收入(挂号、诊疗费)
     */
    private BigDecimal day3;

    /**
     * 普通号门诊医事服务费收入
     */
    private BigDecimal day4;

    /**
     * 副主任医师医事服务费收入
     */
    private BigDecimal day5;

    /**
     * 主任医师医事服务费收入
     */
    private BigDecimal day6;

    /**
     * 知名专家医事服务费收入
     */
    private BigDecimal day7;

    /**
     * 急诊医事服务费收入
     */
    private BigDecimal day8;

    /**
     * 门急诊检查收入
     */
    private BigDecimal day9;

    /**
     * 门急诊CT检查收入
     */
    private BigDecimal day10;

    /**
     * 门急诊核磁检查收入
     */
    private BigDecimal day11;

    /**
     * 门急诊化验收入
     */
    private BigDecimal day12;

    /**
     * 门急诊治疗收入
     */
    private BigDecimal day13;

    /**
     * 门急诊中医治疗收入
     */
    private BigDecimal day14;

    /**
     * 门急诊针灸治疗收入
     */
    private BigDecimal day15;

    /**
     * 门急诊按摩(推拿)治疗收入
     */
    private BigDecimal day16;

    /**
     * 门急诊手术收入
     */
    private BigDecimal day17;

    /**
     * 门急诊卫生材料收入
     */
    private BigDecimal day18;

    /**
     * 门急诊药品收入
     */
    private BigDecimal day19;

    /**
     * 门急诊中草药收入
     */
    private BigDecimal day20;

    /**
     * 出院收入(不含在院)
     */
    private BigDecimal day21;

    /**
     * 住院检查收入
     */
    private BigDecimal day22;

    /**
     * 住院CT检查收入
     */
    private BigDecimal day23;

    /**
     * 住院核磁检查收入
     */
    private BigDecimal day24;

    /**
     * 住院化验收入
     */
    private BigDecimal day25;

    /**
     * 住院手术收入
     */
    private BigDecimal day26;

    /**
     * 住院卫生材料收入
     */
    private BigDecimal day27;

    /**
     * 住院药品收入
     */
    private BigDecimal day28;

    /**
     * 住院中草药收入
     */
    private BigDecimal day29;

    /**
     * 住院医事服务费(诊察费)
     */
    private BigDecimal day30;

    /**
     * 住院护理收入
     */
    private BigDecimal day31;

    /**
     * 住院治疗收入
     */
    private BigDecimal day32;

    /**
     * 住院床位收入
     */
    private BigDecimal day33;

    /**
     * 住院普通床位收入
     */
    private BigDecimal day34;

    /**
     * 门急诊总诊疗人次
     */
    private Long day35;

    /**
     * 门诊人次
     */
    private Long day36;

    /**
     * 普通号门诊人次
     */
    private Long day37;

    /**
     * 副主任医师号门诊人次
     */
    private Long day38;

    /**
     * 主任医师号门诊人次
     */
    private Long day39;

    /**
     * 知名专家号门诊人次
     */
    private Long day40;

    /**
     * 门诊外地来京患者人次(三级以上)
     */
    private Long day41;

    /**
     * 急诊人次
     */
    private Long day42;

    /**
     * 门诊手术人次
     */
    private Long day43;

    /**
     * 门急诊检查人次数
     */
    private Long day44;

    /**
     * 门急诊CT检查人次
     */
    private Long day45;

    /**
     * 门急诊MRI检查人次
     */
    private Long day46;

    /**
     * 诊疗人次中：针灸科门诊人次
     */
    private Long day47;

    /**
     * 诊疗人次中：按摩(推拿)科门诊人次
     */
    private Long day48;

    /**
     * 出院人次数(不含在院)
     */
    private Long day49;

    /**
     * 外地来京患者人次
     */
    private Long day50;

    /**
     * 出院手术人次
     */
    private Long day51;

    /**
     * 住院检查人次数
     */
    private Long day52;

    /**
     * 住院CT检查人次
     */
    private Long day53;

    /**
     * 住院MRI检查人次
     */
    private Long day54;

    /**
     * 实际开发总床日数
     */
    private Long day55;

    /**
     * 实际占用总床日数
     */
    private Long day56;

    /**
     * 出院者占用总床日数
     */
    private Long day57;

    /**
     * 出诊医师数
     */
    private Long day58;

    /**
     * 普通门诊出诊医师数
     */
    private Long day59;

    /**
     * 副主任医师门诊出诊医师数
     */
    private Long day60;

    /**
     * 主任医师门诊出诊医师数
     */
    private Long day61;

    /**
     * 知名专家门诊出诊医师数
     */
    private Long day62;

    /**
     * 急诊出诊医师数
     */
    private Long day63;

    /**
     * 医保病人门急诊收入
     */
    private BigDecimal day64;

    /**
     * 医保病人出院收入
     */
    private BigDecimal day65;

    /**
     * 医疗收入
     */
    private BigDecimal day66;

    /**
     * 门急诊收入
     */
    private BigDecimal day67;

    /**
     * 门急诊药品收入
     */
    private BigDecimal day68;

    /**
     * 出院收入
     */
    private BigDecimal day69;

    /**
     * 出院药品收入
     */
    private BigDecimal day70;

    /**
     * 门急诊总诊疗人次
     */
    private BigDecimal day71;

    /**
     * 出院人次数(不含在院)
     */
    private Long day72;

    /**
     * 门急病理检查收入
     */
    private BigDecimal day73;

    /**
     * 门急康复治疗收入
     */
    private BigDecimal day74;

    /**
     * 门急精神治疗收入
     */
    private BigDecimal day75;

    /**
     * 门急高值耗材收入
     */
    private BigDecimal day76;

    /**
     * 出院病理检查收入
     */
    private BigDecimal day77;

    /**
     * 出院高值耗材收入
     */
    private BigDecimal day78;

    /**
     * 出院康复治疗收入
     */
    private BigDecimal day79;

    /**
     * 出院精神治疗收入
     */
    private BigDecimal day80;

    /**
     * 出院中医治疗收入
     */
    private BigDecimal day81;

    /**
     * 门急病理检查人次
     */
    private Long day82;

    /**
     * 出院病理检查人次
     */
    private Long day83;


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

    public Long getDay35() {
        return day35;
    }

    public void setDay35(Long day35) {
        this.day35 = day35;
    }

    public Long getDay36() {
        return day36;
    }

    public void setDay36(Long day36) {
        this.day36 = day36;
    }

    public Long getDay37() {
        return day37;
    }

    public void setDay37(Long day37) {
        this.day37 = day37;
    }

    public Long getDay38() {
        return day38;
    }

    public void setDay38(Long day38) {
        this.day38 = day38;
    }

    public Long getDay39() {
        return day39;
    }

    public void setDay39(Long day39) {
        this.day39 = day39;
    }

    public Long getDay40() {
        return day40;
    }

    public void setDay40(Long day40) {
        this.day40 = day40;
    }

    public Long getDay41() {
        return day41;
    }

    public void setDay41(Long day41) {
        this.day41 = day41;
    }

    public Long getDay42() {
        return day42;
    }

    public void setDay42(Long day42) {
        this.day42 = day42;
    }

    public Long getDay43() {
        return day43;
    }

    public void setDay43(Long day43) {
        this.day43 = day43;
    }

    public Long getDay44() {
        return day44;
    }

    public void setDay44(Long day44) {
        this.day44 = day44;
    }

    public Long getDay45() {
        return day45;
    }

    public void setDay45(Long day45) {
        this.day45 = day45;
    }

    public Long getDay46() {
        return day46;
    }

    public void setDay46(Long day46) {
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

    public Long getDay57() {
        return day57;
    }

    public void setDay57(Long day57) {
        this.day57 = day57;
    }

    public Long getDay58() {
        return day58;
    }

    public void setDay58(Long day58) {
        this.day58 = day58;
    }

    public Long getDay59() {
        return day59;
    }

    public void setDay59(Long day59) {
        this.day59 = day59;
    }

    public Long getDay60() {
        return day60;
    }

    public void setDay60(Long day60) {
        this.day60 = day60;
    }

    public Long getDay61() {
        return day61;
    }

    public void setDay61(Long day61) {
        this.day61 = day61;
    }

    public Long getDay62() {
        return day62;
    }

    public void setDay62(Long day62) {
        this.day62 = day62;
    }

    public Long getDay63() {
        return day63;
    }

    public void setDay63(Long day63) {
        this.day63 = day63;
    }

    public BigDecimal getDay64() {
        return day64;
    }

    public void setDay64(BigDecimal day64) {
        this.day64 = day64;
    }

    public BigDecimal getDay65() {
        return day65;
    }

    public void setDay65(BigDecimal day65) {
        this.day65 = day65;
    }

    public BigDecimal getDay66() {
        return day66;
    }

    public void setDay66(BigDecimal day66) {
        this.day66 = day66;
    }

    public BigDecimal getDay67() {
        return day67;
    }

    public void setDay67(BigDecimal day67) {
        this.day67 = day67;
    }

    public BigDecimal getDay68() {
        return day68;
    }

    public void setDay68(BigDecimal day68) {
        this.day68 = day68;
    }

    public BigDecimal getDay69() {
        return day69;
    }

    public void setDay69(BigDecimal day69) {
        this.day69 = day69;
    }

    public BigDecimal getDay70() {
        return day70;
    }

    public void setDay70(BigDecimal day70) {
        this.day70 = day70;
    }

    public BigDecimal getDay71() {
        return day71;
    }

    public void setDay71(BigDecimal day71) {
        this.day71 = day71;
    }

    public Long getDay72() {
        return day72;
    }

    public void setDay72(Long day72) {
        this.day72 = day72;
    }

    public BigDecimal getDay73() {
        return day73;
    }

    public void setDay73(BigDecimal day73) {
        this.day73 = day73;
    }

    public BigDecimal getDay74() {
        return day74;
    }

    public void setDay74(BigDecimal day74) {
        this.day74 = day74;
    }

    public BigDecimal getDay75() {
        return day75;
    }

    public void setDay75(BigDecimal day75) {
        this.day75 = day75;
    }

    public BigDecimal getDay76() {
        return day76;
    }

    public void setDay76(BigDecimal day76) {
        this.day76 = day76;
    }

    public BigDecimal getDay77() {
        return day77;
    }

    public void setDay77(BigDecimal day77) {
        this.day77 = day77;
    }

    public BigDecimal getDay78() {
        return day78;
    }

    public void setDay78(BigDecimal day78) {
        this.day78 = day78;
    }

    public BigDecimal getDay79() {
        return day79;
    }

    public void setDay79(BigDecimal day79) {
        this.day79 = day79;
    }

    public BigDecimal getDay80() {
        return day80;
    }

    public void setDay80(BigDecimal day80) {
        this.day80 = day80;
    }

    public BigDecimal getDay81() {
        return day81;
    }

    public void setDay81(BigDecimal day81) {
        this.day81 = day81;
    }

    public Long getDay82() {
        return day82;
    }

    public void setDay82(Long day82) {
        this.day82 = day82;
    }

    public Long getDay83() {
        return day83;
    }

    public void setDay83(Long day83) {
        this.day83 = day83;
    }

    @Override
    public String toString() {
        return "RevolutionMonthYh{" +
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
        ", day57=" + day57 +
        ", day58=" + day58 +
        ", day59=" + day59 +
        ", day60=" + day60 +
        ", day61=" + day61 +
        ", day62=" + day62 +
        ", day63=" + day63 +
        ", day64=" + day64 +
        ", day65=" + day65 +
        ", day66=" + day66 +
        ", day67=" + day67 +
        ", day68=" + day68 +
        ", day69=" + day69 +
        ", day70=" + day70 +
        ", day71=" + day71 +
        ", day72=" + day72 +
        ", day73=" + day73 +
        ", day74=" + day74 +
        ", day75=" + day75 +
        ", day76=" + day76 +
        ", day77=" + day77 +
        ", day78=" + day78 +
        ", day79=" + day79 +
        ", day80=" + day80 +
        ", day81=" + day81 +
        ", day82=" + day82 +
        ", day83=" + day83 +
        "}";
    }
}
