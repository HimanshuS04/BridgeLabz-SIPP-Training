import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        System.out.println("The results of Int Operations are " + (a + b * c) + ", " + (a * b + c) + ", " + (c + a / b)
                + ", " + (a % b + c));
    }
}