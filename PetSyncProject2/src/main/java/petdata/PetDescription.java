package petdata;

import java.time.LocalDate;

public class PetDescription {
    private String color;
    private double weightKg;
    private LocalDate intakeDate;
    private String specialNotes;

    public PetDescription(String color, double weightKg, LocalDate intakeDate, String specialNotes) {
        this.color = color;
        this.weightKg = weightKg;
        this.intakeDate = intakeDate;
        this.specialNotes = specialNotes;
    }

    // Getters
    public String getColor() {
        return color;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public LocalDate getIntakeDate() {
        return intakeDate;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setIntakeDate(LocalDate intakeDate) {
        this.intakeDate = intakeDate;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    public void displayDescription() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Intake Date: " + intakeDate);
        System.out.println("Notes: " + specialNotes);
    }
}