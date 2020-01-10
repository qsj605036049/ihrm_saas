package com.ihrm.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "pe_permission_menu")
public class PePermissionMenu {
    private String id;
    private String menuIcon;
    private String menuOrder;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "menu_icon")
    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    @Basic
    @Column(name = "menu_order")
    public String getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PePermissionMenu that = (PePermissionMenu) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(menuIcon, that.menuIcon) &&
                Objects.equals(menuOrder, that.menuOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, menuIcon, menuOrder);
    }
}
