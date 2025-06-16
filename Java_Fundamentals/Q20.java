import java.util.*;

public class Q20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();
        double perimeter = a + b + c;
        double rounds = 5000 / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}