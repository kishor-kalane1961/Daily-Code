/*
 *	Write a program to print countdown of days until assignment deadline.
 */

import java.util.Scanner;

class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days: ");
        int day = sc.nextInt();

        while(day > 0) {
            System.out.println(day + " days remaining");
            day--;
        }

        System.out.println("0 days - Assignment is Overdue");
    }
}
