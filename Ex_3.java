
//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;

class greater {
    void gr()

    {
        Scanner s = new Scanner(System.in);
        double a =s. nextDouble();
        double b =s. nextDouble();
        if (a > b) {
            System.out.println("a is Greater");
        } else {
            System.out.println("b is Greater");
        }
    }

}
class greater1 {
    public static void main(String[] args) {
        greater g = new greater();
        g.gr();
    }
}