package test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:spring-aspectj.xml")
public class UserDaoAspectJ {
	@Autowired
    UserDao userDao;

    @org.junit.Test
    public void aspectJTest(){
        userDao.addUser();
    }
}
