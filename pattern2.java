import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter number for create pattern:-");
        int a=s.nextInt();
        for (int j = 1; j <= a; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // for (int i = 1; i <= 2; i++) {
        // System.out.print("* ");
        // }
        // System.out.println();

        // for (int i = 1; i <= 3; i++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // for (int i = 1; i <= 4; i++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // for (int i = 1; i <= 5; i++) {
        // System.out.print("* ");
        // }

    }

}
