package edu.xalead.dao;

import edu.xalead.pojo.User;
import edu.xalead.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


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
    public void testLog4j(){
        logger.info("info:进入了testLog4");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }
}
