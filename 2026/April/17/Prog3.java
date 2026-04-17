import java.util.*;

class Demo {
    public static void main(String[] args) {

        String names[] = {"Kishor", "Rahul", "Amit", "Sneha"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String name : names) {
            if (name.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Name found");
        else
            System.out.println("Name not found");
    }
}