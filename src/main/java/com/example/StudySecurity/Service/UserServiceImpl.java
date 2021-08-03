package com.example.StudySecurity.Service;

import com.example.StudySecurity.AppUser.AppUser;
import com.example.StudySecurity.AppUser.Role;
import com.example.StudySecurity.Repo.RoleRepo;
import com.example.StudySecurity.Repo.UserRepo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
@Transactional
@Slf4j
public class UserServiceImpl implements  UserService{

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Override
    public AppUser saveUser (AppUser user) {

        return userRepo.save(user);
    }

    @Override
    public Role saveRole (Role role) {

        return roleRepo.save(role);
    }

    @Override
    public void addRoletoUser (String userName, String role) {


       AppUser user = userRepo.findByUserName(userName);
       Role roleN=roleRepo.findByName(role);
       user.getRole().add(roleN);

    }

    @Override
    public AppUser getUser (String name) {
        return userRepo.findByUserName(name);
    }

    @Override
    public List<AppUser> getAllUsers () {
        return userRepo.findAll();
    }
}
