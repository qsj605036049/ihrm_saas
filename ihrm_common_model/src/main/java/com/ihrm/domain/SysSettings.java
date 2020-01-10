package com.ihrm.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "sys_settings")
public class SysSettings {
    private String companyId;
    private int settingsType;
    private String settingsInfo;

    @Id
    @Column(name = "company_id")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "settings_type")
    public int getSettingsType() {
        return settingsType;
    }

    public void setSettingsType(int settingsType) {
        this.settingsType = settingsType;
    }

    @Basic
    @Column(name = "settings_info")
    public String getSettingsInfo() {
        return settingsInfo;
    }

    public void setSettingsInfo(String settingsInfo) {
        this.settingsInfo = settingsInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysSettings that = (SysSettings) o;
        return settingsType == that.settingsType &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(settingsInfo, that.settingsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, settingsType, settingsInfo);
    }
}
