import java.util.*;

class SumDigits {
    public static void main(String[] args) {
        int n, r, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to find sum of digit");
        n = s.nextInt();

        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println("Sum of Digits is --> " + sum);
    }
}
