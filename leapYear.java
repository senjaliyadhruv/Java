import java.util.*;

class leapYear {
    public static void main(String[] args) {
        System.out.println("Enter any number as year");
        Scanner s = new Scanner(System.in);
        int y;
        y = s.nextInt();

        if (y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.println("LEAP YEAR");
        } else
            System.out.println("Not LEAP YEAR");
    }
}
