import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double b = s.nextDouble(), h = s.nextDouble();
        double areaCm = 0.5 * b * h;
        double areaIn = areaCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
    }
}