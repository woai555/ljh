package com.ljh.bean;

import java.math.BigDecimal;
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
public class WfBenifit implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "YEARCODE", type = IdType.AUTO)
    private String yearcode;

    private Integer benifitno;

    private String facinamecode;

    private String facilityname;

    private BigDecimal worktime;

    /**
     * 归属月份，年四位，月两位
     */
    private String repmonth;

    private String indept;

    private String exedept;

    private LocalDateTime oridate;

    private LocalDateTime enddate;

    private String itemname1;

    private BigDecimal item1;

    private String itemname2;

    private BigDecimal item2;

    private String itemname3;

    private BigDecimal item3;

    private String itemname4;

    private BigDecimal item4;

    private String itemname5;

    private BigDecimal item5;

    private String itemname6;

    private BigDecimal item6;

    private String itemname7;

    private BigDecimal item7;

    private String itemname8;

    private BigDecimal item8;

    private String itemname9;

    private BigDecimal item9;

    private String itemname10;

    private BigDecimal item10;

    private String itemname11;

    private BigDecimal item11;

    private String itemname12;

    private BigDecimal item12;

    private String itemname13;

    private BigDecimal item13;

    private String itemname14;

    private BigDecimal item14;

    private String itemname15;

    private BigDecimal item15;

    private String itemname16;

    private BigDecimal item16;

    private String itemname17;

    private BigDecimal item17;

    private String itemname18;

    private BigDecimal item18;

    private String itemname19;

    private BigDecimal item19;

    private String itemname20;

    private BigDecimal item20;

    private String itemname21;

    private BigDecimal item21;

    private String itemname22;

    private BigDecimal item22;

    private String itemname23;

    private BigDecimal item23;

    private String itemname24;

    private BigDecimal item24;

    private String itemname25;

    private BigDecimal item25;

    private String fruit;

    private String notation;

    private String operator;

    private LocalDateTime operatedate;


    public String getYearcode() {
        return yearcode;
    }

    public void setYearcode(String yearcode) {
        this.yearcode = yearcode;
    }

    public Integer getBenifitno() {
        return benifitno;
    }

    public void setBenifitno(Integer benifitno) {
        this.benifitno = benifitno;
    }

    public String getFacinamecode() {
        return facinamecode;
    }

    public void setFacinamecode(String facinamecode) {
        this.facinamecode = facinamecode;
    }

    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname;
    }

    public BigDecimal getWorktime() {
        return worktime;
    }

    public void setWorktime(BigDecimal worktime) {
        this.worktime = worktime;
    }

    public String getRepmonth() {
        return repmonth;
    }

    public void setRepmonth(String repmonth) {
        this.repmonth = repmonth;
    }

    public String getIndept() {
        return indept;
    }

    public void setIndept(String indept) {
        this.indept = indept;
    }

    public String getExedept() {
        return exedept;
    }

    public void setExedept(String exedept) {
        this.exedept = exedept;
    }

    public LocalDateTime getOridate() {
        return oridate;
    }

    public void setOridate(LocalDateTime oridate) {
        this.oridate = oridate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    public String getItemname1() {
        return itemname1;
    }

    public void setItemname1(String itemname1) {
        this.itemname1 = itemname1;
    }

    public BigDecimal getItem1() {
        return item1;
    }

    public void setItem1(BigDecimal item1) {
        this.item1 = item1;
    }

    public String getItemname2() {
        return itemname2;
    }

    public void setItemname2(String itemname2) {
        this.itemname2 = itemname2;
    }

    public BigDecimal getItem2() {
        return item2;
    }

    public void setItem2(BigDecimal item2) {
        this.item2 = item2;
    }

    public String getItemname3() {
        return itemname3;
    }

    public void setItemname3(String itemname3) {
        this.itemname3 = itemname3;
    }

    public BigDecimal getItem3() {
        return item3;
    }

    public void setItem3(BigDecimal item3) {
        this.item3 = item3;
    }

    public String getItemname4() {
        return itemname4;
    }

    public void setItemname4(String itemname4) {
        this.itemname4 = itemname4;
    }

    public BigDecimal getItem4() {
        return item4;
    }

    public void setItem4(BigDecimal item4) {
        this.item4 = item4;
    }

    public String getItemname5() {
        return itemname5;
    }

    public void setItemname5(String itemname5) {
        this.itemname5 = itemname5;
    }

    public BigDecimal getItem5() {
        return item5;
    }

    public void setItem5(BigDecimal item5) {
        this.item5 = item5;
    }

    public String getItemname6() {
        return itemname6;
    }

    public void setItemname6(String itemname6) {
        this.itemname6 = itemname6;
    }

    public BigDecimal getItem6() {
        return item6;
    }

    public void setItem6(BigDecimal item6) {
        this.item6 = item6;
    }

    public String getItemname7() {
        return itemname7;
    }

    public void setItemname7(String itemname7) {
        this.itemname7 = itemname7;
    }

    public BigDecimal getItem7() {
        return item7;
    }

    public void setItem7(BigDecimal item7) {
        this.item7 = item7;
    }

    public String getItemname8() {
        return itemname8;
    }

    public void setItemname8(String itemname8) {
        this.itemname8 = itemname8;
    }

    public BigDecimal getItem8() {
        return item8;
    }

    public void setItem8(BigDecimal item8) {
        this.item8 = item8;
    }

    public String getItemname9() {
        return itemname9;
    }

    public void setItemname9(String itemname9) {
        this.itemname9 = itemname9;
    }

    public BigDecimal getItem9() {
        return item9;
    }

    public void setItem9(BigDecimal item9) {
        this.item9 = item9;
    }

    public String getItemname10() {
        return itemname10;
    }

    public void setItemname10(String itemname10) {
        this.itemname10 = itemname10;
    }

    public BigDecimal getItem10() {
        return item10;
    }

    public void setItem10(BigDecimal item10) {
        this.item10 = item10;
    }

    public String getItemname11() {
        return itemname11;
    }

    public void setItemname11(String itemname11) {
        this.itemname11 = itemname11;
    }

    public BigDecimal getItem11() {
        return item11;
    }

    public void setItem11(BigDecimal item11) {
        this.item11 = item11;
    }

    public String getItemname12() {
        return itemname12;
    }

    public void setItemname12(String itemname12) {
        this.itemname12 = itemname12;
    }

    public BigDecimal getItem12() {
        return item12;
    }

    public void setItem12(BigDecimal item12) {
        this.item12 = item12;
    }

    public String getItemname13() {
        return itemname13;
    }

    public void setItemname13(String itemname13) {
        this.itemname13 = itemname13;
    }

    public BigDecimal getItem13() {
        return item13;
    }

    public void setItem13(BigDecimal item13) {
        this.item13 = item13;
    }

    public String getItemname14() {
        return itemname14;
    }

    public void setItemname14(String itemname14) {
        this.itemname14 = itemname14;
    }

    public BigDecimal getItem14() {
        return item14;
    }

    public void setItem14(BigDecimal item14) {
        this.item14 = item14;
    }

    public String getItemname15() {
        return itemname15;
    }

    public void setItemname15(String itemname15) {
        this.itemname15 = itemname15;
    }

    public BigDecimal getItem15() {
        return item15;
    }

    public void setItem15(BigDecimal item15) {
        this.item15 = item15;
    }

    public String getItemname16() {
        return itemname16;
    }

    public void setItemname16(String itemname16) {
        this.itemname16 = itemname16;
    }

    public BigDecimal getItem16() {
        return item16;
    }

    public void setItem16(BigDecimal item16) {
        this.item16 = item16;
    }

    public String getItemname17() {
        return itemname17;
    }

    public void setItemname17(String itemname17) {
        this.itemname17 = itemname17;
    }

    public BigDecimal getItem17() {
        return item17;
    }

    public void setItem17(BigDecimal item17) {
        this.item17 = item17;
    }

    public String getItemname18() {
        return itemname18;
    }

    public void setItemname18(String itemname18) {
        this.itemname18 = itemname18;
    }

    public BigDecimal getItem18() {
        return item18;
    }

    public void setItem18(BigDecimal item18) {
        this.item18 = item18;
    }

    public String getItemname19() {
        return itemname19;
    }

    public void setItemname19(String itemname19) {
        this.itemname19 = itemname19;
    }

    public BigDecimal getItem19() {
        return item19;
    }

    public void setItem19(BigDecimal item19) {
        this.item19 = item19;
    }

    public String getItemname20() {
        return itemname20;
    }

    public void setItemname20(String itemname20) {
        this.itemname20 = itemname20;
    }

    public BigDecimal getItem20() {
        return item20;
    }

    public void setItem20(BigDecimal item20) {
        this.item20 = item20;
    }

    public String getItemname21() {
        return itemname21;
    }

    public void setItemname21(String itemname21) {
        this.itemname21 = itemname21;
    }

    public BigDecimal getItem21() {
        return item21;
    }

    public void setItem21(BigDecimal item21) {
        this.item21 = item21;
    }

    public String getItemname22() {
        return itemname22;
    }

    public void setItemname22(String itemname22) {
        this.itemname22 = itemname22;
    }

    public BigDecimal getItem22() {
        return item22;
    }

    public void setItem22(BigDecimal item22) {
        this.item22 = item22;
    }

    public String getItemname23() {
        return itemname23;
    }

    public void setItemname23(String itemname23) {
        this.itemname23 = itemname23;
    }

    public BigDecimal getItem23() {
        return item23;
    }

    public void setItem23(BigDecimal item23) {
        this.item23 = item23;
    }

    public String getItemname24() {
        return itemname24;
    }

    public void setItemname24(String itemname24) {
        this.itemname24 = itemname24;
    }

    public BigDecimal getItem24() {
        return item24;
    }

    public void setItem24(BigDecimal item24) {
        this.item24 = item24;
    }

    public String getItemname25() {
        return itemname25;
    }

    public void setItemname25(String itemname25) {
        this.itemname25 = itemname25;
    }

    public BigDecimal getItem25() {
        return item25;
    }

    public void setItem25(BigDecimal item25) {
        this.item25 = item25;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getNotation() {
        return notation;
    }

    public void setNotation(String notation) {
        this.notation = notation;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(LocalDateTime operatedate) {
        this.operatedate = operatedate;
    }

    @Override
    public String toString() {
        return "WfBenifit{" +
        "yearcode=" + yearcode +
        ", benifitno=" + benifitno +
        ", facinamecode=" + facinamecode +
        ", facilityname=" + facilityname +
        ", worktime=" + worktime +
        ", repmonth=" + repmonth +
        ", indept=" + indept +
        ", exedept=" + exedept +
        ", oridate=" + oridate +
        ", enddate=" + enddate +
        ", itemname1=" + itemname1 +
        ", item1=" + item1 +
        ", itemname2=" + itemname2 +
        ", item2=" + item2 +
        ", itemname3=" + itemname3 +
        ", item3=" + item3 +
        ", itemname4=" + itemname4 +
        ", item4=" + item4 +
        ", itemname5=" + itemname5 +
        ", item5=" + item5 +
        ", itemname6=" + itemname6 +
        ", item6=" + item6 +
        ", itemname7=" + itemname7 +
        ", item7=" + item7 +
        ", itemname8=" + itemname8 +
        ", item8=" + item8 +
        ", itemname9=" + itemname9 +
        ", item9=" + item9 +
        ", itemname10=" + itemname10 +
        ", item10=" + item10 +
        ", itemname11=" + itemname11 +
        ", item11=" + item11 +
        ", itemname12=" + itemname12 +
        ", item12=" + item12 +
        ", itemname13=" + itemname13 +
        ", item13=" + item13 +
        ", itemname14=" + itemname14 +
        ", item14=" + item14 +
        ", itemname15=" + itemname15 +
        ", item15=" + item15 +
        ", itemname16=" + itemname16 +
        ", item16=" + item16 +
        ", itemname17=" + itemname17 +
        ", item17=" + item17 +
        ", itemname18=" + itemname18 +
        ", item18=" + item18 +
        ", itemname19=" + itemname19 +
        ", item19=" + item19 +
        ", itemname20=" + itemname20 +
        ", item20=" + item20 +
        ", itemname21=" + itemname21 +
        ", item21=" + item21 +
        ", itemname22=" + itemname22 +
        ", item22=" + item22 +
        ", itemname23=" + itemname23 +
        ", item23=" + item23 +
        ", itemname24=" + itemname24 +
        ", item24=" + item24 +
        ", itemname25=" + itemname25 +
        ", item25=" + item25 +
        ", fruit=" + fruit +
        ", notation=" + notation +
        ", operator=" + operator +
        ", operatedate=" + operatedate +
        "}";
    }
}
