package com.zdn.ssm.dao;

import com.zdn.ssm.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User selectByNameAndPass(@Param("name") String name, @Param("password") String password);
}
