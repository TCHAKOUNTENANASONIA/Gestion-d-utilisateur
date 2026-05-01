package Repository;

import model.User;

import java.util.*;

public class UserRepositoryImpl implements UserRepository {
    private final Map<Long, User> database = new HashMap<>();

   // @Override
    //public void save(User user) database.put(user.getId(), user);}

    @Override
    public Optional<Object> findById(Long id) {
        return Optional.ofNullable(database.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(database.values());
    }

    @Override
    public void delete(Long id) {
        database.remove(id);
    }

    @Override
    public void save(User user) {
        database.put(user.getId(), user);
    }
}

