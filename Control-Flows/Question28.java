import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a positive number.");
        } else {
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}