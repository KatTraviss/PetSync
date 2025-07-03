package main.java.model;

import java.util.UUID;

import main.java.roles.UserRole;

public class User {
    private String fullName;
    private String email;
    private String password;
    private UserRole role; 
    private UUID userID;
    private String roleName;
    
    public User() {
    	
    }

    public User(UUID userID, String fullName, String email, String password, UserRole role) {
        this.setUserID(userID);
    	this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    
    public void roleNameTransfer(String roleName) {
    	//implement Factory Pattern to set role.
    }

    // Show the dashboard based on the user's role
    public void showDashboard() {
        System.out.println("==== DASHBOARD ====");
        role.showDashboard();
    }

    // Getters & Setters
    public String getFullName() {
        return fullName;
    }
    
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

    public String getEmail() {
        return email;
    }
    
	public void setEmail(String email) {
		this.email = email;
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
    
	public void setRole(UserRole role) {
		this.role = role;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
    
	public String getPassword() {
		return password;
	}
    
}
