package com.ihrm.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "pe_permission_api")
public class PePermissionApi {
    private String id;
    private String apiLevel;
    private String apiMethod;
    private String apiUrl;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "api_level")
    public String getApiLevel() {
        return apiLevel;
    }

    public void setApiLevel(String apiLevel) {
        this.apiLevel = apiLevel;
    }

    @Basic
    @Column(name = "api_method")
    public String getApiMethod() {
        return apiMethod;
    }

    public void setApiMethod(String apiMethod) {
        this.apiMethod = apiMethod;
    }

    @Basic
    @Column(name = "api_url")
    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PePermissionApi that = (PePermissionApi) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(apiLevel, that.apiLevel) &&
                Objects.equals(apiMethod, that.apiMethod) &&
                Objects.equals(apiUrl, that.apiUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apiLevel, apiMethod, apiUrl);
    }
}
