package com.ihrm.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "pe_user")
public class PeUser {
    private String id;
    private String mobile;
    private String username;
    private String password;
    private String role;
    private Integer enableState;
    private Timestamp createTime;
    private String departmentId;
    private Timestamp timeOfEntry;
    private Integer formOfEmployment;
    private String workNumber;
    private String formOfManagement;
    private String workingCity;
    private Timestamp correctionTime;
    private Integer inServiceStatus;
    private String companyId;
    private String companyName;
    private String departmentName;
    private String roleIds;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "enable_state")
    public Integer getEnableState() {
        return enableState;
    }

    public void setEnableState(Integer enableState) {
        this.enableState = enableState;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "department_id")
    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "time_of_entry")
    public Timestamp getTimeOfEntry() {
        return timeOfEntry;
    }

    public void setTimeOfEntry(Timestamp timeOfEntry) {
        this.timeOfEntry = timeOfEntry;
    }

    @Basic
    @Column(name = "form_of_employment")
    public Integer getFormOfEmployment() {
        return formOfEmployment;
    }

    public void setFormOfEmployment(Integer formOfEmployment) {
        this.formOfEmployment = formOfEmployment;
    }

    @Basic
    @Column(name = "work_number")
    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    @Basic
    @Column(name = "form_of_management")
    public String getFormOfManagement() {
        return formOfManagement;
    }

    public void setFormOfManagement(String formOfManagement) {
        this.formOfManagement = formOfManagement;
    }

    @Basic
    @Column(name = "working_city")
    public String getWorkingCity() {
        return workingCity;
    }

    public void setWorkingCity(String workingCity) {
        this.workingCity = workingCity;
    }

    @Basic
    @Column(name = "correction_time")
    public Timestamp getCorrectionTime() {
        return correctionTime;
    }

    public void setCorrectionTime(Timestamp correctionTime) {
        this.correctionTime = correctionTime;
    }

    @Basic
    @Column(name = "in_service_status")
    public Integer getInServiceStatus() {
        return inServiceStatus;
    }

    public void setInServiceStatus(Integer inServiceStatus) {
        this.inServiceStatus = inServiceStatus;
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
    @Column(name = "company_name")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Basic
    @Column(name = "department_name")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Basic
    @Column(name = "role_ids")
    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeUser peUser = (PeUser) o;
        return Objects.equals(id, peUser.id) &&
                Objects.equals(mobile, peUser.mobile) &&
                Objects.equals(username, peUser.username) &&
                Objects.equals(password, peUser.password) &&
                Objects.equals(role, peUser.role) &&
                Objects.equals(enableState, peUser.enableState) &&
                Objects.equals(createTime, peUser.createTime) &&
                Objects.equals(departmentId, peUser.departmentId) &&
                Objects.equals(timeOfEntry, peUser.timeOfEntry) &&
                Objects.equals(formOfEmployment, peUser.formOfEmployment) &&
                Objects.equals(workNumber, peUser.workNumber) &&
                Objects.equals(formOfManagement, peUser.formOfManagement) &&
                Objects.equals(workingCity, peUser.workingCity) &&
                Objects.equals(correctionTime, peUser.correctionTime) &&
                Objects.equals(inServiceStatus, peUser.inServiceStatus) &&
                Objects.equals(companyId, peUser.companyId) &&
                Objects.equals(companyName, peUser.companyName) &&
                Objects.equals(departmentName, peUser.departmentName) &&
                Objects.equals(roleIds, peUser.roleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mobile, username, password, role, enableState, createTime, departmentId, timeOfEntry, formOfEmployment, workNumber, formOfManagement, workingCity, correctionTime, inServiceStatus, companyId, companyName, departmentName, roleIds);
    }
}
