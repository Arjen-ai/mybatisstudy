package edu.xalead.dao;

import edu.xalead.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select * from teacher")
    public Teacher getTeacher();
}
