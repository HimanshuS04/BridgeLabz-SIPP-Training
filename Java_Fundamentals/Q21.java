import java.util.*;

public class Q21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c = s.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("The " + c + " celsius is " + f + " fahrenheit");
    }
}