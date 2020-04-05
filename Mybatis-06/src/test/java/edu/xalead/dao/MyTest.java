package edu.xalead.dao;

import edu.xalead.pojo.Student;
import edu.xalead.pojo.Teacher;
import edu.xalead.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void test1(){
        SqlSession session = MybatisUtils.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher();
        System.out.println(teacher.toString());
        session.close();
    }

    @Test
    public void test2(){
        SqlSession session = MybatisUtils.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void test3(){
        SqlSession session = MybatisUtils.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        session.close();
    }
}
