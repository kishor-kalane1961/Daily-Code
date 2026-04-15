/*
 *	Write a Program to check whether the given number is divisible by 2,5 and 10 or not, if not then print message "Is  not di	  visible by 2,5 and 10"
 * */

import java.util.Scanner;

class DivisibleBy2_5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 5 == 0 && num % 10 == 0) {
            System.out.println(num + " is divisible by 2, 5 and 10");
        } else {
            System.out.println(num + " is not divisible by 2, 5 and 10");
        }
    }
}
