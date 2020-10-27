package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class KtipPatientUpdate implements Serializable {

    private static final long serialVersionUID=1L;

    private String localPatientno;

    private Integer ynupdate;

    private LocalDateTime updatetime;

    private String idNo;


    public String getLocalPatientno() {
        return localPatientno;
    }

    public void setLocalPatientno(String localPatientno) {
        this.localPatientno = localPatientno;
    }

    public Integer getYnupdate() {
        return ynupdate;
    }

    public void setYnupdate(Integer ynupdate) {
        this.ynupdate = ynupdate;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "KtipPatientUpdate{" +
        "localPatientno=" + localPatientno +
        ", ynupdate=" + ynupdate +
        ", updatetime=" + updatetime +
        ", idNo=" + idNo +
        "}";
    }
}
