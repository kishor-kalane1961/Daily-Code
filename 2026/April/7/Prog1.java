/*
 *	Write a program to print the first N whole numbers (starting from 0).
 * */

import java.util.Scanner;

class WholeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
