
//write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;

class Ex_4 {
    void cir() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius to find circumference of circle:- ");
        double r = s.nextDouble();

        double ans = 2 * 3.14 * r;
        System.out.println("circumference of circle is =" + ans);
    }
}

class b {
    public static void main(String[] args) {

        Ex_4 e = new Ex_4();
        e.cir();
    }
}