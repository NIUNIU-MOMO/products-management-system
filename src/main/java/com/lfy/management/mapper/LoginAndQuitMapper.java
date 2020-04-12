package com.lfy.management.mapper;

import com.lfy.management.pojo.SystemUser;
import org.apache.ibatis.annotations.Param;

public interface LoginAndQuitMapper {
    SystemUser selectUserByNameAndPassword(@Param("name") String name, @Param("password") String password);
}
