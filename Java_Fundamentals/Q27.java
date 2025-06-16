import java.util.*;

public class Q27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped numbers are " + a + " and " + b);
    }
}