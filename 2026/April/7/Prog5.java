/*
 *	Write a program to print multiplication table of N in reverse order.
 * */

import java.util.Scanner;

class ReverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        for(int i = 10; i >= 1; i--) {
            System.out.print(n * i + " ");
        }
    }
}
