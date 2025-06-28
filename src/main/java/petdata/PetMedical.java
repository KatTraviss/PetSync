package petdata;

import java.util.ArrayList;
import java.util.List;

public class PetMedical {
    private List<String> vaccinations;
    private List<String> treatments;
    private String specialNeeds;

    public PetMedical() {
        this.vaccinations = new ArrayList<>();
        this.treatments = new ArrayList<>();
        this.specialNeeds = "";
    }

    public PetMedical(List<String> vaccinations, List<String> treatments, String specialNeeds) {
        this.vaccinations = vaccinations;
        this.treatments = treatments;
        this.specialNeeds = specialNeeds;
    }

    // Getters
    public List<String> getVaccinations() {
        return vaccinations;
    }

    public List<String> getTreatments() {
        return treatments;
    }

    public String getSpecialNeeds() {
        return specialNeeds;
    }

    // Setters
    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public void setTreatments(List<String> treatments) {
        this.treatments = treatments;
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public void printMedicalInfo() {
        System.out.println("Vaccinations: " + vaccinations);
        System.out.println("Treatments: " + treatments);
        System.out.println("Special Needs: " + specialNeeds);
    }
}
