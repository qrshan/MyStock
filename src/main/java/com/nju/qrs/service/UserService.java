package com.nju.qrs.service;

import com.nju.qrs.model.User;

/**
 * Created by qingrongshan on 17/5/18.
 */
public interface UserService {
    public User findById(int id);

    public User findBySsoId(String ssoId);

    public User save(User user);
}
