package Service;

import model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    Object getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
