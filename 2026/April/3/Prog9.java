/*
 *	WAP to accepty three numbers from user & check whether they are in pythagorean trtiplet
 * */

import java.util.Scanner;
class PythagoreanTriplet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int n1 = a*a;
	int n2 = b*b;
	int n3 = c*c;

        // Check condition
        if ((n1+n2)==n3) {
        	System.out.println("It is a Pythagorean Triplet");
	}else if((n1+n3)==n2){
		System.out.println("It is a Pythagorean Triplet");
	}else if((n2+n3)==n1){
		System.out.println("It is a Pythagorean Triplet");
	}else{
                System.out.println("Not a Triplet");
	}
    }
}
/*
 *
 *kishor@hp:~/java26/dailycodes/lec8$ java PythagoreanTriplet
Enter first number: 2
Enter second number: 3
Enter third number: 5
Not a Triplet
kishor@hp:~/java26/dailycodes/lec8$ java PythagoreanTriplet
Enter first number: 3
Enter second number: 5
Enter third number: 4
It is a Pythagorean Triplet
 */
