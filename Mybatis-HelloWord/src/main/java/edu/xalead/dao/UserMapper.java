package edu.xalead.dao;

import edu.xalead.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //模糊查询
    List<User> getUserLike(String value);
    //获取全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);

    User getUserByIdAndName(Map<String,Object> map);
    //insert 一个用户
    int addUser(User user);

    int updateUser(User user);

    void deleteUser(int id);
}
