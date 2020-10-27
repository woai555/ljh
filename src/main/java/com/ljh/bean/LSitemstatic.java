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
public class LSitemstatic implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "STATICDATE", type = IdType.AUTO)
    private LocalDateTime staticdate;

    private String singleitemcode;

    private Integer cpatientnumber;

    private Integer inpatientnumber;


    public LocalDateTime getStaticdate() {
        return staticdate;
    }

    public void setStaticdate(LocalDateTime staticdate) {
        this.staticdate = staticdate;
    }

    public String getSingleitemcode() {
        return singleitemcode;
    }

    public void setSingleitemcode(String singleitemcode) {
        this.singleitemcode = singleitemcode;
    }

    public Integer getCpatientnumber() {
        return cpatientnumber;
    }

    public void setCpatientnumber(Integer cpatientnumber) {
        this.cpatientnumber = cpatientnumber;
    }

    public Integer getInpatientnumber() {
        return inpatientnumber;
    }

    public void setInpatientnumber(Integer inpatientnumber) {
        this.inpatientnumber = inpatientnumber;
    }

    @Override
    public String toString() {
        return "LSitemstatic{" +
        "staticdate=" + staticdate +
        ", singleitemcode=" + singleitemcode +
        ", cpatientnumber=" + cpatientnumber +
        ", inpatientnumber=" + inpatientnumber +
        "}";
    }
}
