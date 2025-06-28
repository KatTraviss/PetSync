package test;

import model.User;
import roles.Applicant;
import roles.Volunteer;
import authentication.LoginManager;

public class RegistrationTest {
    public static void main(String[] args) {
        // Create a new LoginManager instance
        LoginManager loginManager = new LoginManager();

        // Simulate registering a new Volunteer
        Volunteer newVolunteerRole = new Volunteer("Jordan");
        User newVolunteer = new User("Jordan Lake", "jordan@example.com", "vol123", newVolunteerRole);
        loginManager.registerUser(newVolunteer);
        System.out.println("Registered new volunteer: " + newVolunteer.getFullName());

        // Simulate registering a new Applicant
        Applicant newApplicantRole = new Applicant("Taylor");
        User newApplicant = new User("Taylor Snow", "taylor@example.com", "app123", newApplicantRole);
        loginManager.registerUser(newApplicant);
        System.out.println("Registered new applicant: " + newApplicant.getFullName());

        System.out.println();

        // Test login for both new users
        User loginVolunteer = loginManager.login("jordan@example.com", "vol123");
        if (loginVolunteer != null) {
            loginVolunteer.showDashboard();
        }

        System.out.println();

        User loginApplicant = loginManager.login("taylor@example.com", "app123");
        if (loginApplicant != null) {
            loginApplicant.showDashboard();
        }
    }
}
