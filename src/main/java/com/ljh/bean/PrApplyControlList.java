package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 打印模板控件明细表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class PrApplyControlList implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "MODELNO", type = IdType.AUTO)
    private String modelno;

    private String controlno;

    private String controlname;

    private BigDecimal controlkind;

    private String itemname;

    private String controltype;

    private String datatype;

    private BigDecimal beginX;

    private BigDecimal beginY;

    private BigDecimal endX;

    private BigDecimal endY;

    private BigDecimal width;

    private BigDecimal height;

    private BigDecimal border;

    private String borderColor;

    private String backgroundColor;

    private String fontColor;

    private String fontFace;

    private String fontHeight;

    private String fontWeight;

    private String fontItalic;

    private String fontUnderline;

    private String alignment;

    private String format;

    private String lineHeight;

    private String lineColor;

    private String controlinfo;

    private BigDecimal orderid;

    private String operatorno;

    private LocalDateTime operatortime;

    private String ynfirst;

    private String dddw;


    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public String getControlno() {
        return controlno;
    }

    public void setControlno(String controlno) {
        this.controlno = controlno;
    }

    public String getControlname() {
        return controlname;
    }

    public void setControlname(String controlname) {
        this.controlname = controlname;
    }

    public BigDecimal getControlkind() {
        return controlkind;
    }

    public void setControlkind(BigDecimal controlkind) {
        this.controlkind = controlkind;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getControltype() {
        return controltype;
    }

    public void setControltype(String controltype) {
        this.controltype = controltype;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public BigDecimal getBeginX() {
        return beginX;
    }

    public void setBeginX(BigDecimal beginX) {
        this.beginX = beginX;
    }

    public BigDecimal getBeginY() {
        return beginY;
    }

    public void setBeginY(BigDecimal beginY) {
        this.beginY = beginY;
    }

    public BigDecimal getEndX() {
        return endX;
    }

    public void setEndX(BigDecimal endX) {
        this.endX = endX;
    }

    public BigDecimal getEndY() {
        return endY;
    }

    public void setEndY(BigDecimal endY) {
        this.endY = endY;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getBorder() {
        return border;
    }

    public void setBorder(BigDecimal border) {
        this.border = border;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontFace() {
        return fontFace;
    }

    public void setFontFace(String fontFace) {
        this.fontFace = fontFace;
    }

    public String getFontHeight() {
        return fontHeight;
    }

    public void setFontHeight(String fontHeight) {
        this.fontHeight = fontHeight;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    public String getFontItalic() {
        return fontItalic;
    }

    public void setFontItalic(String fontItalic) {
        this.fontItalic = fontItalic;
    }

    public String getFontUnderline() {
        return fontUnderline;
    }

    public void setFontUnderline(String fontUnderline) {
        this.fontUnderline = fontUnderline;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(String lineHeight) {
        this.lineHeight = lineHeight;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }

    public String getControlinfo() {
        return controlinfo;
    }

    public void setControlinfo(String controlinfo) {
        this.controlinfo = controlinfo;
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }

    public String getOperatorno() {
        return operatorno;
    }

    public void setOperatorno(String operatorno) {
        this.operatorno = operatorno;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    public String getYnfirst() {
        return ynfirst;
    }

    public void setYnfirst(String ynfirst) {
        this.ynfirst = ynfirst;
    }

    public String getDddw() {
        return dddw;
    }

    public void setDddw(String dddw) {
        this.dddw = dddw;
    }

    @Override
    public String toString() {
        return "PrApplyControlList{" +
        "modelno=" + modelno +
        ", controlno=" + controlno +
        ", controlname=" + controlname +
        ", controlkind=" + controlkind +
        ", itemname=" + itemname +
        ", controltype=" + controltype +
        ", datatype=" + datatype +
        ", beginX=" + beginX +
        ", beginY=" + beginY +
        ", endX=" + endX +
        ", endY=" + endY +
        ", width=" + width +
        ", height=" + height +
        ", border=" + border +
        ", borderColor=" + borderColor +
        ", backgroundColor=" + backgroundColor +
        ", fontColor=" + fontColor +
        ", fontFace=" + fontFace +
        ", fontHeight=" + fontHeight +
        ", fontWeight=" + fontWeight +
        ", fontItalic=" + fontItalic +
        ", fontUnderline=" + fontUnderline +
        ", alignment=" + alignment +
        ", format=" + format +
        ", lineHeight=" + lineHeight +
        ", lineColor=" + lineColor +
        ", controlinfo=" + controlinfo +
        ", orderid=" + orderid +
        ", operatorno=" + operatorno +
        ", operatortime=" + operatortime +
        ", ynfirst=" + ynfirst +
        ", dddw=" + dddw +
        "}";
    }
}
