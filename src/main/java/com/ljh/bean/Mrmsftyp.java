package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 发票项目归类资料档MRMSFTYP
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mrmsftyp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 费用统计类别代码
     */
    @TableId(value = "REPT_TYPE", type = IdType.AUTO)
    private String reptType;

    /**
     * 费用统计类别名称
     */
    private String reptName;

    /**
     * 最小费用代码
     */
    private String feeId;

    /**
     * 最小费用名称
     */
    private String feeName;

    /**
     * 操作人
     */
    private String operMan;

    /**
     * 操作时日
     */
    private LocalDateTime operDate;


    public String getReptType() {
        return reptType;
    }

    public void setReptType(String reptType) {
        this.reptType = reptType;
    }

    public String getReptName() {
        return reptName;
    }

    public void setReptName(String reptName) {
        this.reptName = reptName;
    }

    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public String getOperMan() {
        return operMan;
    }

    public void setOperMan(String operMan) {
        this.operMan = operMan;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "Mrmsftyp{" +
        "reptType=" + reptType +
        ", reptName=" + reptName +
        ", feeId=" + feeId +
        ", feeName=" + feeName +
        ", operMan=" + operMan +
        ", operDate=" + operDate +
        "}";
    }
}
