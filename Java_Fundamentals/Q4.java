import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double cm = s.nextDouble();
        double inches = cm / 2.54;
        double feet = inches / 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
    }
}