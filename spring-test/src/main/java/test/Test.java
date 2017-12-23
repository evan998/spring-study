package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.conf.BeanConfiguration;


import com.service.AccountService;
import com.service.UserService;

public class Test {
	@org.junit.Test
	public void testByXML() throws Exception {
		ApplicationContext applicationContext=new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/applicationContext.xml");
		AccountService accountService=(AccountService)applicationContext.getBean("accountService");
		accountService.doSomething();
	}
	//@org.junit.Test
	public void testByConfigurationAnnotation() throws Exception{
		AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(BeanConfiguration.class);
	    //名称必须BeanConfiguration中工程方法名称一致
	    AccountService accountService= (AccountService) config.getBean("accountService");
	    accountService.doSomething();
	}
	//@org.junit.Test
	public void test3()  {
		ApplicationContext applicationContext=new
				FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/applicationContext.xml");
	    UserService userService= (UserService) applicationContext.getBean("userService");
	    userService.done();
	}
}
