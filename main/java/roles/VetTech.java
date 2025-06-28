package roles;

public class VetTech extends Vet {

    public VetTech(String name) {
        super(name);
    }

    public void updateAnimalHistory() {
        System.out.println(name + " is updating animal health history.");
    }
}
