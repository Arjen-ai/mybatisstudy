package edu.xalead.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    //多个学生关联一个老师（用对象）多对一是关联
    private Teacher teacher;
}
