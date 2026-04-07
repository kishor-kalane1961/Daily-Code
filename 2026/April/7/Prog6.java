/*
 *	Write a program to print the first N three-digit numbers.
 * */

import java.util.Scanner;

class ThreeDigitWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 100;

        while(count < n) {
            System.out.print(num + " ");
            num++;
            count++;
        }
    }
}
