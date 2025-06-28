package test;

import model.User;
import roles.Admin;
import roles.Vet;
import roles.Volunteer;
import authentication.LoginManager;

public class LoginTest {
    public static void main(String[] args) {
        // Create roles
        Admin adminRole = new Admin("Alice");
        Vet vetRole = new Vet("Dr. Bob");
        Volunteer volunteerRole = new Volunteer("Charlie");

        // Create users with roles
        User adminUser = new User("Alice Smith", "alice@example.com", "adminpass", adminRole);
        User vetUser = new User("Bob Jones", "bob@example.com", "vetpass", vetRole);
        User volunteerUser = new User("Charlie Ray", "charlie@example.com", "volpass", volunteerRole);

        // Create LoginManager and register users
        LoginManager loginManager = new LoginManager();
        loginManager.registerUser(adminUser);
        loginManager.registerUser(vetUser);
        loginManager.registerUser(volunteerUser);

        // Test logins
        testLogin(loginManager, "alice@example.com", "adminpass");  // should succeed
        testLogin(loginManager, "bob@example.com", "wrongpass");    // should fail
        testLogin(loginManager, "charlie@example.com", "volpass");  // should succeed
        testLogin(loginManager, "unknown@example.com", "nopass");   // should fail
    }

    private static void testLogin(LoginManager manager, String email, String password) {
        User user = manager.login(email, password);
        if (user != null) {
            System.out.println("Login successful for " + email);
            user.showDashboard();
        } else {
            System.out.println("Login failed for " + email);
        }
        System.out.println();
    }
}
