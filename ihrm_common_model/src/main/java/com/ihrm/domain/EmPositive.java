package com.ihrm.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:53
 */
@Entity
@Table(name = "em_positive")
public class EmPositive {
    private String userId;
    private Timestamp dateOfCorrection;
    private String correctionEvaluation;
    private String enclosure;
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
    @Column(name = "date_of_correction")
    public Timestamp getDateOfCorrection() {
        return dateOfCorrection;
    }

    public void setDateOfCorrection(Timestamp dateOfCorrection) {
        this.dateOfCorrection = dateOfCorrection;
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
    @Column(name = "enclosure")
    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
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
        EmPositive that = (EmPositive) o;
        return estatus == that.estatus &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(dateOfCorrection, that.dateOfCorrection) &&
                Objects.equals(correctionEvaluation, that.correctionEvaluation) &&
                Objects.equals(enclosure, that.enclosure) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, dateOfCorrection, correctionEvaluation, enclosure, estatus, createTime);
    }
}
