//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class Ex_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        double sum =0;//temp=0;
        for(int i=0;i<n;i++){
            i=i+1;
             sum+=i;
            //   temp=temp+sum;
        }
        System.out.println("sum of n number is:-  "+sum);
    }
    
}
