import java.util.*;

public class Q23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int handshakes = n * (n - 1) / 2;
        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}