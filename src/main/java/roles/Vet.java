package roles;

public class Vet extends UserRole {
    public Vet(String name) {
        super(name);
    }

    @Override
    public void showDashboard() {
        super.showDashboard(); // show common features
        System.out.println("Vet tools:");
        System.out.println("- View and log treatments");
        System.out.println("- Set medical reminders");
    }

    public void logTreatment() {
        System.out.println(name + " logged a treatment.");
    }
}
