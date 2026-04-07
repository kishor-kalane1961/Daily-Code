/*
 *	Write a program to print the first N 3-digit numbers.
 * */

import java.util.Scanner;

class ThreeDigitNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int num = 100;

        for(int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            num++;
        }
    }
}
