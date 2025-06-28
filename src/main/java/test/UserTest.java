package test;

import model.User;
import roles.Admin;
import roles.Vet;
import roles.Volunteer;

public class UserTest {
    public static void main(String[] args) {
        // Create role instances
        Admin adminRole = new Admin("Alice");
        Vet vetRole = new Vet("Dr. Bob");
        Volunteer volunteerRole = new Volunteer("Charlie");

        // Create users with their roles
        User adminUser = new User("Alice Smith", "alice@example.com", "pass123", adminRole);
        User vetUser = new User("Bob Jones", "bob@example.com", "vetpass", vetRole);
        User volunteerUser = new User("Charlie Ray", "charlie@example.com", "volpass", volunteerRole);

        // Show dashboards (calls method in roles)
        adminUser.showDashboard();
        vetUser.showDashboard();
        volunteerUser.showDashboard();

        // Call some role-specific actions
        adminRole.manageUsers();
        vetRole.logTreatment();
        volunteerRole.leaveNote();
    }
}