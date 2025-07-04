package roles;

public class UserRole {
    protected String name;

    public UserRole(String name) {
        this.name = name;
    }

    public void showDashboard() {
        System.out.println("Welcome, " + name + "!");
        System.out.println("Common features:");
        System.out.println("- View animal profiles");
        System.out.println("- Update personal information");
    }

    public String getRoleName() {
        return this.getClass().getSimpleName();
    }
}