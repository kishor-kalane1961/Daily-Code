import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        StringBuffer sb = new StringBuffer(input);
        sb.append(" - Modified");

        System.out.println("Result: " + sb);
    }
}