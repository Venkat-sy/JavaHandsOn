import java.util.*;

class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char s = sc.nextLine().charAt(0); // take first character

        if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ||
            s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U') {
            System.out.println("Character is a vowel");
        } else {
            System.out.println("Character is not a vowel");
        }
    }
}
