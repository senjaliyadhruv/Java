//Takes an array as input from the user.Search for a given number X and print the index at which it occurs.
//searching value at index of java
import java.util.*;

class Ex1_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array:- ");
        int size = s.nextInt();
        int number[] = new int[size];
        System.out.println("enter values for array:- ");
        for (int i = 0; i < size; i++) {
            number[i] = s.nextInt();
        }
        System.out.println("which number do you want to search? ");
        int x = s.nextInt();
        for (int i = 0; i < size; i++) {
            if (number[i] == x) {
                System.out.println("number is found at the index " + i);
            } 
            // else
            //     System.out.println("number not found");
        }
    }

}