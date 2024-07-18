import java.util.Scanner;
class if_else {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number a:-");
        int a=s.nextInt();
        System.out.println("enter number b:-");
        int b=s.nextInt();

        if(a==b)
            System.out.println("a & b are equal");
        else if (a<b)
            System.out.println("a is lesser");  
        else 
        System.out.println("a is bigger");      
    }
}