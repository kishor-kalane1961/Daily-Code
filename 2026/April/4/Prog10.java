import java.util.Scanner;

class ResultCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double percent = sc.nextDouble();

        if (percent >= 75) {
            System.out.println("Passed: First class with distinction");
        } else if (percent >= 60) {
            System.out.println("Passed: First class");
        } else if (percent >= 50) {
            System.out.println("Passed: Second class");
        } else if (percent >= 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
