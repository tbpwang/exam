package edu.cumtb.service.impl;

import edu.cumtb.dao.GenericDao;
import edu.cumtb.model.User;
import edu.cumtb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Administrator
 * Created by tbpwang
 * 2016/8/3.
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {
    @Override
    public User login(User user) {
        List<User> users = super.genericDao.query("user.login", user);
        return null;
    }

    @Override
    @Autowired
    void setGenericDao(GenericDao<User, Integer> genericDao) {
        super.genericDao =genericDao;
    }
}
