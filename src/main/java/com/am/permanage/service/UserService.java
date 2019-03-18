package com.am.permanage.service;

import com.am.permanage.bean.User;

import java.util.List;

public interface UserService {

    public List<User> AllUser();

    public int Update(User user);

}
