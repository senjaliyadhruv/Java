
//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
import java.util.*;

class twoDarrEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers of row: ");
        int row = s.nextInt();
        System.out.println("Enter the numbers of row: ");
        int colm = s.nextInt();
        int[][] number = new int[row][colm];
        System.out.println("enter values: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                number[i][j] = s.nextInt();
            }
        }
        System.out.println("Which number do you want to find? ");
        int x=s.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<colm;j++){
                if(number[i][j]==x){
                    System.out.println("number is found at index ("+i+","+j+")");
                }
            }
        }
    }
}