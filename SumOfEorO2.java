import java.util.*;

class SumOfEorO2 {
    public static void main(String[] args) {
        int n, i, sum = 0;
        System.out.println("Enter the nth number to print sum of Even or Odd number:- ");
        System.out.println("if you entered Even number then it is print sum of Even number and vise-versa.");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        if (n % 2 == 0) {
            for (i = 0; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println("Sum of Even Number is:- " + sum);
        } else {
            for (i = 1; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println("Sum of Odd number is:- " + sum);
        }
    }
}