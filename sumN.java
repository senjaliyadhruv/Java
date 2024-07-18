import java.util.*;

class sumN {
    public static void main(String args []){
        int n,sum=0;
        System.out.println("enter number for sum up to number as you want:- ");
        Scanner s=new Scanner(System.in); 
          n=s.nextInt();   
        for(int i=1;i<=n;i++){
             sum=sum+i;
        }
        System.out.println("sum of first "+n+" number is:- "+sum);
    }

}
