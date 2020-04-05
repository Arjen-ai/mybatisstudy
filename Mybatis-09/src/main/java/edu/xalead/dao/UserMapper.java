package edu.xalead.dao;

import edu.xalead.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
