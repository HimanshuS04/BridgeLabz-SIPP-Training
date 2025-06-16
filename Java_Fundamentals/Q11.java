import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();
        System.out.println("The results of Double Operations are " + (a + b * c) + ", " + (a * b + c) + ", "
                + (c + a / b) + ", " + (a % b + c));
    }
}