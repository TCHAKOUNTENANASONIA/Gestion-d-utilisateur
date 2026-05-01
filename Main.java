import Controller.UserController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Démarrage de l'application (Version Map) ---");

        // 1. Initialisation des composants (on injecte les dépendances manuellement)
        // Normalement, dans un vrai projet Spring Boot, c'est le framework qui le fait
        UserController userController = new UserController();


        // 2. Exécution de la logique de test
        // La méthode run() du contrôleur va ajouter, chercher et supprimer des utilisateurs
        userController.run();

        System.out.println("--- Fin du programme ---");
    }
}
