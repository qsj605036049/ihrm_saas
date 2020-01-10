package com.ihrm.system.dao;

import com.ihrm.domain.PePermission;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author qinshiji
 * @date 2020/1/10 17:01
 */
public interface PermissionDao extends JpaRepository<PePermission,String>, JpaSpecificationExecutor<PePermission> {

}
