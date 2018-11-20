package hcw.first.springboot.leaf.service.impl;

import hcw.first.springboot.leaf.entity.User;
import hcw.first.springboot.leaf.mapper.UserMapper;
import hcw.first.springboot.leaf.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Company: 道盟科技
 * @Author : hechengwen
 * @Time : 2018/10/26 10:17
 * @Desc :
 * @version:
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer uId) {
        logger.info("uID = {}", uId);
        return userMapper.getUserById(uId);
    }
}
