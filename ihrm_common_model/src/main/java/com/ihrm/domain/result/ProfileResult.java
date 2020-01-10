package com.ihrm.domain.result;

import com.ihrm.domain.BsUser;
import com.ihrm.domain.PePermission;
import com.ihrm.domain.PeRole;
import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用户登录安全数据
 *
 * @author qinshiji
 * @date 2020/1/10 16:41
 */
@Data
public class ProfileResult implements Serializable {
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 用户名
     */
    private String username;
    /**
     * 公司
     */
    private String company;
    /**
     * 公司id
     */
    private String companyId;
    /**
     * 用户权限
     */
    private Map<String, Object> permissions;

    public ProfileResult(BsUser user,List<PePermission> pePermissions){
        this.mobile = user.getMobile();
        this.company = user.getCompanyName();
        this.companyId = user.getCompanyId();
//        菜单权限集合
        Set<String> menus = new HashSet<>();
//        功能权限集合
        Set<String> points = new HashSet<>();
//        api权限集合
        Set<String> apis = new HashSet<>();
        List<PeRole> roles = user.getRoles();
            for (PePermission pePermission :pePermissions) {
                String code = pePermission.getCode();
                switch (code) {
                    case "1":
                        menus.add(code);
                        break;
                    case "2":
                        points.add(code);
                        break;
                    case "3":
                        apis.add(code);
                        break;
                    default:
                }
            }
        this.permissions.put("menus",menus);
        this.permissions.put("points",points);
        this.permissions.put("apis",apis);
    }

    public ProfileResult(BsUser user) {
        this.mobile = user.getMobile();
        this.company = user.getCompanyName();
        this.companyId = user.getCompanyId();
//        菜单权限集合
        Set<String> menus = new HashSet<>();
//        功能权限集合
        Set<String> points = new HashSet<>();
//        api权限集合
        Set<String> apis = new HashSet<>();
        List<PeRole> roles = user.getRoles();
        for (PeRole role : roles) {
            List<PePermission> permissionList = role.getPermissions();
            for (PePermission pePermission : permissionList) {
                String code = pePermission.getCode();
                switch (code) {
                    case "1":
                        menus.add(code);
                        break;
                    case "2":
                        points.add(code);
                        break;
                    case "3":
                        apis.add(code);
                        break;
                    default:
                }
            }
        }
        this.permissions.put("menus",menus);
        this.permissions.put("points",points);
        this.permissions.put("apis",apis);
    }

}
