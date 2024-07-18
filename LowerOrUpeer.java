import java.util.*;
class LowerOrUpeer {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter any character:- ");
    char ch=s.next().charAt(0);

    if(ch>='A'&&ch<='Z'){
        ch=Character.toLowerCase(ch);
        System.out.println("Lowercase "+ch);
    }else{
        ch=Character.toUpperCase(ch);
        System.out.println("Uppercase "+ch);
    }
}    
}
