package loop;

public class Patient {
    private String firstName;
    private String lastName;
    private Long idPatient;

    public Patient(String firstName, String lastName, Long idPatient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idPatient = idPatient;
    }

    @Override
    public String toString() {
        return "Patient: " + firstName + " " + lastName +" ID: " + idPatient;
    }
}
