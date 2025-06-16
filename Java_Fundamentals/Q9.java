import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double fee = s.nextDouble(), dp = s.nextDouble();
        double discount = fee * dp / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}