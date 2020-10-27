package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 长期医嘱整理组别资料档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpddcgd implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 医嘱整理组别
     */
    private Integer decoGrp;

    /**
     * 护士站代码
     */
    private String nsstCode;

    /**
     * 护士站名称
     */
    private String nsstName;


    public Integer getDecoGrp() {
        return decoGrp;
    }

    public void setDecoGrp(Integer decoGrp) {
        this.decoGrp = decoGrp;
    }

    public String getNsstCode() {
        return nsstCode;
    }

    public void setNsstCode(String nsstCode) {
        this.nsstCode = nsstCode;
    }

    public String getNsstName() {
        return nsstName;
    }

    public void setNsstName(String nsstName) {
        this.nsstName = nsstName;
    }

    @Override
    public String toString() {
        return "Mdpddcgd{" +
        "decoGrp=" + decoGrp +
        ", nsstCode=" + nsstCode +
        ", nsstName=" + nsstName +
        "}";
    }
}
