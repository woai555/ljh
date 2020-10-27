package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 常数表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdConstant implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 类型
     */
    @TableId(value = "TYPENAME", type = IdType.AUTO)
    private String typename;

    /**
     * 代码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 操作员
     */
    private String operCode;

    /**
     * 操作时间
     */
    private LocalDateTime operDate;


    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "OrdConstant{" +
        "typename=" + typename +
        ", code=" + code +
        ", name=" + name +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
