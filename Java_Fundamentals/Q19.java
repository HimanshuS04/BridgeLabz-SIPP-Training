import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double p = s.nextDouble(), r = s.nextDouble(), t = s.nextDouble();
        double si = p * r * t / 100;
        System.out.println(
                "The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}