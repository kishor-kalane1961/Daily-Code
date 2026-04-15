/*
 * 	WAP to find out the maximum betwenn two distinct numbers.
 */

import java.util.Scanner;

class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
    		System.out.println(a+" is maximum between" + a+','+b);
	} else if (b > a) {
    		System.out.println(b+" is maximum between" + a+','+b);
	} else {
    		System.out.println("Both numbers are equal");
	}
    }
}
