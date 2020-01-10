package com.ihrm.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:53
 */
@Entity
@Table(name = "em_resignation")
public class EmResignation {
    private String userId;
    private String resignationTime;
    private String typeOfTurnover;
    private String reasonsForLeaving;
    private String compensation;
    private String notifications;
    private String socialSecurityReductionMonth;
    private String providentFundReductionMonth;
    private String picture;
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
    @Column(name = "resignation_time")
    public String getResignationTime() {
        return resignationTime;
    }

    public void setResignationTime(String resignationTime) {
        this.resignationTime = resignationTime;
    }

    @Basic
    @Column(name = "type_of_turnover")
    public String getTypeOfTurnover() {
        return typeOfTurnover;
    }

    public void setTypeOfTurnover(String typeOfTurnover) {
        this.typeOfTurnover = typeOfTurnover;
    }

    @Basic
    @Column(name = "reasons_for_leaving")
    public String getReasonsForLeaving() {
        return reasonsForLeaving;
    }

    public void setReasonsForLeaving(String reasonsForLeaving) {
        this.reasonsForLeaving = reasonsForLeaving;
    }

    @Basic
    @Column(name = "compensation")
    public String getCompensation() {
        return compensation;
    }

    public void setCompensation(String compensation) {
        this.compensation = compensation;
    }

    @Basic
    @Column(name = "notifications")
    public String getNotifications() {
        return notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    @Basic
    @Column(name = "social_security_reduction_month")
    public String getSocialSecurityReductionMonth() {
        return socialSecurityReductionMonth;
    }

    public void setSocialSecurityReductionMonth(String socialSecurityReductionMonth) {
        this.socialSecurityReductionMonth = socialSecurityReductionMonth;
    }

    @Basic
    @Column(name = "provident_fund_reduction_month")
    public String getProvidentFundReductionMonth() {
        return providentFundReductionMonth;
    }

    public void setProvidentFundReductionMonth(String providentFundReductionMonth) {
        this.providentFundReductionMonth = providentFundReductionMonth;
    }

    @Basic
    @Column(name = "picture")
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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
        EmResignation that = (EmResignation) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(resignationTime, that.resignationTime) &&
                Objects.equals(typeOfTurnover, that.typeOfTurnover) &&
                Objects.equals(reasonsForLeaving, that.reasonsForLeaving) &&
                Objects.equals(compensation, that.compensation) &&
                Objects.equals(notifications, that.notifications) &&
                Objects.equals(socialSecurityReductionMonth, that.socialSecurityReductionMonth) &&
                Objects.equals(providentFundReductionMonth, that.providentFundReductionMonth) &&
                Objects.equals(picture, that.picture) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, resignationTime, typeOfTurnover, reasonsForLeaving, compensation, notifications, socialSecurityReductionMonth, providentFundReductionMonth, picture, createTime);
    }
}
