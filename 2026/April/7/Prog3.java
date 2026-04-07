/*
 *	Write a program to print all even numbers from 1 to N.
 * */

import java.util.Scanner;

class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        for(int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
