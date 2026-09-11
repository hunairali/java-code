package io.app.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

	@Autowired
    private  UserRepository repository;

    

    // CREATE
    public User createUser(User user) {
        return repository.save(user);
    }

    // READ ALL
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    // READ BY ID
    public User getUserById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    // UPDATE
    public User updateUser(Long id, User updatedUser) {
        User user = getUserById(id);
        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());
        return repository.save(user);
    }

    // DELETE
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}