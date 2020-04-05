package edu.xalead.dao;

import edu.xalead.pojo.User;
import edu.xalead.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void getUserById(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user.toString());
        session.close();
    }

    @Test
    public void getUserByLimit(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map map = new HashMap<String, Object>();
        map.put("startIndex",0);
        map.put("pageSize",3);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user.toString());
        }
        session.close();
    }
}
