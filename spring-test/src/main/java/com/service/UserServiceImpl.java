package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.dao.UserDao;


public class UserServiceImpl implements UserService{
	//需要注入的依赖
	@Autowired
	@Qualifier("userDao")
    private UserDao userDao;
	@Value("${jdbc.url}")
	private String url;
	@Value("#{configProperties['jdbc.username']}")
	private String userName;
    /**
     * set方法
     * @param userDao
     */
    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/
    /*public UserServiceImpl(UserDao userDao){
    	this.userDao=userDao;
    }*/
    @Override
    public void done(){
    	System.out.println("url="+url);
    	System.out.println("username="+userName);
        userDao.done();
    }
}
