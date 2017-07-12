package com.nju.qrs.service;

import com.nju.qrs.model.Role;

import java.util.List;

/**
 * Created by qingrongshan on 17/5/18.
 */
public interface RoleService {
    public List<Role> findAll();

    public Role getRoleById(int roleId);
}
