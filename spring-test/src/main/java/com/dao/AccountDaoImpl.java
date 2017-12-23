package com.dao;

import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

	@Override
	public void addAccount() {
		// TODO Auto-generated method stub
		System.out.println("addAccount...");
	}

}
