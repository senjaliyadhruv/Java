import java.util.Scanner;
class switch1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("        ***let's try your luck***\nenter any number 1 to 3");
        int choice=s.nextInt();

        switch(choice){
            case 1: System.out.println("you are most unfavourable guy.");
                    break;
            case 2:System.out.println("Use your Middle Finger");  
                    break;
            case 3:System.out.println("you are mistake of 19 year.");   
                   break;
                   default:System.out.println("chutiya "+choice+" is not valid");                  
                   break;
        }

    }
}