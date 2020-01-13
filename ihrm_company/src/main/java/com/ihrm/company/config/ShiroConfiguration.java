package com.ihrm.company.config;

import com.ihrm.common.realm.IhrmRealm;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.crazycake.shiro.RedisCacheManager;
import org.crazycake.shiro.RedisManager;
import org.crazycake.shiro.RedisSessionDAO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * shiro配置类
 *
 * @author qinshiji
 * @date 2020/1/10 15:31
 */
@Configuration
public class ShiroConfiguration {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.timeout}")
    private int timeout;

    @Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;

    @Value("${spring.redis.jedis.pool.max-wait}")
    private long maxWaitMillis;

    /**
     * 1.创建realm
     *
     * @return
     */
    @Bean
    public IhrmRealm ihrmRealm() {
        return new IhrmRealm();
    }

    /**
     * 2.创建安全管理器
     *
     * @return
     */
    @Bean
    public SecurityManager securityManager(IhrmRealm ihrmRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        1.设置realm
        securityManager.setRealm(ihrmRealm);
//        2.设置会话管理器
        securityManager.setSessionManager(sessionManager());
//        3.设置缓存管理器
        securityManager.setCacheManager(cacheManager());
        return securityManager;
    }

    /**
     * 3.shiro过滤器工厂整合spring
     *
     * @param securityManager
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
//        1.新建shiro过滤器工厂
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        2.配置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
//        3.通用配置
//            登录失败跳转页
        shiroFilterFactoryBean.setLoginUrl("/error/autherror?code=1");
//            未授权跳转页
        shiroFilterFactoryBean.setUnauthorizedUrl("/error/autherror?code=2");
//        4.路径拦截过滤集合
        Map<String, String> filterMap = new LinkedHashMap<>();
//            匿名访问
        filterMap.put("/system/login", "anon");
        filterMap.put("/error/autherror","anon");
//            认证之后访问
        filterMap.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }

    /**
     * 配置jedis连接池
     *
     * @return
     */
    @Bean
    public JedisPool jedisPool() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        return new JedisPool(jedisPoolConfig, host, port, timeout);
    }

    /**
     * 1.配置redis管理器
     *
     * @return
     */
    @Bean
    public RedisManager redisManager() {
        RedisManager redisManager = new RedisManager();
        redisManager.setJedisPool(jedisPool());
        return redisManager;
    }

    /**
     * 2.sessionDao
     *
     * @return
     */
    @Bean
    public RedisSessionDAO redisSessionDAO() {
        RedisSessionDAO redisSessionDAO = new RedisSessionDAO();
        redisSessionDAO.setRedisManager(redisManager());
        return redisSessionDAO;
    }

    /**
     * 3.配置会话管理器
     *
     * @return
     */
    @Bean
    public DefaultWebSessionManager sessionManager() {
//        1.创建会话管理
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
//        2.配置sessionDAO
        sessionManager.setSessionDAO(redisSessionDAO());
//        禁用cookie
//        sessionManager.setSessionIdCookieEnabled(false);
//        禁用url重写
//        sessionManager.setSessionIdUrlRewritingEnabled(false);
        return sessionManager;

    }

    /**
     * 4.配置缓存管理器
     *
     * @return
     */
    @Bean
    public CacheManager cacheManager() {
        RedisCacheManager redisCacheManager = new RedisCacheManager();
        redisCacheManager.setRedisManager(redisManager());
        return redisCacheManager;
    }
    /**
     * 开启shiro注解支持
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }
}
