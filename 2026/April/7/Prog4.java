/*
 * 	Write a program to print multiplication table of N.
 */

import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");
        }
    }
}
