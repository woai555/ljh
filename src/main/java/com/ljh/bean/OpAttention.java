package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 注意事项维护
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OpAttention implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 1申请注意事项 2审批注意事项  3 麻醉注意事项  4 手术注意事项   5术后注意事项
     */
    @TableId(value = "KIND", type = IdType.AUTO)
    private String kind;

    private String code;

    private String name;


    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    @Override
    public String toString() {
        return "OpAttention{" +
        "kind=" + kind +
        ", code=" + code +
        ", name=" + name +
        "}";
    }
}
