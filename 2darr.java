//2D array
import java.util.*;
class twoDarr{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the numbers of row: ");
        int row=s.nextInt();
        System.out.println("Enter the numbers of colum: ");
        int colm=s.nextInt();
        int [][]number=new int[row][colm];
System.out.println("enter values: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                number[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
               System.out.print(number[i][j]+"  ");
            }
            System.out.println();
        }

    }
}