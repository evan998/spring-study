package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountDao;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao accountDao;
	/*public void setAccountDao(AccountDao accountDao){
		this.accountDao=accountDao;
	}*/
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("AccountServiceImp1#doSomething...");
		accountDao.addAccount();
	}

}
