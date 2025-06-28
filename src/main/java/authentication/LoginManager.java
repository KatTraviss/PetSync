package authentication;

import model.User;
import roles.*;

import java.util.ArrayList;
import java.util.List;

public class LoginManager {
    private List<User> registeredUsers;

    public LoginManager() {
        registeredUsers = new ArrayList<>();

        // Hardcoded users for testing — in real app, load from DB
        registeredUsers.add(new User("Alice Smith", "alice@example.com", "adminpass", new Admin("Alice")));
        registeredUsers.add(new User("Bob Jones", "bob@example.com", "vetpass", new Vet("Dr. Bob")));
        registeredUsers.add(new User("Charlie Ray", "charlie@example.com", "volpass", new Volunteer("Charlie")));
        registeredUsers.add(new User("Dana White", "dana@example.com", "applicantpass", new Applicant("Dana")));
    }

    // Add new user to the list (for registration)
    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    // Returns User if login successful, null if not
    public User login(String email, String password) {
        for (User user : registeredUsers) {
            if (user.getEmail().equalsIgnoreCase(email) && user.checkPassword(password)) {
                System.out.println("Login successful: " + user.getFullName());
                return user;
            }
        }
        System.out.println("Login failed: Invalid email or password");
        return null;
    }
}
