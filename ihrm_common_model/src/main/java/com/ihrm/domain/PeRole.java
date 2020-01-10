package com.ihrm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "pe_role")
public class PeRole {
    private String id;
    private String name;
    private String description;
    private String companyId;
    /**
     * 角色对应的用户列表
     */
    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private List<BsUser> users;
    /**
     * 角色对应的权限列表
     */
    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "pe_role_permission",joinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "id")}
    ,inverseJoinColumns = {@JoinColumn(name = "permission_id",referencedColumnName = "id")})
    private List<PePermission> permissions;

    public List<BsUser> getUsers() {
        return users;
    }

    public void setUsers(List<BsUser> users) {
        this.users = users;
    }

    public List<PePermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PePermission> permissions) {
        this.permissions = permissions;
    }

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "company_id")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeRole peRole = (PeRole) o;
        return Objects.equals(id, peRole.id) &&
                Objects.equals(name, peRole.name) &&
                Objects.equals(description, peRole.description) &&
                Objects.equals(companyId, peRole.companyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, companyId);
    }
}
