package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 人员权限列表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class REmplprivlist implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 权限类别
     */
    @TableId(value = "PRIV_KIND", type = IdType.AUTO)
    private String privKind;

    /**
     * 人员编码
     */
    private String emplCode;

    /**
     * 操作员号
     */
    private String operCode;

    /**
     * 操作日期
     */
    private LocalDateTime operDate;


    public String getPrivKind() {
        return privKind;
    }

    public void setPrivKind(String privKind) {
        this.privKind = privKind;
    }

    public String getEmplCode() {
        return emplCode;
    }

    public void setEmplCode(String emplCode) {
        this.emplCode = emplCode;
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public LocalDateTime getOperDate() {
        return operDate;
    }

    public void setOperDate(LocalDateTime operDate) {
        this.operDate = operDate;
    }

    @Override
    public String toString() {
        return "REmplprivlist{" +
        "privKind=" + privKind +
        ", emplCode=" + emplCode +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
