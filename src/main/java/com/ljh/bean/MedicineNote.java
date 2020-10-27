package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 出院带药备注
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class MedicineNote implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 药品编码
     */
    @TableId(value = "MEDICINECODE", type = IdType.AUTO)
    private String medicinecode;

    /**
     * 服用时间
     */
    private String medicinetime;

    /**
     * 注意事项
     */
    private String medicinenote;

    /**
     * 药品名称
     */
    private String medicinename;

    /**
     * 规格
     */
    private String spec;

    /**
     * 拼音
     */
    private String spell;


    public String getMedicinecode() {
        return medicinecode;
    }

    public void setMedicinecode(String medicinecode) {
        this.medicinecode = medicinecode;
    }

    public String getMedicinetime() {
        return medicinetime;
    }

    public void setMedicinetime(String medicinetime) {
        this.medicinetime = medicinetime;
    }

    public String getMedicinenote() {
        return medicinenote;
    }

    public void setMedicinenote(String medicinenote) {
        this.medicinenote = medicinenote;
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "MedicineNote{" +
        "medicinecode=" + medicinecode +
        ", medicinetime=" + medicinetime +
        ", medicinenote=" + medicinenote +
        ", medicinename=" + medicinename +
        ", spec=" + spec +
        ", spell=" + spell +
        "}";
    }
}
