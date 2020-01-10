package com.ihrm.system.dao;

import com.ihrm.domain.BsUser;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author qinshiji
 * @date 2020/1/10 16:32
 */
public interface UserDao extends JpaRepository<BsUser,String>, Specification<BsUser> {
    /**
     * 根据手机号查询用户
     * @param mobile
     * @return
     */
    public BsUser findBsUserByMobile(String mobile);
}
