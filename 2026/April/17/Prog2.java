import java.util.*;

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // important

        String names[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();
        }

        System.out.println("Names entered:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}