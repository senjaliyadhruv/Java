
// Write a function that calculates the greatest common divisor of 2 numbers.
import java.util.*;

class abc {
    void gcd(int a, int b) {
        if (a == b) {
            System.out.println(a);
        } else if (a > b) {
            a = a - b;
            // System.out.println(a);
            if (a % b == 0) {
                System.out.println(a);
            }else{
                if(b>a){
                    b=b-a;
                    System.out.println(b);
                }else if(a>b){
                    a=a-b;
                    System.out.println(a);
                }
            }
        } else if (b > a) {
            b = b - a;
            // System.out.println(b);
            if (b % a == 0) {
                System.out.println(b);
            } else {
                if (a > b) {
                    a = a - b;
                    // System.out.println(a);
                   
                        System.out.println(a);
                    
                }else if(b>a){
                    b=b-a;
                    System.out.println(b);
                }
            }
        }

    }
}

class Ex_9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter a:- ");
        int a = s.nextInt();
        System.out.println("enter b:- ");
        int b = s.nextInt();

        abc g = new abc();
        g.gcd(a, b);
        System.out.println("bye bye");
    }
}