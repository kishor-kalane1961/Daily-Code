/*
 *	Write a program to print numbers divisible by both 4 and 5 in a given range.
 * */

import java.util.Scanner;

class DivisibleBy4And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range from: ");
        int start = sc.nextInt();

        System.out.print("Enter range to: ");
        int end = sc.nextInt();

        // Always make start <= end
        if(start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int i = start;

        while(i <= end) {
            if(i % 4 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
