import java.util.*;
class ReverseNo {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n,r;
    System.out.println("Enter any number ");
    n=s.nextInt();

    while(n>0){
        r=n%10;
        System.out.print(r+" ");
        n=n/10;
    }
}    
}
