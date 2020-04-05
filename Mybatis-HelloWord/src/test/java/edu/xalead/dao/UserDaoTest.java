package edu.xalead.dao;

import edu.xalead.pojo.User;
import edu.xalead.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void getUserLike(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserLike("%a%");
        for (User user : userList){
            System.out.println(user.toString());
        }
        session.close();
    }
    @Test
    public void test1(){
        //1.获得执行sql的sqlSession
        SqlSession session = MybatisUtils.getSqlSession();
        //2.执行(方法一getMapper)
        UserMapper userDao = session.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList){
            System.out.println(user.toString());
        }
        //关闭sqlSession
        session.close();
    }

    @Test
    public void getUserById(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user.toString());
        session.close();
    }
    @Test
    public void getUserByIdAndName(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        Map map = new HashMap<String, Object>();
        map.put("id",1);
        map.put("name","admin");
        User user = userMapper.getUserByIdAndName(map);
        System.out.println(user.toString());
        session.close();
    }
    @Test
    public void addUser(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId(4);
        user.setName("王五");
        user.setPwd("333333");
        userMapper.addUser(user);
        //提交事务（增删改must提交事务，模块mybatis-02）
        session.commit();
        session.close();
    }

    @Test
    public void updateUser(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.updateUser(new User(4,"哈哈","444444"));

        //提交事务
        session.commit();
        session.close();
    }
    @Test
    public void deleteUser(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteUser(4);

        session.commit();
        session.close();
    }
}
