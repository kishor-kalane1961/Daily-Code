/*
 *	Write a Program to check whether the given number is divisible by 7 or not.
 * */

import java.util.Scanner;

class DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else {
            System.out.println("The number is not divisible by 7");
        }
    }
}
