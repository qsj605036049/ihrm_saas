package com.ihrm.system.config;

import com.ihrm.common.realm.IhrmRealm;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * shiro配置类
 * @author qinshiji
 * @date 2020/1/10 15:31
 */
@Configuration
public class ShiroConfiguration {
    /**
     * 1.创建realm
     * @return
     */
    @Bean
    public IhrmRealm ihrmRealm(){
        return new IhrmRealm();
    }
    /**
     * 2.创建安全管理器
     * @return
     */
    @Bean
    public SecurityManager securityManager(IhrmRealm ihrmRealm){
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        securityManager.setRealm(ihrmRealm);
        return securityManager;
    }
}
