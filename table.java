import java.util.*;

class table {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int a = s.nextInt();
        
        System.out.println("your table is \n");
        for(int i=1;i<11;i++){
            System.out.println(+a+" * "+i+" = "+(a*i));
        }
    }
}