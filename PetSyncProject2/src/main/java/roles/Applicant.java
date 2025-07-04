package roles;

public class Applicant extends UserRole {
    public Applicant(String name) {
        super(name);
    }

    @Override
    public void showDashboard() {
        super.showDashboard(); // base dashboard
        System.out.println("Applicant tools:");
        System.out.println("- Browse adoptable animals");
        System.out.println("- Submit adoption request");
    }

    public void submitApplication() {
        System.out.println(name + " submitted an adoption application.");
    }
}