
//Reverse string
import java.util.*;

class ReverseString {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        char a[] = new char[30];
        System.out.println("Enter string:- ");
        for (int i = 0; i < 5; i++) {
            a[i] = s.nextLine().charAt(0);
        }
        System.out.println("Your reversed String is:- ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }

}
