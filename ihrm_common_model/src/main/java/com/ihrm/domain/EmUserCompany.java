package com.ihrm.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:53
 */
@Entity
@Table(name = "em_user_company")
public class EmUserCompany {
    private String userId;
    private String companyId;
    private String departmentId;
    private Timestamp timeOfEntry;
    private String formOfEmployment;
    private String workNumber;
    private String formOfManagement;
    private String workingCity;
    private Timestamp correctionTime;
    private byte inServiceStatus;
    private byte state;

    @Id
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
    public String getFormOfEmployment() {
        return formOfEmployment;
    }

    public void setFormOfEmployment(String formOfEmployment) {
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
    public byte getInServiceStatus() {
        return inServiceStatus;
    }

    public void setInServiceStatus(byte inServiceStatus) {
        this.inServiceStatus = inServiceStatus;
    }

    @Basic
    @Column(name = "state")
    public byte getState() {
        return state;
    }

    public void setState(byte state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmUserCompany that = (EmUserCompany) o;
        return inServiceStatus == that.inServiceStatus &&
                state == that.state &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(departmentId, that.departmentId) &&
                Objects.equals(timeOfEntry, that.timeOfEntry) &&
                Objects.equals(formOfEmployment, that.formOfEmployment) &&
                Objects.equals(workNumber, that.workNumber) &&
                Objects.equals(formOfManagement, that.formOfManagement) &&
                Objects.equals(workingCity, that.workingCity) &&
                Objects.equals(correctionTime, that.correctionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, companyId, departmentId, timeOfEntry, formOfEmployment, workNumber, formOfManagement, workingCity, correctionTime, inServiceStatus, state);
    }
}
