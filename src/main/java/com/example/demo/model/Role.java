package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * @ProjectName: Spring-Boot
 * @Package: com.example.demo.model
 * @ClassName: Roles
 * @Author: 860620058
 * @Description:
 * @Date: 2020/10/28 13:30
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;
}
