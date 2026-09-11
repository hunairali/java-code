package io.app.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
    private  UserService service;



    // CREATE
    @PostMapping
    public User create(@RequestBody User user) {
        return service.createUser(user);
    }

    // READ ALL
    @GetMapping
    public List<User> getAll() {
        return service.getAllUsers();
    }

    // READ ONE
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return service.updateUser(id, user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteUser(id);
        return "User deleted successfully";
    }
}