package com.nju.qrs.service.impl;

import com.nju.qrs.mapper.RoleMapper;
import com.nju.qrs.mapper.UserMapper;
import com.nju.qrs.model.Role;
import com.nju.qrs.model.User;
import com.nju.qrs.model.UserRoleRel;
import com.nju.qrs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qingrongshan on 17/5/18.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public User findById(int id) {
        User user = userMapper.getEntityByKey(id);
        return user;
    }

    @Override
    public User findBySsoId(String ssoId) {
        User user = userMapper.findBySsoId(ssoId);
        return user;
    }

    @Override
    public User save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userMapper.createEntity(user);
        List<Role> roleList = user.getRoleList();
        List<UserRoleRel> userRoleRelList = new ArrayList<UserRoleRel>();
        for(Role role : roleList){
            UserRoleRel userRoleRel = new UserRoleRel();
            userRoleRel.setRoleId(role.getId());
            userRoleRel.setUserId(user.getId());
            userRoleRel.setId(role.getId());
            userRoleRel.setRoleType(role.getRoleType());
            userRoleRelList.add(userRoleRel);
        }
        roleMapper.batchInsertRole(userRoleRelList);
        return user;
    }
}
