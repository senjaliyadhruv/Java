import java.util.*;

class Factor {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}