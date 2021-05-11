package authorization.dao;

import base.authorization.User;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by lx on 2017/1/20.
 */
public interface UserDao {

    @Insert( "insert into user( username ,password ) values( #{username} , #{password} )" )
    public int insertUser(User user) ;

}
