public class Student {

    // Static variable shared across all students
    static String universityName = "MyUniversity";

    // Static variable to track total students
    private static int totalStudents = 0;

    // Final variable for roll number
    private final String rollNumber;

    private String name;
    private String grade;

    // Constructor using 'this' to initialize variables
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Getters and setters for name and grade
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    // Method to display student details with instanceof check
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
        } else {
            System.out.println("Object is not an instance of Student");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", "R001", "A");
        Student student2 = new Student("Jane", "R002", "B");

        displayTotalStudents();

        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Demonstrating that rollNumber cannot be changed
        // student1.rollNumber = "R999"; // This line would cause a compilation error

        student1.setGrade("A+");
        student1.displayStudentDetails();
    }
}
