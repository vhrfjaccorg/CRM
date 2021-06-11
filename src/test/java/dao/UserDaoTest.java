package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.lx.crm.dao.user.UserDao;
import pers.lx.crm.entiy.user.User;

import java.awt.*;

/**
 * Created by lxl on 2017/2/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao ;


    public void insert(){

        User user = new User() ;

        user.setUsername("lx");
        user.setPassword("123");

        userDao.insertUser(user);

    }

    public void select(){

        User user = userDao.selectByUsername("lx") ;

        System.out.print(user.getPassword());

    }


}
