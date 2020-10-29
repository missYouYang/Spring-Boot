package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ProjectName: Spring-Boot
 * @Package: com.example.demo.model
 * @ClassName: Permissions
 * @Author: 860620058
 * @Description:
 * @Date: 2020/10/28 13:30
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class Permissions {
    private String id;
    private String permissionsName;
}
