package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 长期医嘱整理组别档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Mdpddcgh implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 医嘱整理组别
     */
    @TableId(value = "DECO_GRP", type = IdType.AUTO)
    private Integer decoGrp;

    /**
     * 医嘱整理时间
     */
    private LocalDateTime decoTime;

    /**
     * 自动打印时间
     */
    private LocalDateTime prnTime;

    /**
     * 工作日开始时间
     */
    private LocalDateTime wrkTime;


    public Integer getDecoGrp() {
        return decoGrp;
    }

    public void setDecoGrp(Integer decoGrp) {
        this.decoGrp = decoGrp;
    }

    public LocalDateTime getDecoTime() {
        return decoTime;
    }

    public void setDecoTime(LocalDateTime decoTime) {
        this.decoTime = decoTime;
    }

    public LocalDateTime getPrnTime() {
        return prnTime;
    }

    public void setPrnTime(LocalDateTime prnTime) {
        this.prnTime = prnTime;
    }

    public LocalDateTime getWrkTime() {
        return wrkTime;
    }

    public void setWrkTime(LocalDateTime wrkTime) {
        this.wrkTime = wrkTime;
    }

    @Override
    public String toString() {
        return "Mdpddcgh{" +
        "decoGrp=" + decoGrp +
        ", decoTime=" + decoTime +
        ", prnTime=" + prnTime +
        ", wrkTime=" + wrkTime +
        "}";
    }
}
