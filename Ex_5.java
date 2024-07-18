//write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is elegible to vote.

import java.util.*;

class vote {
    void fun() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:-");
        int a = s.nextInt();

        if (a >= 18) {
            System.out.println("You are eligible for vote");
        } else if (a > 0 && a < 18) {
            System.out.println("you are not eligible for vote");
        } else {
            System.out.println("X X X invalid age X X X");
        }
    }
}

class voter {
    public static void main(String arg[]) {
        vote v = new vote();
        v.fun();
    }
}
