package roles;

public class Volunteer extends UserRole {
    public Volunteer(String name) {
        super(name);
    }

    @Override
    public void showDashboard() {
        super.showDashboard(); // shows common features
        System.out.println("Volunteer tools:");
        System.out.println("- Leave animal care notes");
    }

    public void leaveNote() {
        System.out.println(name + " left a care note.");
    }
}