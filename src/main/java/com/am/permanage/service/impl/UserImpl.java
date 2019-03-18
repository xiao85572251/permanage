package com.am.permanage.service.impl;


import com.am.permanage.bean.User;
import com.am.permanage.dao.UserDao;
import com.am.permanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> AllUser() {

        return userDao.AllUser();
    }

    @Override
    public int Update(User user) {
        return userDao.Update(user);
    }
}

