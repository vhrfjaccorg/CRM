package pers.lx.crm.base.common.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import pers.lx.crm.entiy.user.User;
import pers.lx.crm.service.user.UserService;

/**
 * Created by lxl on 2017/2/9.
 */
public class CRMRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService ;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        User user = userService.getUserByUsername(((UsernamePasswordToken) token).getUsername()) ;

        return new SimpleAuthenticationInfo(token.getPrincipal(),token.getCredentials(),this.getName());
    }
}
