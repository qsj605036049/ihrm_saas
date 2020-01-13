package com.ihrm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:53
 */
@Entity
@Table(name = "bs_user")
public class BsUser {
    private String id;
    private String mobile;
    private String username;
    private String password;
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
    private String level;
    private String staffPhoto;
    /**
     * 用户所具有的角色
     */
    private List<PeRole> roles = new ArrayList<>();

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "pe_user_role", joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")}
            , inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
    public List<PeRole> getRoles() {
        return roles;
    }

    public void setRoles(List<PeRole> roles) {
        this.roles = roles;
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
    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "staff_photo")
    public String getStaffPhoto() {
        return staffPhoto;
    }

    public void setStaffPhoto(String staffPhoto) {
        this.staffPhoto = staffPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BsUser bsUser = (BsUser) o;
        return Objects.equals(id, bsUser.id) &&
                Objects.equals(mobile, bsUser.mobile) &&
                Objects.equals(username, bsUser.username) &&
                Objects.equals(password, bsUser.password) &&
                Objects.equals(enableState, bsUser.enableState) &&
                Objects.equals(createTime, bsUser.createTime) &&
                Objects.equals(departmentId, bsUser.departmentId) &&
                Objects.equals(timeOfEntry, bsUser.timeOfEntry) &&
                Objects.equals(formOfEmployment, bsUser.formOfEmployment) &&
                Objects.equals(workNumber, bsUser.workNumber) &&
                Objects.equals(formOfManagement, bsUser.formOfManagement) &&
                Objects.equals(workingCity, bsUser.workingCity) &&
                Objects.equals(correctionTime, bsUser.correctionTime) &&
                Objects.equals(inServiceStatus, bsUser.inServiceStatus) &&
                Objects.equals(companyId, bsUser.companyId) &&
                Objects.equals(companyName, bsUser.companyName) &&
                Objects.equals(departmentName, bsUser.departmentName) &&
                Objects.equals(level, bsUser.level) &&
                Objects.equals(staffPhoto, bsUser.staffPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mobile, username, password, enableState, createTime, departmentId, timeOfEntry, formOfEmployment, workNumber, formOfManagement, workingCity, correctionTime, inServiceStatus, companyId, companyName, departmentName, level, staffPhoto);
    }


}
