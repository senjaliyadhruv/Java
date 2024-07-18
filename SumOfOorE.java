import java.util.*;

class SumOfOorE {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter the nth number to print sum of Even number:- ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 0; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum of Even Number is:- " + sum);
        sum=0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("Sum of Odd number is:- " + sum);
    }
}
