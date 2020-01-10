package com.ihrm.system.service;

import com.ihrm.domain.BsUser;
import com.ihrm.system.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 * @author qinshiji
 * @date 2020/1/10 16:33
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    
    public BsUser findByMobile(String mobile){
        return userDao.findBsUserByMobile(mobile);
    }
}
