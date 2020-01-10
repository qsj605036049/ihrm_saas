package com.ihrm.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:53
 */
@Entity
@Table(name = "em_archive")
public class EmArchive {
    private String id;
    private String opUser;
    private String month;
    private String companyId;
    private int totals;
    private int payrolls;
    private int departures;
    private String data;
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
    @Column(name = "op_user")
    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser;
    }

    @Basic
    @Column(name = "month")
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
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
    @Column(name = "totals")
    public int getTotals() {
        return totals;
    }

    public void setTotals(int totals) {
        this.totals = totals;
    }

    @Basic
    @Column(name = "payrolls")
    public int getPayrolls() {
        return payrolls;
    }

    public void setPayrolls(int payrolls) {
        this.payrolls = payrolls;
    }

    @Basic
    @Column(name = "departures")
    public int getDepartures() {
        return departures;
    }

    public void setDepartures(int departures) {
        this.departures = departures;
    }

    @Basic
    @Column(name = "data")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
        EmArchive emArchive = (EmArchive) o;
        return totals == emArchive.totals &&
                payrolls == emArchive.payrolls &&
                departures == emArchive.departures &&
                Objects.equals(id, emArchive.id) &&
                Objects.equals(opUser, emArchive.opUser) &&
                Objects.equals(month, emArchive.month) &&
                Objects.equals(companyId, emArchive.companyId) &&
                Objects.equals(data, emArchive.data) &&
                Objects.equals(createTime, emArchive.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, opUser, month, companyId, totals, payrolls, departures, data, createTime);
    }
}
