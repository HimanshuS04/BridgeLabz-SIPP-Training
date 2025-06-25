public class Employee {

    // Static variable shared by all employees
    static String companyName = "MyCompany";

    // Static variable to track total employees
    private static int totalEmployees = 0;

    // Final variable for employee ID
    private final String id;

    private String name;
    private String designation;

    // Constructor using 'this' to initialize variables
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Getters and setters for name and designation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getId() {
        return id;
    }

    // Method to display employee details with instanceof check
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Name: " + this.name);
            System.out.println("ID: " + this.id);
            System.out.println("Designation: " + this.designation);
        } else {
            System.out.println("Object is not an instance of Employee");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", "E001", "Manager");
        Employee emp2 = new Employee("Bob", "E002", "Developer");

        displayTotalEmployees();

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Demonstrating that id cannot be changed
        // emp1.id = "E999"; // This line would cause a compilation error

        emp1.setName("Alice Updated");
        emp1.displayEmployeeDetails();
    }
}
