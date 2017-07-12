package com.nju.qrs.model;

/**
 * Created by qingrongshan on 17/5/18.
 */
public class UserRoleRel extends Role {
    private static final long serialVersionUID = 1L;

    private int userId;

    private int roleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
