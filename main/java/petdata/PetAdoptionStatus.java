package petdata;

public class PetAdoptionStatus {
    private boolean isAdopted;
    private boolean isAdoptable;
    private String adoptionNotes;

    public PetAdoptionStatus() {
        this.isAdopted = false;
        this.isAdoptable = true; // default to adoptable
        this.adoptionNotes = "";
    }

    public PetAdoptionStatus(boolean isAdopted, boolean isAdoptable, String adoptionNotes) {
        this.isAdopted = isAdopted;
        this.isAdoptable = isAdoptable;
        this.adoptionNotes = adoptionNotes;
    }

    // Getters
    public boolean isAdopted() {
        return isAdopted;
    }

    public boolean isAdoptable() {
        return isAdoptable;
    }

    public String getAdoptionNotes() {
        return adoptionNotes;
    }

    // Setters
    public void setAdopted(boolean adopted) {
        this.isAdopted = adopted;
    }

    public void setAdoptable(boolean adoptable) {
        this.isAdoptable = adoptable;
    }

    public void setAdoptionNotes(String notes) {
        this.adoptionNotes = notes;
    }

    public void printAdoptionStatus() {
        System.out.println("Adopted: " + isAdopted);
        System.out.println("Adoptable: " + isAdoptable);
        System.out.println("Notes: " + adoptionNotes);
    }
}
