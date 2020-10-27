package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class ViewTssc implements Serializable {

    private static final long serialVersionUID=1L;

    private String 病历号;

    private String 姓名;

    private String 出生年月日;

    private String 电话;

    private String 户籍地址;


    public String get病历号() {
        return 病历号;
    }

    public void set病历号(String 病历号) {
        this.病历号 = 病历号;
    }

    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    public String get出生年月日() {
        return 出生年月日;
    }

    public void set出生年月日(String 出生年月日) {
        this.出生年月日 = 出生年月日;
    }

    public String get电话() {
        return 电话;
    }

    public void set电话(String 电话) {
        this.电话 = 电话;
    }

    public String get户籍地址() {
        return 户籍地址;
    }

    public void set户籍地址(String 户籍地址) {
        this.户籍地址 = 户籍地址;
    }

    @Override
    public String toString() {
        return "ViewTssc{" +
        "病历号=" + 病历号 +
        ", 姓名=" + 姓名 +
        ", 出生年月日=" + 出生年月日 +
        ", 电话=" + 电话 +
        ", 户籍地址=" + 户籍地址 +
        "}";
    }
}
