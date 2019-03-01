package com.ly.pojo;

import java.util.Date;

public class Cdetails {
    private Integer cid;

    private String cname;

    private String descride;

    private String cimg;

    private String price;

    private String evaluation;

    private Date launchtime;

    private Date soldouttime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getDescride() {
        return descride;
    }

    public void setDescride(String descride) {
        this.descride = descride == null ? null : descride.trim();
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg == null ? null : cimg.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation == null ? null : evaluation.trim();
    }

    public Date getLaunchtime() {
        return launchtime;
    }

    public void setLaunchtime(Date launchtime) {
        this.launchtime = launchtime;
    }

    public Date getSoldouttime() {
        return soldouttime;
    }

    public void setSoldouttime(Date soldouttime) {
        this.soldouttime = soldouttime;
    }
}