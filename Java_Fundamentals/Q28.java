import java.util.*;

public class Q28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choco = s.nextInt(), child = s.nextInt();
        System.out.println("The number of chocolates each child gets is " + (choco / child)
                + " and the number of remaining chocolates is " + (choco % child));
    }
}