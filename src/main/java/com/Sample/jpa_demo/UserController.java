package com.Sample.jpa_demo;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody() User user)
    {
        return userService.addUser(user);
    }
    @GetMapping("/get_users")
    public List<User> getUser()
    {
        return userService.getUsers();
    }

    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id)
    {
        return userService.getUser(id);
    }

    @DeleteMapping("/delete_user")

    public String deleteUser(@RequestParam("id") int id)
    {
        return userService.deleteUser(id);

    }
    @DeleteMapping("/delete_users")
    public String deleteUsers() {
        return userService.deleteUsers();
    }
   // @PutMapping("/update")
//    public String updateUser(@RequestParam("id") int id)
//    {
//        return userService.updateUser(id);
//    }
}
