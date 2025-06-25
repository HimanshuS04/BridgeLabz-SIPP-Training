public class Vehicle {

    // Static variable common for all vehicles
    static double registrationFee = 100.0;

    // Final variable for unique registration number
    private final String registrationNumber;

    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to initialize variables
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Getters and setters for ownerName and vehicleType
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Method to display registration details with instanceof check
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Object is not an instance of Vehicle");
        }
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150.0);

        Vehicle vehicle1 = new Vehicle("Alice", "Car", "REG123");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle", "REG456");

        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();

        // Demonstrating that registrationNumber cannot be changed
        // vehicle1.registrationNumber = "REG999"; // This line would cause a compilation error

        vehicle1.setOwnerName("Alice Updated");
        vehicle1.displayRegistrationDetails();
    }
}
