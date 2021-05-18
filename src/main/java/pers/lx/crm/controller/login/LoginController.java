package pers.lx.crm.controller.login;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import pers.lx.crm.base.common.pigeon.Result;
import pers.lx.crm.controller.BaseController;

/**
 * Created by lxl on 2017/2/9.
 */
@Controller
public class LoginController extends BaseController {

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public @ResponseBody
    Result login(){

        Result result = new Result() ;

        UsernamePasswordToken token = new UsernamePasswordToken("lx","123") ;

        Subject user = SecurityUtils.getSubject() ;

        user.login(token);

        return result ;

    }


}
