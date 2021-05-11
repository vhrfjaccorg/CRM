package dao;

import authorization.dao.UserDao;
import base.authorization.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lx on 2017/1/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao ;

    @Test
    public void testInsertUser(){
        User user = new User() ;

        user.setUsername("lx");
        user.setPassword("123");

        userDao.insertUser(user) ;

    }

}
