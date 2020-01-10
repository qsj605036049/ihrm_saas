package com.ihrm.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:53
 */
@Entity
@Table(name = "co_company")
public class CoCompany {
    private String id;
    private String name;
    private String managerId;
    private String version;
    private Timestamp renewalDate;
    private Timestamp expirationDate;
    private String companyArea;
    private String companyAddress;
    private String businessLicenseId;
    private String legalRepresentative;
    private String companyPhone;
    private String mailbox;
    private String companySize;
    private String industry;
    private String remarks;
    private String auditState;
    private Byte state;
    private Double balance;
    private Timestamp createTime;

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
    @Column(name = "manager_id")
    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "renewal_date")
    public Timestamp getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Timestamp renewalDate) {
        this.renewalDate = renewalDate;
    }

    @Basic
    @Column(name = "expiration_date")
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Basic
    @Column(name = "company_area")
    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }

    @Basic
    @Column(name = "company_address")
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Basic
    @Column(name = "business_license_id")
    public String getBusinessLicenseId() {
        return businessLicenseId;
    }

    public void setBusinessLicenseId(String businessLicenseId) {
        this.businessLicenseId = businessLicenseId;
    }

    @Basic
    @Column(name = "legal_representative")
    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    @Basic
    @Column(name = "company_phone")
    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    @Basic
    @Column(name = "mailbox")
    public String getMailbox() {
        return mailbox;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    @Basic
    @Column(name = "company_size")
    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    @Basic
    @Column(name = "industry")
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "audit_state")
    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    @Basic
    @Column(name = "state")
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "balance")
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoCompany coCompany = (CoCompany) o;
        return Objects.equals(id, coCompany.id) &&
                Objects.equals(name, coCompany.name) &&
                Objects.equals(managerId, coCompany.managerId) &&
                Objects.equals(version, coCompany.version) &&
                Objects.equals(renewalDate, coCompany.renewalDate) &&
                Objects.equals(expirationDate, coCompany.expirationDate) &&
                Objects.equals(companyArea, coCompany.companyArea) &&
                Objects.equals(companyAddress, coCompany.companyAddress) &&
                Objects.equals(businessLicenseId, coCompany.businessLicenseId) &&
                Objects.equals(legalRepresentative, coCompany.legalRepresentative) &&
                Objects.equals(companyPhone, coCompany.companyPhone) &&
                Objects.equals(mailbox, coCompany.mailbox) &&
                Objects.equals(companySize, coCompany.companySize) &&
                Objects.equals(industry, coCompany.industry) &&
                Objects.equals(remarks, coCompany.remarks) &&
                Objects.equals(auditState, coCompany.auditState) &&
                Objects.equals(state, coCompany.state) &&
                Objects.equals(balance, coCompany.balance) &&
                Objects.equals(createTime, coCompany.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, managerId, version, renewalDate, expirationDate, companyArea, companyAddress, businessLicenseId, legalRepresentative, companyPhone, mailbox, companySize, industry, remarks, auditState, state, balance, createTime);
    }
}
