package pers.lx.crm.controller.login;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import pers.lx.crm.base.common.pigeon.Result;
import pers.lx.crm.base.constant.ErrorConstant;
import pers.lx.crm.controller.BaseController;
import pers.lx.crm.entiy.user.User;
import pers.lx.crm.service.user.UserService;

/**
 * Created by lxl on 2017/2/9.
 */
@Controller
public class LoginController extends BaseController {

    @Autowired
    private UserService userService ;

    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    public @ResponseBody
    Result login(User user, Boolean remember){

        Result result = new Result() ;

        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword()) ;

        Subject subject = SecurityUtils.getSubject() ;

        result.addParam("yes", remember); ;

        try {

            subject.login(token);

        }catch (Exception e){

            result.setError(ErrorConstant.LOGIN_FAILED);
            return result;

        }

        return result ;

    }


}
