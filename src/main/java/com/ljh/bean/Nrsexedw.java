package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 治疗单打印窗口档
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class Nrsexedw implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 治疗单打印窗口
     */
    @TableId(value = "EXEC_PRINT_DW", type = IdType.AUTO)
    private String execPrintDw;

    /**
     * 治疗单打印窗口名称
     */
    private String execPrnDwnm;


    public String getExecPrintDw() {
        return execPrintDw;
    }

    public void setExecPrintDw(String execPrintDw) {
        this.execPrintDw = execPrintDw;
    }

    public String getExecPrnDwnm() {
        return execPrnDwnm;
    }

    public void setExecPrnDwnm(String execPrnDwnm) {
        this.execPrnDwnm = execPrnDwnm;
    }

    @Override
    public String toString() {
        return "Nrsexedw{" +
        "execPrintDw=" + execPrintDw +
        ", execPrnDwnm=" + execPrnDwnm +
        "}";
    }
}
