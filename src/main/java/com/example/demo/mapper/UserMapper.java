package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User findByName(@Param(value = "name") String name);

    public User findById(@Param(value = "id")Integer id);
}
