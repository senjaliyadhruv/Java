import java.util.*;

class maxofThreeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter value of 1st number");
        a = s.nextInt();
        System.out.println("Enter value of 2nd number");
        b = s.nextInt();
        System.out.println("Enter value of 3rd number");
        c = s.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else
                System.out.println(c);
        } else {
            if (b > c) {
                System.out.println(b);
            } else
                System.out.println(c);
        }
    }
}
