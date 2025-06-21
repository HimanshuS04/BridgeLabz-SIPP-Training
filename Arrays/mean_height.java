/*CP - Create a program to find the mean height of players in a football team.
Hint =>
1. The formula to calculate the mean is: mean = sum of all elements/number of elements
2. Create a double array named heights of size 11 and get input values from the user.
3. Find the sum of all the elements present in the array.
4. Divide the sum by 11 to find the mean height and print the mean height of the football

*/
import java.util.*;
public class mean_height {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double[] height= new double[11];
        int sum=0;
        System.out.println("enter the heights of players");
        for (int i=0;i<11;i++){
            height[i]=sc.nextInt();
            sum+=height[i];
        }
        int mean= sum/11;
        System.out.println("the mean height of players is"+mean);
    }   
}
