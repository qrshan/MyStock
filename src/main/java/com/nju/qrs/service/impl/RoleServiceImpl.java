package com.nju.qrs.service.impl;

import com.nju.qrs.mapper.RoleMapper;
import com.nju.qrs.model.Role;
import com.nju.qrs.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qingrongshan on 17/5/18.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public Role getRoleById(int roleId) {
        return roleMapper.getEntityByKey(roleId);
    }
}
