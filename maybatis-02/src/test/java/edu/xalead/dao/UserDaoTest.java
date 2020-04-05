package edu.xalead.dao;

import edu.xalead.dao.UserMapper;
import edu.xalead.pojo.User;
import edu.xalead.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    @Test
    public void getUserById(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user.toString());
        session.close();
    }
}
