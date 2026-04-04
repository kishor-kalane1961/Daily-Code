/*
 *	A student who have passed his 12th standard exam , thinks he might get marks up to 85 percent. Suggest a better career feild depending upon the marks assumption.
 * */

import java.util.Scanner;

class CareerSuggestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        double marks = sc.nextDouble();

        if (marks >= 85) {
            System.out.println("Suggested Field: Engineering / Medical / IT");
        }
        else if (marks >= 70) {
            System.out.println("Suggested Field: Commerce / Management / IT");
        }
        else if (marks >= 50) {
            System.out.println("Suggested Field: Arts / Design / Vocational Courses");
        }
        else {
            System.out.println("Focus on skill-based courses or reattempt exams");
        }

    }
}
