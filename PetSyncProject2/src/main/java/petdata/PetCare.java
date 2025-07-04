package petdata;

import java.util.List;

public class PetCare {
    private List<String> feedingSchedule;
    private List<String> medications;
    private List<String> enrichmentActivities;
    private List<String> exerciseSchedule;

    public PetCare(List<String> feedingSchedule, List<String> medications,
                   List<String> enrichmentActivities, List<String> exerciseSchedule) {
        this.feedingSchedule = feedingSchedule;
        this.medications = medications;
        this.enrichmentActivities = enrichmentActivities;
        this.exerciseSchedule = exerciseSchedule;
    }

    // Getters
    public List<String> getFeedingSchedule() {
        return feedingSchedule;
    }

    public List<String> getMedications() {
        return medications;
    }

    public List<String> getEnrichmentActivities() {
        return enrichmentActivities;
    }

    public List<String> getExerciseSchedule() {
        return exerciseSchedule;
    }

    // Setters
    public void setFeedingSchedule(List<String> feedingSchedule) {
        this.feedingSchedule = feedingSchedule;
    }

    public void setMedications(List<String> medications) {
        this.medications = medications;
    }

    public void setEnrichmentActivities(List<String> enrichmentActivities) {
        this.enrichmentActivities = enrichmentActivities;
    }

    public void setExerciseSchedule(List<String> exerciseSchedule) {
        this.exerciseSchedule = exerciseSchedule;
    }

    public void printCareInstructions() {
        System.out.println("Feeding Schedule: " + feedingSchedule);
        System.out.println("Medications: " + medications);
        System.out.println("Enrichment Activities: " + enrichmentActivities);
        System.out.println("Exercise Schedule: " + exerciseSchedule);
    }
}