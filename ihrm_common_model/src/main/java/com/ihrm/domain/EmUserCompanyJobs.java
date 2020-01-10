package com.ihrm.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "em_user_company_jobs")
public class EmUserCompanyJobs {
    private String userId;
    private String companyId;
    private String post;
    private String workMailbox;
    private String rank;
    private String correctionEvaluation;
    private String reportId;
    private String reportName;
    private String stateOfCorrection;
    private String hrbp;
    private String workingTimeForTheFirstTime;
    private Integer adjustmentAgedays;
    private Integer adjustmentOfLengthOfService;
    private String workingCity;
    private String taxableCity;
    private String currentContractStartTime;
    private String closingTimeOfCurrentContract;
    private String initialContractStartTime;
    private String firstContractTerminationTime;
    private String contractPeriod;
    private String contractDocuments;
    private Integer renewalNumber;
    private String otherRecruitmentChannels;
    private String recruitmentChannels;
    private String socialRecruitment;
    private String recommenderBusinessPeople;

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
    @Column(name = "post")
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Basic
    @Column(name = "work_mailbox")
    public String getWorkMailbox() {
        return workMailbox;
    }

    public void setWorkMailbox(String workMailbox) {
        this.workMailbox = workMailbox;
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
    @Column(name = "correction_evaluation")
    public String getCorrectionEvaluation() {
        return correctionEvaluation;
    }

    public void setCorrectionEvaluation(String correctionEvaluation) {
        this.correctionEvaluation = correctionEvaluation;
    }

    @Basic
    @Column(name = "report_id")
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    @Basic
    @Column(name = "report_name")
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    @Basic
    @Column(name = "state_of_correction")
    public String getStateOfCorrection() {
        return stateOfCorrection;
    }

    public void setStateOfCorrection(String stateOfCorrection) {
        this.stateOfCorrection = stateOfCorrection;
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
    @Column(name = "working_time_for_the_first_time")
    public String getWorkingTimeForTheFirstTime() {
        return workingTimeForTheFirstTime;
    }

    public void setWorkingTimeForTheFirstTime(String workingTimeForTheFirstTime) {
        this.workingTimeForTheFirstTime = workingTimeForTheFirstTime;
    }

    @Basic
    @Column(name = "adjustment_agedays")
    public Integer getAdjustmentAgedays() {
        return adjustmentAgedays;
    }

    public void setAdjustmentAgedays(Integer adjustmentAgedays) {
        this.adjustmentAgedays = adjustmentAgedays;
    }

    @Basic
    @Column(name = "adjustment_of_length_of_service")
    public Integer getAdjustmentOfLengthOfService() {
        return adjustmentOfLengthOfService;
    }

    public void setAdjustmentOfLengthOfService(Integer adjustmentOfLengthOfService) {
        this.adjustmentOfLengthOfService = adjustmentOfLengthOfService;
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
    @Column(name = "contract_documents")
    public String getContractDocuments() {
        return contractDocuments;
    }

    public void setContractDocuments(String contractDocuments) {
        this.contractDocuments = contractDocuments;
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
    @Column(name = "other_recruitment_channels")
    public String getOtherRecruitmentChannels() {
        return otherRecruitmentChannels;
    }

    public void setOtherRecruitmentChannels(String otherRecruitmentChannels) {
        this.otherRecruitmentChannels = otherRecruitmentChannels;
    }

    @Basic
    @Column(name = "recruitment_channels")
    public String getRecruitmentChannels() {
        return recruitmentChannels;
    }

    public void setRecruitmentChannels(String recruitmentChannels) {
        this.recruitmentChannels = recruitmentChannels;
    }

    @Basic
    @Column(name = "social_recruitment")
    public String getSocialRecruitment() {
        return socialRecruitment;
    }

    public void setSocialRecruitment(String socialRecruitment) {
        this.socialRecruitment = socialRecruitment;
    }

    @Basic
    @Column(name = "recommender_business_people")
    public String getRecommenderBusinessPeople() {
        return recommenderBusinessPeople;
    }

    public void setRecommenderBusinessPeople(String recommenderBusinessPeople) {
        this.recommenderBusinessPeople = recommenderBusinessPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmUserCompanyJobs that = (EmUserCompanyJobs) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(post, that.post) &&
                Objects.equals(workMailbox, that.workMailbox) &&
                Objects.equals(rank, that.rank) &&
                Objects.equals(correctionEvaluation, that.correctionEvaluation) &&
                Objects.equals(reportId, that.reportId) &&
                Objects.equals(reportName, that.reportName) &&
                Objects.equals(stateOfCorrection, that.stateOfCorrection) &&
                Objects.equals(hrbp, that.hrbp) &&
                Objects.equals(workingTimeForTheFirstTime, that.workingTimeForTheFirstTime) &&
                Objects.equals(adjustmentAgedays, that.adjustmentAgedays) &&
                Objects.equals(adjustmentOfLengthOfService, that.adjustmentOfLengthOfService) &&
                Objects.equals(workingCity, that.workingCity) &&
                Objects.equals(taxableCity, that.taxableCity) &&
                Objects.equals(currentContractStartTime, that.currentContractStartTime) &&
                Objects.equals(closingTimeOfCurrentContract, that.closingTimeOfCurrentContract) &&
                Objects.equals(initialContractStartTime, that.initialContractStartTime) &&
                Objects.equals(firstContractTerminationTime, that.firstContractTerminationTime) &&
                Objects.equals(contractPeriod, that.contractPeriod) &&
                Objects.equals(contractDocuments, that.contractDocuments) &&
                Objects.equals(renewalNumber, that.renewalNumber) &&
                Objects.equals(otherRecruitmentChannels, that.otherRecruitmentChannels) &&
                Objects.equals(recruitmentChannels, that.recruitmentChannels) &&
                Objects.equals(socialRecruitment, that.socialRecruitment) &&
                Objects.equals(recommenderBusinessPeople, that.recommenderBusinessPeople);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, companyId, post, workMailbox, rank, correctionEvaluation, reportId, reportName, stateOfCorrection, hrbp, workingTimeForTheFirstTime, adjustmentAgedays, adjustmentOfLengthOfService, workingCity, taxableCity, currentContractStartTime, closingTimeOfCurrentContract, initialContractStartTime, firstContractTerminationTime, contractPeriod, contractDocuments, renewalNumber, otherRecruitmentChannels, recruitmentChannels, socialRecruitment, recommenderBusinessPeople);
    }
}
