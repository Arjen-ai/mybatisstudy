package edu.xalead.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    private  String title;
    private String author;
    private Date createTime;//属性名与字段名不一致(从_到驼峰)
    private int views;
}
