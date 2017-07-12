package com.nju.qrs.mapper;

import com.nju.qrs.model.Role;
import com.nju.qrs.model.UserRoleRel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by qingrongshan on 17/5/18.
 */
@Repository
public interface RoleMapper extends BaseMapper<Integer, Role> {
    public List<Role> findAll();

    public void batchInsertRole(List<UserRoleRel> roleList);
}
