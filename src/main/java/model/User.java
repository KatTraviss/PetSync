package model;

import roles.UserRole;

public class User {
    private String fullName;
    private String email;
    private String password;
    private UserRole role;

    public User(String fullName, String email, String password, UserRole role) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Show the dashboard based on the user's role
    public void showDashboard() {
        System.out.println("==== DASHBOARD ====");
        role.showDashboard();
    }

    // Getters (you can add setters if needed)
    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkPassword(String input) {
        return password.equals(input);
    }

    public String getRoleName() {
        return role.getRoleName();
    }

    public UserRole getRole() {
        return role;
    }
}
