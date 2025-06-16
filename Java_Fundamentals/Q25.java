import java.util.*;

public class Q25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double f = s.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("The " + f + " fahrenheit is " + c + " celsius");
    }
}