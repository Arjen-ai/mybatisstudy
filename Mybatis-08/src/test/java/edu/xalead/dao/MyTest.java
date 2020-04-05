package edu.xalead.dao;

import edu.xalead.pojo.Blog;
import edu.xalead.utils.IDutils;
import edu.xalead.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;


public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("vue");
        blog.setAuthor("admin");
        blog.setCreateTime(new Date());
        blog.setViews(30);
        mapper.addBlog(blog);
        sqlSession.close();
    }

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
//        map.put("title","vue");
        map.put("author","admin");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
//        map.put("title","vue");
//        map.put("author","admin");
        map.put("views",25);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title","jsp");
        map.put("author","admin1");
        map.put("id","1");
         mapper.updateBlog(map);
        sqlSession.close();
    }

    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
