package com.example.StudySecurity.Repo;

import com.example.StudySecurity.AppUser.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
