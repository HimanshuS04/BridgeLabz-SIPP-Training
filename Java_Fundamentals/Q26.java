import java.util.*;

public class Q26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next(), from = s.next(), via = s.next(), to = s.next();
        double d1 = s.nextDouble(), d2 = s.nextDouble(), t1 = s.nextDouble(), t2 = s.nextDouble();
        System.out.println("The Total Distance travelled by " + name + " from " + from + " to " + to + " via " + via
                + " is " + (d1 + d2) + " km and the Total Time taken is " + (t1 + t2) + " minutes");
    }
}