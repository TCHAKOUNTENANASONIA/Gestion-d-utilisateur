package Service;

import Repository.UserRepository;
import Repository.UserRepositoryImpl;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Object getUser(Long id) {
        return userRepository.findById(id);//.orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);
    }
}
