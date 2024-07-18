import java.util.*;
class PrintEven {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the nth number to print Even number:- ");
         Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=0;i<=n;i=i+2){
            System.out.print(i+" ");
        }
    }
}
