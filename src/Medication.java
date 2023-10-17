public class Medication {
    private int medicationID;
    private String medicationName;
    private String dosage;
    private int patientID;

    // Constructors, getters, and setters

    public Medication(int medicationID, String medicationName, String dosage, int patientID) {
        this.medicationID = medicationID;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.patientID = patientID;
    }

    public int getMedicationID() {
        return medicationID;
    }

    public void setMedicationID(int medicationID) {
        this.medicationID = medicationID;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
}
