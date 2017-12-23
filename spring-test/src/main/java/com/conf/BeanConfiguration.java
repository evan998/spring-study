package com.conf;

import com.dao.AccountDao;
import com.dao.AccountDaoImpl;

public class BeanConfiguration {
	public AccountDao accountDao(){
		return new AccountDaoImpl();
	}
	/*public com.service.AccountService accountService(){
		com.service.AccountServiceImpl bean=new com.service.AccountServiceImpl();
		//注入dao
		bean.setAccountDao(accountDao());
		return bean;
	}*/
}
