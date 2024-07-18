import java.util.*;
class FirstN {
    public static void main(String args[]) {
        System.out.println("Enter the number to show Natural numbers up to the number you want:-");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
    }
    
}
