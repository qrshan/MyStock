package com.nju.qrs.mapper;

import com.nju.qrs.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by qingrongshan on 17/5/18.
 */
@Repository
public interface UserMapper extends BaseMapper<Integer,User> {
    public User findBySsoId(String ssoId);
}
