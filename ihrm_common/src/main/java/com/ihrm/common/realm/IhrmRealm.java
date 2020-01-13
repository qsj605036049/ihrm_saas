package com.ihrm.common.realm;

import com.ihrm.domain.result.ProfileResult;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.authz.permission.RolePermissionResolver;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Map;
import java.util.Set;

/**
 * 公共realm 用于各个模块获取授权信息
 * @author qinshiji
 * @date 2020/1/10 15:34
 */
public class IhrmRealm extends AuthorizingRealm {
    @Override
    public void setName(String name) {
        super.setName("ihrmRealm");
    }

    /**
     * 获取授权信息
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        1.获取安全数据
        ProfileResult profileResult = (ProfileResult) principalCollection.getPrimaryPrincipal();
//        2.获取权限列表
        Map<String, Object> permissions = profileResult.getPermissions();
        Set<String> apis = (Set<String>) permissions.get("apis");
//        3.构造权限数据返回值
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setStringPermissions(apis);
        return simpleAuthorizationInfo;
    }

    /**
     * 获取认证信息
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
