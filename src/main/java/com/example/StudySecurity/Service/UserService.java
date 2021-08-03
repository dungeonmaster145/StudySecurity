package com.example.StudySecurity.Service;

import com.example.StudySecurity.AppUser.AppUser;
import com.example.StudySecurity.AppUser.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoletoUser(String userName,String role);
    AppUser getUser(String name);
    List<AppUser> getAllUsers();
}
