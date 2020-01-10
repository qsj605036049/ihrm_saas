package com.ihrm.system.config.realm;

import com.ihrm.common.realm.IhrmRealm;
import com.ihrm.domain.BsUser;
import com.ihrm.domain.PePermission;
import com.ihrm.domain.result.ProfileResult;
import com.ihrm.system.service.PermissionService;
import com.ihrm.system.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户认证信息数据源
 * @author qinshiji
 * @date 2020/1/10 15:47
 */
@Component
public class UserRealm extends IhrmRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private PermissionService permissionService;
    /**
     * 用于获取用户认证信息
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        1.获取登录认证信息
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        用户名为手机号
        String mobile = token.getUsername();
//        获取登录密码
        String password = new String(token.getPassword());
        BsUser user = userService.findByMobile(mobile);
        if (user!=null&&password.equals(user.getPassword())){
            String level = user.getLevel();
            ProfileResult profileResult = null;
            if ("coAdmin".equals(level)){
//                登录用户为管理员则赋予所有权限
                Map<String,Object> map = new HashMap<>();
                map.put("enVisible","1");
                List<PePermission> permissions = permissionService.findAll(map);
                profileResult = new ProfileResult(user,permissions);

            }else {
                //            构造安全数据
                 profileResult = new ProfileResult(user);
            }
            /*
            * 构造方法参数
            * 1.安全数据 2.密码 3.realm域名
            * * */
            return new SimpleAuthenticationInfo(profileResult,password,this.getName());
        }


        return super.doGetAuthenticationInfo(authenticationToken);
    }
}
