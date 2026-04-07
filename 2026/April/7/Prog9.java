/*
 *	Write a program to print cubes of first N natural numbers.
 * */

import java.util.Scanner;

class CubeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int i = 1;

        while(i <= n) {
            System.out.print((i * i * i) + " ");
            i++;
        }
    }
}
