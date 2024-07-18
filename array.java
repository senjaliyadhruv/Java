//simple array
import java.util.*;
class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int number[]=new int [size];
        System.out.println("enter values to show array:- ");
        for(int i=0;i<size;i++){
            number[i]=s.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println("array is:-" +number[i]);
        }

        // int[] marks = new int[5];
        // int marks[] = { 45, 65, 99, 49, 9 };
        // // marks[0] = 45;
        // // marks[1] = 65;
        // // marks[2] = 99;
        // // marks[3] = 49;
        // // marks[4] = 9;

        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // // System.out.println(marks[3]);
        // // System.out.println(marks[4]);

        // for (int i = 0; i < 5; i++) {
        //     System.out.println(marks[i]);
        // }
    }

}