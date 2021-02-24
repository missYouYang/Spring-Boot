package com.example.demo.serviceImpl;

import com.example.demo.model.Permissions;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ProjectName: Spring-Boot
 * @Package: com.example.demo.serviceImpl
 * @ClassName: LoginServiceImpl
 * @Author: 860620058
 * @Description:
 * @Date: 2020/10/28 13:32
 * @Version: 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public User getUserByName(String getMapByName) {
        return getMapByName(getMapByName);
    }


    private void aaa(){

    }

    /**
     * 模拟数据库查询
     *
     * @param userName 用户名
     * @return User
     */
    public User getMapByName(String userName) {
        Permissions permissions1 = new Permissions("1", "query");
        Permissions permissions2 = new Permissions("2", "add");
        Set<Permissions> permissionsSet = new HashSet<>();
        permissionsSet.add(permissions1);
        permissionsSet.add(permissions2);
        Role role = new Role("1", "admin", permissionsSet);
        List<Role> roleSet = new ArrayList<>();
        roleSet.add(role);
        User user = new User(1, "wsl", "123456", roleSet);
        Map<String, User> map = new HashMap<>();
        map.put(user.getUserName(), user);

        Set<Permissions> permissionsSet1 = new HashSet<>();
        permissionsSet1.add(permissions1);
        Role role1 = new Role("2", "user", permissionsSet1);
        List<Role> roleSet1 = new ArrayList<>();
        roleSet1.add(role1);
        User user1 = new User(2, "zhangsan", "123456", roleSet1);
        map.put(user1.getUserName(), user1);
        return map.get(userName);
    }
}
