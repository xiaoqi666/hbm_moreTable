package com.xiaoqi.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "sys_user", schema = "xiaoqi")
public class SysUserEntity {
    private long userId;
    private String userCode;
    private String userName;
    private String userPassword;
    private String userState;
    //表达多对多
    private Set<SysRole> roles = new HashSet<>();

    public Set<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<SysRole> roles) {
        this.roles = roles;
    }

    @Id
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_code", nullable = false, length = 32)
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 64)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_password", nullable = false, length = 32)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_state", nullable = false, length = 1)
    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserEntity that = (SysUserEntity) o;
        return userId == that.userId &&
                Objects.equals(userCode, that.userCode) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userPassword, that.userPassword) &&
                Objects.equals(userState, that.userState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userCode, userName, userPassword, userState);
    }
}
