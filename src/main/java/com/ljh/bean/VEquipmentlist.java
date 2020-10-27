package com.ljh.bean;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 虹桥视图导入表-设备列表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class VEquipmentlist implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CODE", type = IdType.AUTO)
    private BigDecimal code;

    private String name;

    private String hotkey;

    private String computer;


    public BigDecimal getCode() {
        return code;
    }

    public void setCode(BigDecimal code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotkey() {
        return hotkey;
    }

    public void setHotkey(String hotkey) {
        this.hotkey = hotkey;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "VEquipmentlist{" +
        "code=" + code +
        ", name=" + name +
        ", hotkey=" + hotkey +
        ", computer=" + computer +
        "}";
    }
}
