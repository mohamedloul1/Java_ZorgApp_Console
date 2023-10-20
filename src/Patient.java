import java.time.LocalDate;
import java.util.Date;

public class Patient {
    private int patientID;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
     double patientHeight;
     double patientWeight;
    public Patient(int patientID, String firstName, String lastName, LocalDate dateOfBirth, double patientHeight, double patientWeight) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.patientHeight = patientHeight;
        this.patientWeight = patientWeight;
    }
    // Getter en setter-methoden voor de eigenschappen
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPatientHeight() {
        return patientHeight;
    }

    public void setPatientHeight(double patientHeight) {
        this.patientHeight = patientHeight;
    }

    public double getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(double patientWeight) {
        this.patientWeight = patientWeight;
    }
}
