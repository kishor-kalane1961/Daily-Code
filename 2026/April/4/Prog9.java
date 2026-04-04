/*
 *	WAP to verify age of the voter where the age should be positive ,which means no negative values are allowed.(Solve using if else & take interger input from user)
 * */

import java.util.Scanner;

class VoterAgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age! Age cannot be negative.");
        }
        else if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
