package edu.xalead.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

//工具类(工厂模式)
public class MybatisUtils {
    private static  SqlSessionFactory sqlSessionFactory;
    static{
        try {
            //获取sqlSessionFactory --> sqlSession
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取sqlSession 完全包含了面向数据库执行sql命令所需的所有方法。
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
