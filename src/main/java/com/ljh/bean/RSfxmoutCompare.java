package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 电子病历共享工程检验字典
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class RSfxmoutCompare implements Serializable {

    private static final long serialVersionUID=1L;

    private String ybid;

    private String ybname;


    public String getYbid() {
        return ybid;
    }

    public void setYbid(String ybid) {
        this.ybid = ybid;
    }

    public String getYbname() {
        return ybname;
    }

    public void setYbname(String ybname) {
        this.ybname = ybname;
    }

    @Override
    public String toString() {
        return "RSfxmoutCompare{" +
        "ybid=" + ybid +
        ", ybname=" + ybname +
        "}";
    }
}
