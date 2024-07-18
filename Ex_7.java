//Write a Program to enter the numbers till the user wants and at the end it should display the count positive, negative and zeros entered.
import java.util.*;
class Ex_7{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1) Enter number as you want \n2)display\n enter your choice");
        int ch=s.nextInt();
        // switch(ch){
        //     case 1: System.out.println("Enter number");
        //             double a=s.nextDouble();
        //             // break;
        //     case 2:  System.out.println(a);
        //             //  break;      
        // }

        if(ch==1){
            System.out.println("Enter the number:-");
            double a=s.nextDouble();
            System.out.println(a);
        }
        else if(ch==2){
            System.out.println(a);
        }
        else{
            System.out.println("invalid choice");
        }
    }
}