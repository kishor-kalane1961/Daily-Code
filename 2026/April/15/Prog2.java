/*
 *	Write a Program to check whethere the given number is less than 10 or greater than 10.(Take integer input from user)
 * */

import java.util.Scanner;

class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 10) {
            System.out.println("The number is less than 10");
        } else if (num > 10) {
            System.out.println("The number is greater than 10");
        } else {
            System.out.println("The number is equal to 10");
        }
    }
}
