/*
 *	Check Whether Character is Vowel or consonent
 * */

import java.util.*;

class VowelOrConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase to simplify checking
        ch = Character.toLowerCase(ch);

        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a Vowel");
            } else {
                System.out.println("It is a Consonant");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
    }
}
/*
 *	Output:
 *	kishor@hp:~/java26/dailycodes/lec8$ java VowelOrConsonant
Enter a character: F
It is a Consonant
kishor@hp:~/java26/dailycodes/lec8$ java VowelOrConsonant
Enter a character: A
It is a Vowel
kishor@hp:~/java26/dailycodes/lec8$ java VowelOrConsonant
Enter a character: a
It is a Vowel
kishor@hp:~/java26/dailycodes/lec8$ java VowelOrConsonant
Enter a character: f
It is a Consonant
kishor@hp:~/java26/dailycodes/lec8$ java VowelOrConsonant
Enter a character:
3
Invalid input. Please enter an alphabet.
 * */
