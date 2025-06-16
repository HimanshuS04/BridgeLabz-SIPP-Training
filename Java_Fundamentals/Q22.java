import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double salary = s.nextDouble(), bonus = s.nextDouble();
        double total = salary + bonus;
        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus
                + ". Hence Total Income is INR " + total);
    }
}