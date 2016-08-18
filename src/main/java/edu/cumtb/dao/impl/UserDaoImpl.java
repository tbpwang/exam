package edu.cumtb.dao.impl;

import edu.cumtb.dao.UserDao;
import edu.cumtb.model.User;
import org.springframework.stereotype.Repository;

/**
 * Administrator
 * Created by tbpwang
 * 2016/8/3.
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {
}
