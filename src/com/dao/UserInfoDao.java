package com.dao;

import java.util.List;

import com.entity.UserInfo;

public interface UserInfoDao {
	public boolean login(String userId, String userPassword);
	public List<UserInfo> getAllUser();
	public UserInfo getUserByUserId(String userId);
	public boolean addUser(UserInfo user);
	public boolean delUserByUserId(String userId);
	public boolean updateUserByUserId(String userId, UserInfo user);

}
