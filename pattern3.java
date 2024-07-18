import java.util.*;

public class pattern3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // System.out.println("enter number for create pattern:-");
        // int a = s.nextInt();
        int i, j;
        for (i = 1; i <= 5; i++) {
            System.out.print(" ");
        }

        for (j = 1; j <= 1; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (i = 1; i <= 4; i++) {
            System.out.print(" ");
        }

        for (j = 1; j <= 2; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (i = 1; i <= 3; i++) {
            System.out.print(" ");
        }
        for (j = 1; j <= 3; j++) {
            System.out.print("*");
        }

        System.out.println();
        for (i = 1; i <= 2; i++) {
            System.out.print(" ");
        }
        for (j = 1; j <= 4; j++) {
            System.out.print("*");
        }

        System.out.println();
        for (i = 1; i <= 1; i++) {
            System.out.print(" ");
        }
        for (j = 1; j <= 5; j++) {
            System.out.print("*");
        }

    }

}
