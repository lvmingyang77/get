package com.ly.pojo;

public class Commodity {
    private Integer cid;

    private String cname;

    private String price;

    private Integer count;

    private String cdatails;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCdatails() {
        return cdatails;
    }

    public void setCdatails(String cdatails) {
        this.cdatails = cdatails == null ? null : cdatails.trim();
    }
}