import java.util.*;
class PrintOdd {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the nth number to print Odd number:- ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i=i+2){
            System.out.print(i+" ");
            // i++;
        }
    }
    
}
