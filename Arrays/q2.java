import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        int []arr= new int[10];
        if(num<10 && num>5){
            for(int i=0;i<10;i++){
                arr[i]= num*(i+1);
                System.out.println(num+"*"+(i+1)+"="+arr[i]);
            
            }
        }
        else{
            System.out.println("choose a valid number btw 6 to 9");
        }

    }
    
}

