package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 限制医生规则表
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class OrdDoctLimit implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键，功能序号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 功能名称
     */
    private String limitName;

    /**
     * 在用状态
     */
    private String usedState;

    /**
     * 备注
     */
    private String remark;

    /**
     * 提示方式: 1.提示完继续  2.提示完禁止 3.提示完给选项
     */
    private String type;

    /**
     * 1>,2<,3=,4like右模糊,5左模糊,45左右模糊,12<>,13>=,23<=
     */
    private String relate;

    /**
     * 临界值
     */
    private String limitValue;

    /**
     * 1允许且其他不管，2不允许且其他不管,12允许且其他不允许，21不允许且其他允许。
     */
    private String ynAllow;

    /**
     * 最后修改人
     */
    private String operCode;

    /**
     * 最后修改时间
     */
    private LocalDateTime operDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLimitName() {
        return limitName;
    }

    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    public String getUsedState() {
        return usedState;
    }

    public void setUsedState(String usedState) {
        this.usedState = usedState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRelate() {
        return relate;
    }

    public void setRelate(String relate) {
        this.relate = relate;
    }

    public String getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(String limitValue) {
        this.limitValue = limitValue;
    }

    public String getYnAllow() {
        return ynAllow;
    }

    public void setYnAllow(String ynAllow) {
        this.ynAllow = ynAllow;
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
        return "OrdDoctLimit{" +
        "id=" + id +
        ", limitName=" + limitName +
        ", usedState=" + usedState +
        ", remark=" + remark +
        ", type=" + type +
        ", relate=" + relate +
        ", limitValue=" + limitValue +
        ", ynAllow=" + ynAllow +
        ", operCode=" + operCode +
        ", operDate=" + operDate +
        "}";
    }
}
