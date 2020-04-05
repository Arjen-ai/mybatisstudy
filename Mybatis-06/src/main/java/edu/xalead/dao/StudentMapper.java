package edu.xalead.dao;
import edu.xalead.pojo.Student;
import java.util.List;

public interface StudentMapper {
    //查询所有老师和学生的信息
    public List<Student> getStudent();
    public List<Student> getStudent2();
}
