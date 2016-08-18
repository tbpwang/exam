package edu.cumtb.service;

import edu.cumtb.model.User;

/**
 * Administrator
 * Created by tbpwang
 * 2016/8/3.
 */
public interface UserService extends GenericService<User, Integer> {
    User login(User user);
}
