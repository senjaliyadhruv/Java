//calculator using two variable
import java.util.*;

class calc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number a:-");
        float a=s.nextFloat();
        System.out.println("enter number b:-");
        float b=s.nextFloat();

        System.out.println("**Enter Your Choice**\n1)Addition\n2)Substraction\n3)Multiplication\n4)Division\n5)Modulous");
        int choice=s.nextInt();
        switch(choice){
            case 1:System.out.println(a+b);
                    break;
            case 2:System.out.println(b-a);
                    break;
            case 3:System.out.println(a*b);
                    break;
            case 4:System.out.println(a/b);
                    break;
            case 5:System.out.println(a%b);
                     break;
        }
    }

}
