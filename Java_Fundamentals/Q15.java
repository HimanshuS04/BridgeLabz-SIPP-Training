import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double up = s.nextDouble();
        int qty = s.nextInt();
        double total = up * qty;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + qty
                + " and the unit price is INR " + up);
    }
}