package com.nju.qrs.util;

import com.nju.qrs.model.Role;
import com.nju.qrs.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by qingrongshan on 17/5/25.
 */
@Component("stringToRoleConverter")
public class StringToRoleConverter implements Converter<String, Role> {

    @Autowired
    private RoleService roleService;

    @Override
    public Role convert(String roleId) {
        Role role = roleService.getRoleById(Integer.valueOf(roleId));
        return role;
    }

}
