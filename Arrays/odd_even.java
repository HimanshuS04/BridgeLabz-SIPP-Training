/*CP - Create a program to save odd and even numbers into odd and even arrays between 1 to the number
entered by the user. Finally, print the odd and even numbers array
Hint =>
1. Get an integer input from the user, assign it to a variable number, and check for a Natural Number. If
not a natural number, then print an error and exit the program
2. Create an integer array for even and odd numbers with size = number / 2 + 1
3. Create index variables for odd and even numbers and initialize them to zero
4. Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even
number into the corresponding array
5. Finally, print the odd and even numbers array using the odd and even index*/

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            return;
        }
        int[]even= new int[n/2+1];
        int[] odd= new int[n/2+1];
        int e_idx=0;
        int o_idx=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even[e_idx++]=i;
            }
            else{
                odd[o_idx++]=i;
            }
        }
        System.out.print("Even array ");
        for(int i=0;i<even.length;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.print("odd array ");
        for(int i=0;i<odd.length;i++){
            System.out.print(odd[i]+" ");
        }

        
    }
}
