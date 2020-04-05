package edu.xalead.dao;

import edu.xalead.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    //获取指定老师下的所有学生及老师的信息
    public Teacher getTeacher(@Param("tid") int id);

    public Teacher getTeacher2(@Param("tid") int id);
}
