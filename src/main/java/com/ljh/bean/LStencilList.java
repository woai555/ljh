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
public class LStencilList implements Serializable {

    private static final long serialVersionUID=1L;

    private String controlno;

    private String machinecode;

    private Integer stencilkind;

    private Integer controlkind;

    private String controlcode;

    private Integer beginX;

    private Integer beginY;

    private Integer endX;

    private Integer endY;

    private Integer height;

    private Integer width;

    private String penStyle;

    private String penWidth;

    private String fontFace;

    private String fontHeight;

    private String fontWeight;

    private String fontItalic;

    private String fontUnderline;

    private String text;

    private Integer taborder;

    private Integer operatorid;

    private LocalDateTime operatortime;

    private String fontCharset;

    private Integer temwidth;

    private Integer temheight;

    private String stencilno;


    public String getControlno() {
        return controlno;
    }

    public void setControlno(String controlno) {
        this.controlno = controlno;
    }

    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public Integer getStencilkind() {
        return stencilkind;
    }

    public void setStencilkind(Integer stencilkind) {
        this.stencilkind = stencilkind;
    }

    public Integer getControlkind() {
        return controlkind;
    }

    public void setControlkind(Integer controlkind) {
        this.controlkind = controlkind;
    }

    public String getControlcode() {
        return controlcode;
    }

    public void setControlcode(String controlcode) {
        this.controlcode = controlcode;
    }

    public Integer getBeginX() {
        return beginX;
    }

    public void setBeginX(Integer beginX) {
        this.beginX = beginX;
    }

    public Integer getBeginY() {
        return beginY;
    }

    public void setBeginY(Integer beginY) {
        this.beginY = beginY;
    }

    public Integer getEndX() {
        return endX;
    }

    public void setEndX(Integer endX) {
        this.endX = endX;
    }

    public Integer getEndY() {
        return endY;
    }

    public void setEndY(Integer endY) {
        this.endY = endY;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getPenStyle() {
        return penStyle;
    }

    public void setPenStyle(String penStyle) {
        this.penStyle = penStyle;
    }

    public String getPenWidth() {
        return penWidth;
    }

    public void setPenWidth(String penWidth) {
        this.penWidth = penWidth;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getTaborder() {
        return taborder;
    }

    public void setTaborder(Integer taborder) {
        this.taborder = taborder;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public LocalDateTime getOperatortime() {
        return operatortime;
    }

    public void setOperatortime(LocalDateTime operatortime) {
        this.operatortime = operatortime;
    }

    public String getFontCharset() {
        return fontCharset;
    }

    public void setFontCharset(String fontCharset) {
        this.fontCharset = fontCharset;
    }

    public Integer getTemwidth() {
        return temwidth;
    }

    public void setTemwidth(Integer temwidth) {
        this.temwidth = temwidth;
    }

    public Integer getTemheight() {
        return temheight;
    }

    public void setTemheight(Integer temheight) {
        this.temheight = temheight;
    }

    public String getStencilno() {
        return stencilno;
    }

    public void setStencilno(String stencilno) {
        this.stencilno = stencilno;
    }

    @Override
    public String toString() {
        return "LStencilList{" +
        "controlno=" + controlno +
        ", machinecode=" + machinecode +
        ", stencilkind=" + stencilkind +
        ", controlkind=" + controlkind +
        ", controlcode=" + controlcode +
        ", beginX=" + beginX +
        ", beginY=" + beginY +
        ", endX=" + endX +
        ", endY=" + endY +
        ", height=" + height +
        ", width=" + width +
        ", penStyle=" + penStyle +
        ", penWidth=" + penWidth +
        ", fontFace=" + fontFace +
        ", fontHeight=" + fontHeight +
        ", fontWeight=" + fontWeight +
        ", fontItalic=" + fontItalic +
        ", fontUnderline=" + fontUnderline +
        ", text=" + text +
        ", taborder=" + taborder +
        ", operatorid=" + operatorid +
        ", operatortime=" + operatortime +
        ", fontCharset=" + fontCharset +
        ", temwidth=" + temwidth +
        ", temheight=" + temheight +
        ", stencilno=" + stencilno +
        "}";
    }
}
