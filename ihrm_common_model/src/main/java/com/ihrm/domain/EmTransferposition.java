package com.ihrm.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:53
 */
@Entity
@Table(name = "em_transferposition")
public class EmTransferposition {
    private String userId;
    private String post;
    private String rank;
    private String reportingObject;
    private String hrbp;
    private Timestamp adjustmentTime;
    private String causeOfAdjustingPost;
    private String enclosure;
    private String formOfManagement;
    private String workingCity;
    private String taxableCity;
    private String currentContractStartTime;
    private String closingTimeOfCurrentContract;
    private String workingPlace;
    private String initialContractStartTime;
    private String firstContractTerminationTime;
    private String contractPeriod;
    private Integer renewalNumber;
    private String recommenderBusinessPeople;
    private int estatus;
    private Timestamp createTime;

    @Id
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "post")
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Basic
    @Column(name = "rank")
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "reporting_object")
    public String getReportingObject() {
        return reportingObject;
    }

    public void setReportingObject(String reportingObject) {
        this.reportingObject = reportingObject;
    }

    @Basic
    @Column(name = "hrbp")
    public String getHrbp() {
        return hrbp;
    }

    public void setHrbp(String hrbp) {
        this.hrbp = hrbp;
    }

    @Basic
    @Column(name = "adjustment_time")
    public Timestamp getAdjustmentTime() {
        return adjustmentTime;
    }

    public void setAdjustmentTime(Timestamp adjustmentTime) {
        this.adjustmentTime = adjustmentTime;
    }

    @Basic
    @Column(name = "cause_of_adjusting_post")
    public String getCauseOfAdjustingPost() {
        return causeOfAdjustingPost;
    }

    public void setCauseOfAdjustingPost(String causeOfAdjustingPost) {
        this.causeOfAdjustingPost = causeOfAdjustingPost;
    }

    @Basic
    @Column(name = "enclosure")
    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
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
    @Column(name = "taxable_city")
    public String getTaxableCity() {
        return taxableCity;
    }

    public void setTaxableCity(String taxableCity) {
        this.taxableCity = taxableCity;
    }

    @Basic
    @Column(name = "current_contract_start_time")
    public String getCurrentContractStartTime() {
        return currentContractStartTime;
    }

    public void setCurrentContractStartTime(String currentContractStartTime) {
        this.currentContractStartTime = currentContractStartTime;
    }

    @Basic
    @Column(name = "closing_time_of_current_contract")
    public String getClosingTimeOfCurrentContract() {
        return closingTimeOfCurrentContract;
    }

    public void setClosingTimeOfCurrentContract(String closingTimeOfCurrentContract) {
        this.closingTimeOfCurrentContract = closingTimeOfCurrentContract;
    }

    @Basic
    @Column(name = "working_place")
    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    @Basic
    @Column(name = "initial_contract_start_time")
    public String getInitialContractStartTime() {
        return initialContractStartTime;
    }

    public void setInitialContractStartTime(String initialContractStartTime) {
        this.initialContractStartTime = initialContractStartTime;
    }

    @Basic
    @Column(name = "first_contract_termination_time")
    public String getFirstContractTerminationTime() {
        return firstContractTerminationTime;
    }

    public void setFirstContractTerminationTime(String firstContractTerminationTime) {
        this.firstContractTerminationTime = firstContractTerminationTime;
    }

    @Basic
    @Column(name = "contract_period")
    public String getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(String contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    @Basic
    @Column(name = "renewal_number")
    public Integer getRenewalNumber() {
        return renewalNumber;
    }

    public void setRenewalNumber(Integer renewalNumber) {
        this.renewalNumber = renewalNumber;
    }

    @Basic
    @Column(name = "recommender_business_people")
    public String getRecommenderBusinessPeople() {
        return recommenderBusinessPeople;
    }

    public void setRecommenderBusinessPeople(String recommenderBusinessPeople) {
        this.recommenderBusinessPeople = recommenderBusinessPeople;
    }

    @Basic
    @Column(name = "estatus")
    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
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
        EmTransferposition that = (EmTransferposition) o;
        return estatus == that.estatus &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(post, that.post) &&
                Objects.equals(rank, that.rank) &&
                Objects.equals(reportingObject, that.reportingObject) &&
                Objects.equals(hrbp, that.hrbp) &&
                Objects.equals(adjustmentTime, that.adjustmentTime) &&
                Objects.equals(causeOfAdjustingPost, that.causeOfAdjustingPost) &&
                Objects.equals(enclosure, that.enclosure) &&
                Objects.equals(formOfManagement, that.formOfManagement) &&
                Objects.equals(workingCity, that.workingCity) &&
                Objects.equals(taxableCity, that.taxableCity) &&
                Objects.equals(currentContractStartTime, that.currentContractStartTime) &&
                Objects.equals(closingTimeOfCurrentContract, that.closingTimeOfCurrentContract) &&
                Objects.equals(workingPlace, that.workingPlace) &&
                Objects.equals(initialContractStartTime, that.initialContractStartTime) &&
                Objects.equals(firstContractTerminationTime, that.firstContractTerminationTime) &&
                Objects.equals(contractPeriod, that.contractPeriod) &&
                Objects.equals(renewalNumber, that.renewalNumber) &&
                Objects.equals(recommenderBusinessPeople, that.recommenderBusinessPeople) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, post, rank, reportingObject, hrbp, adjustmentTime, causeOfAdjustingPost, enclosure, formOfManagement, workingCity, taxableCity, currentContractStartTime, closingTimeOfCurrentContract, workingPlace, initialContractStartTime, firstContractTerminationTime, contractPeriod, renewalNumber, recommenderBusinessPeople, estatus, createTime);
    }
}
