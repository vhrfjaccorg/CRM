package pers.lx.crm.dao.user;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import pers.lx.crm.entiy.user.User;

/**
 * Created by lxl on 2017/2/10.
 */
@Repository
public interface UserDao {

    @Select("select* from user where username=#{username}")
    public User selectByUsername(String username) ;

    public void deleteUserByUId(int id) ;

    @Update("update user set password=#{password} where id=#{id} or username=#{username}")
    public void updateUser(User user) ;

    @Insert("insert into user(username,password) values(#{username},#{password})")
    public void insertUser(User user) ;

}
