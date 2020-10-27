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
public class RRegisterXtyl implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    private LocalDateTime seeDate;

    private String cardNo;

    private String name;

    private String idenno;

    private String flag;

    private LocalDateTime uploadtime;

    private LocalDateTime regDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(LocalDateTime seeDate) {
        this.seeDate = seeDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public LocalDateTime getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(LocalDateTime uploadtime) {
        this.uploadtime = uploadtime;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "RRegisterXtyl{" +
        "id=" + id +
        ", seeDate=" + seeDate +
        ", cardNo=" + cardNo +
        ", name=" + name +
        ", idenno=" + idenno +
        ", flag=" + flag +
        ", uploadtime=" + uploadtime +
        ", regDate=" + regDate +
        "}";
    }
}
