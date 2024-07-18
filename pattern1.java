import java.util.*;

class pattern1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of row");
        int a = s.nextInt();
        System.out.println("enter number of columns");
        int b = s.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}