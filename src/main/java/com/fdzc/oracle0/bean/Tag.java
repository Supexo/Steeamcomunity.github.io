package com.fdzc.oracle0.bean;

//不再使用了，因为tid根本用不到
public class Tag {
    private Integer tid;
    private String name;

    public Tag(Integer tid, String name) {
        this.tid = tid;
        this.name = name;
    }

    public Tag() {
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}