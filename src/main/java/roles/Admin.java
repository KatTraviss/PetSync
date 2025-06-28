package roles;

public class Admin extends Vet {
    public Admin(String name) {
        super(name);
    }

    @Override
    public void showDashboard() {
        super.showDashboard(); // show vet + base tools
        System.out.println("Admin tools:");
        System.out.println("- Manage users");
        System.out.println("- Generate reports");
    }

    public void manageUsers() {
        System.out.println(name + " is managing user accounts.");
    }
}
