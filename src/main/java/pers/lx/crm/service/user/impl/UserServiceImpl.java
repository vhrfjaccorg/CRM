package pers.lx.crm.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.lx.crm.dao.user.UserDao;
import pers.lx.crm.entiy.user.User;
import pers.lx.crm.service.user.UserService;

/**
 * Created by lxl on 2017/2/10.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao ;

    @Override
    public User getUserByUsername(String username) {
        return userDao.selectByUsername(username);
    }

}
