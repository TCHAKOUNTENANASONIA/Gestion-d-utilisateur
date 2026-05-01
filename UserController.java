package Controller;

import Service.UserService;
import Service.UserServiceImpl;
import model.User;

public class UserController {
    private final UserService userService = new UserServiceImpl();

    public void run() {
        // Ajout d'utilisateurs
        userService.addUser(new User(1L, "Alice", "alice@example.com"));
        userService.addUser(new User(2L, "Kevin", "kevin@example.com"));

        // Affichage
        System.out.println("Liste des utilisateurs : " + userService.getAllUsers());

        // Récupération d'un utilisateur
        System.out.println("User ID 1 : " + userService.getUser(1L));

        // Suppression
        userService.deleteUser(1L);
        System.out.println("Après suppression : " + userService.getAllUsers());
    }
}

