package com.ihrm.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "pe_user_role")
@IdClass(PeUserRolePK.class)
public class PeUserRole {
    private String roleId;
    private String userId;

    @Id
    @Column(name = "role_id")
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeUserRole that = (PeUserRole) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, userId);
    }
}
