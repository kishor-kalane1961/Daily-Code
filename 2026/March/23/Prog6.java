import java.util.Scanner;

class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        float height = sc.nextFloat();
        char grade = sc.next().charAt(0);

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
