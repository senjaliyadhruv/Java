import java.util.*;

class CountOfDigits {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any length of number");
        n = s.nextInt();
        while(n>0){
        n=n/10;
        count++;
        }
        // for (count = 0; count > 0; count++) {
        //     n = n / 10;

        // }
        System.out.println("no.of digits " + count);
    }
}
