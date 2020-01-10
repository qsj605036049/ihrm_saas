package com.ihrm.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:53
 */
@Entity
@Table(name = "bs_permission")
public class BsPermission {
    private String id;
    private String userId;
    private String companyId;
    private String administratorName;
    private String managementModule;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "company_id")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "administrator_name")
    public String getAdministratorName() {
        return administratorName;
    }

    public void setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
    }

    @Basic
    @Column(name = "management_module")
    public String getManagementModule() {
        return managementModule;
    }

    public void setManagementModule(String managementModule) {
        this.managementModule = managementModule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BsPermission that = (BsPermission) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(administratorName, that.administratorName) &&
                Objects.equals(managementModule, that.managementModule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, companyId, administratorName, managementModule);
    }
}
