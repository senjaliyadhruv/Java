import java.util.*;

class VowelOrConsonant {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter the character ");
        Scanner s = new Scanner(System.in);
        ch = s.next().charAt(0);

        if (ch == 'a' ||ch == 'A' ||ch == 'e' ||ch == 'E' ||ch == 'i' ||ch == 'I' || ch =='o' || ch =='O' ||ch == 'u' || ch =='U') {
            System.out.println("Entered number is Vowel");
        } else {
            System.out.println("Entered number is Consonant");
        }
    }

}
