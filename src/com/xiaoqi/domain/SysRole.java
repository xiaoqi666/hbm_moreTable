package com.xiaoqi.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "sys_role", schema = "xiaoqi")
public class SysRole {
    private long roleId;
    private String roleName;
    private String roleMemo;
    //表达多对多
    private Set<SysUserEntity> users = new HashSet<>();


    public Set<SysUserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<SysUserEntity> users) {
        this.users = users;
    }

    @Id
    @Column(name = "role_id", nullable = false)
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name", nullable = false, length = 32)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "role_memo", nullable = true, length = 128)
    public String getRoleMemo() {
        return roleMemo;
    }

    public void setRoleMemo(String roleMemo) {
        this.roleMemo = roleMemo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRole sysRole = (SysRole) o;
        return roleId == sysRole.roleId &&
                Objects.equals(roleName, sysRole.roleName) &&
                Objects.equals(roleMemo, sysRole.roleMemo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, roleMemo);
    }
}
