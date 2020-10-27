package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Output implements Serializable {

    private static final long serialVersionUID=1L;

    private Long compute0001;

    private String compute0002;

    private String compute0003;

    private String compute0004;

    private String compute0005;

    private String compute0006;

    private String compute0007;


    public Long getCompute0001() {
        return compute0001;
    }

    public void setCompute0001(Long compute0001) {
        this.compute0001 = compute0001;
    }

    public String getCompute0002() {
        return compute0002;
    }

    public void setCompute0002(String compute0002) {
        this.compute0002 = compute0002;
    }

    public String getCompute0003() {
        return compute0003;
    }

    public void setCompute0003(String compute0003) {
        this.compute0003 = compute0003;
    }

    public String getCompute0004() {
        return compute0004;
    }

    public void setCompute0004(String compute0004) {
        this.compute0004 = compute0004;
    }

    public String getCompute0005() {
        return compute0005;
    }

    public void setCompute0005(String compute0005) {
        this.compute0005 = compute0005;
    }

    public String getCompute0006() {
        return compute0006;
    }

    public void setCompute0006(String compute0006) {
        this.compute0006 = compute0006;
    }

    public String getCompute0007() {
        return compute0007;
    }

    public void setCompute0007(String compute0007) {
        this.compute0007 = compute0007;
    }

    @Override
    public String toString() {
        return "Output{" +
        "compute0001=" + compute0001 +
        ", compute0002=" + compute0002 +
        ", compute0003=" + compute0003 +
        ", compute0004=" + compute0004 +
        ", compute0005=" + compute0005 +
        ", compute0006=" + compute0006 +
        ", compute0007=" + compute0007 +
        "}";
    }
}
