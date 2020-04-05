package edu.xalead.dao;

import edu.xalead.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //获取全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //insert 一个用户
    int addUser(User user);

    int updateUser(User user);

    void deleteUser(int id);
}
