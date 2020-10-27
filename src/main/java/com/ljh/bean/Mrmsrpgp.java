package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 疾病分类资料档MRMSRPGP
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsrpgp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 统计分类
     */
    @TableId(value = "STAT_TYPE", type = IdType.AUTO)
    private String statType;

    /**
     * 子类代码
     */
    private String statKind;

    /**
     * 子类名称
     */
    private String statName;

    /**
     * 注释
     */
    private String statNote;


    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }

    public String getStatKind() {
        return statKind;
    }

    public void setStatKind(String statKind) {
        this.statKind = statKind;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public String getStatNote() {
        return statNote;
    }

    public void setStatNote(String statNote) {
        this.statNote = statNote;
    }

    @Override
    public String toString() {
        return "Mrmsrpgp{" +
        "statType=" + statType +
        ", statKind=" + statKind +
        ", statName=" + statName +
        ", statNote=" + statNote +
        "}";
    }
}
