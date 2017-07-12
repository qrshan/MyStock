package com.nju.qrs.model;

import com.nju.qrs.util.RoleType;

import java.io.Serializable;

/**
 * Created by qingrongshan on 17/5/18.
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;

    private RoleType roleType;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
