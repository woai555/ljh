package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 护士排班表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class NrsWork implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 日期
     */
    @TableId(value = "NRS_DATE", type = IdType.AUTO)
    private LocalDateTime nrsDate;

    /**
     * 午别
     */
    private String noonCode;

    private String noonName;

    /**
     * 护士站编号
     */
    private String nrsCellCode;

    private String cellName;

    /**
     * 护士编号
     */
    private String nrsCode;

    private String nrsName;


    public LocalDateTime getNrsDate() {
        return nrsDate;
    }

    public void setNrsDate(LocalDateTime nrsDate) {
        this.nrsDate = nrsDate;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode;
    }

    public String getNoonName() {
        return noonName;
    }

    public void setNoonName(String noonName) {
        this.noonName = noonName;
    }

    public String getNrsCellCode() {
        return nrsCellCode;
    }

    public void setNrsCellCode(String nrsCellCode) {
        this.nrsCellCode = nrsCellCode;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getNrsCode() {
        return nrsCode;
    }

    public void setNrsCode(String nrsCode) {
        this.nrsCode = nrsCode;
    }

    public String getNrsName() {
        return nrsName;
    }

    public void setNrsName(String nrsName) {
        this.nrsName = nrsName;
    }

    @Override
    public String toString() {
        return "NrsWork{" +
        "nrsDate=" + nrsDate +
        ", noonCode=" + noonCode +
        ", noonName=" + noonName +
        ", nrsCellCode=" + nrsCellCode +
        ", cellName=" + cellName +
        ", nrsCode=" + nrsCode +
        ", nrsName=" + nrsName +
        "}";
    }
}
