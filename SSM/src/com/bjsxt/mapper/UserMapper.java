package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.User;

public interface UserMapper {

	@Select("select * from user where name=#{name} and password=#{password}")
	List<User> selUser(User user1);

}
