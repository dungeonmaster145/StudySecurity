package com.example.StudySecurity.Repo;

import com.example.StudySecurity.AppUser.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser,Long> {

    AppUser findByUserName(String name);
}
