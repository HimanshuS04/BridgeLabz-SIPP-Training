import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ft = s.nextDouble();
        double yd = ft / 3;
        double mi = yd / 1760;
        System.out.println("The distance in yards is " + yd + " while the distance in miles is " + mi);
    }
}