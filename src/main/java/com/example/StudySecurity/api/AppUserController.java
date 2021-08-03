package com.example.StudySecurity.api;

import com.example.StudySecurity.AppUser.AppUser;
import com.example.StudySecurity.AppUser.Role;
import com.example.StudySecurity.Service.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class AppUserController {

    private final UserServiceImpl userService;

    @GetMapping("/Users")
    public ResponseEntity<List<AppUser>> getUsers(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }
    @PostMapping("/user/save")
    public ResponseEntity<AppUser> saveUser(@RequestBody AppUser user)
    {
        URI uri= URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));
    }
    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role){
        URI uri= URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));
    }



}
