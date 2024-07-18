//Enter 3 number from the user & make a function to print their average.

import java.util.*;
class Average{
        public static void main(String arg[]){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter 3 variable to find out Average");
            double a=s.nextDouble();
            double b=s.nextDouble();
            double c=s.nextDouble();

            double ave=(a+b+c)/3;

            System.out.println("Your Average =" +ave);
        }

}