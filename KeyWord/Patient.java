public class Patient {

    // Static variable shared among all patients
    static String hospitalName = "CityHospital";

    // Static variable to track total patients
    private static int totalPatients = 0;

    // Final variable for unique patient ID
    private final String patientID;

    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to initialize variables
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Getters and setters for name, age, and ailment
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public String getPatientID() {
        return patientID;
    }

    // Method to display patient details with instanceof check
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
            System.out.println("Patient ID: " + this.patientID);
        } else {
            System.out.println("Object is not an instance of Patient");
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", 45, "Flu", "P001");
        Patient patient2 = new Patient("Jane Smith", 30, "Cold", "P002");

        System.out.println("Total Patients: " + getTotalPatients());

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        // Demonstrating that patientID cannot be changed
        // patient1.patientID = "P999"; // This line would cause a compilation error

        patient1.setAilment("Recovered");
        patient1.displayPatientDetails();
    }
}
