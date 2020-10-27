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
public class MijianLoginlog implements Serializable {

    private static final long serialVersionUID=1L;

    private String inputData;

    private LocalDateTime inputDate;


    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }

    public LocalDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDateTime inputDate) {
        this.inputDate = inputDate;
    }

    @Override
    public String toString() {
        return "MijianLoginlog{" +
        "inputData=" + inputData +
        ", inputDate=" + inputDate +
        "}";
    }
}
