package pers.lx.crm.dao.user;

import org.springframework.stereotype.Repository;
import pers.lx.crm.entiy.user.User;

/**
 * Created by lxl on 2017/2/10.
 */
@Repository
public interface UserDao {

    public User selectByUsername(String username) ;

    public void deleteUserByUId(int id) ;

    public void updateUser(User user) ;

    public void addUser(User user) ;

}
