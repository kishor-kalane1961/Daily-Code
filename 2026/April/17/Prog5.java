import java.util.*;

class Demo {
    public static void main(String[] args) {

        String names[] = {"Kishor", "Rahul", "Amit", "Sneha"};

        Arrays.sort(names);

        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}