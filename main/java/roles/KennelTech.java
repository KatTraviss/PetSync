package roles;

public class KennelTech extends VetTech {

    public KennelTech(String name) {
        super(name);
    }

    public void completeCareTask() {
        System.out.println(name + " completed a care task.");
    }
}
