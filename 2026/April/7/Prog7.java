/*
 *	Write a program to print numbers divisible by 4 or 7 within a given range.
 * */

import java.util.Scanner;

class DivisibleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range from: ");
        int start = sc.nextInt();

        System.out.print("Enter range to: ");
        int end = sc.nextInt();

        int i = start;

        while(i <= end) {
            if(i % 4 == 0 || i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
