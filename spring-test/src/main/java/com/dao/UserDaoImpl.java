package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public void done() {
		// TODO Auto-generated method stub
		System.out.println("UserDaoImpl.invoke......");
	}

	@Override
	public int addUser() {
		System.out.println("add user ......");
        return 6666;
	}

	@Override
	public void updateUser() {
		System.out.println("update user ......");
	}

	@Override
	public void deleteUser() {
		System.out.println("delete user ......");
	}

	@Override
	public void findUser() {
		System.out.println("find user ......");
	}

}
