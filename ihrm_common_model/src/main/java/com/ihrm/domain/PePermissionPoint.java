package com.ihrm.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "pe_permission_point")
public class PePermissionPoint {
    private String id;
    private String pointClass;
    private String pointIcon;
    private Integer pointStatus;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "point_class")
    public String getPointClass() {
        return pointClass;
    }

    public void setPointClass(String pointClass) {
        this.pointClass = pointClass;
    }

    @Basic
    @Column(name = "point_icon")
    public String getPointIcon() {
        return pointIcon;
    }

    public void setPointIcon(String pointIcon) {
        this.pointIcon = pointIcon;
    }

    @Basic
    @Column(name = "point_status")
    public Integer getPointStatus() {
        return pointStatus;
    }

    public void setPointStatus(Integer pointStatus) {
        this.pointStatus = pointStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PePermissionPoint that = (PePermissionPoint) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(pointClass, that.pointClass) &&
                Objects.equals(pointIcon, that.pointIcon) &&
                Objects.equals(pointStatus, that.pointStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pointClass, pointIcon, pointStatus);
    }
}
