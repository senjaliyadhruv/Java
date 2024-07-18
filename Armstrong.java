import java.util.*;

class Armstrong {
    public static void main(String[] args) {
        int n, arm = 0, c, r;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Number");
        n = s.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            arm = (r * r * r) + arm;
            n=n/10;
        }
        if (c == arm)
            System.out.println("Armtrong number");
        else
            System.out.println("Non Armstrong Number");
    }
}
