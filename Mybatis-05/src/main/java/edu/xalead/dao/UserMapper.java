package edu.xalead.dao;

import edu.xalead.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    //根据id查询用户
    @Select("select * from m_user")
    List<User> getUsers();

    @Select("select * from m_user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into m_user values(#{id},#{name},#{pwd})")
    int addUser(User user);

    @Delete("delete from m_user where id = #{id}")
    void deleteUser(@Param("id") int id);

    @Update("update m_user set name=#{name},pwd=#{pwd} where id = #{id}")
    int updateUser(User user);
}
