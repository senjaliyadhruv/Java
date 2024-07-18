import java.util.*;

class palindrome {
    public static void main(String[] args) {
        int n, c, r, s = 0;
        Scanner l = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = l.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (c == s)
            System.out.println("Palindrome Number");
        else
            System.out.println("Non Palindrome Number");
    }
}
