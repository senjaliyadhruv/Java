
//Two numbers are entered by the user ,X and n. write a function to find the value of one number raised to the power of another i.e. x^n.
import java.util.*;

class power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of x:=");
        int x = s.nextInt();
        System.out.println("enter value of n:-");
        int n = s.nextInt();
        // ans =5*2*2;
        double ans=1;
        // ans = x * x;
        // ans = x * x * x;
        // ans = x * x * x * x;
        // ans = x * x * x * x * x;
        // double i = x;
        for (int i = 1; i <= n; i++) {
    
            ans=ans*x;
        }

        System.out.println(ans);
    }
}