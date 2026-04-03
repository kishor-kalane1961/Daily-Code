/*
 *	WAP to print number InRange, Range is given by user
 *	test case: Range should be in assending Order 
 */

import java.util.*;

class InRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter Second number: ");
                int num2 = sc.nextInt();

		System.out.print("Numbers in Range: ");
		if(num2>num1){
			for(int i = num1; i<=num2; i++){
				System.out.print(i+" ");
			}
		}
		else{
			for(int i = num2; i<=num1; i++){
                                System.out.print(i+" ");
                        }
		}
		System.out.println();
	}
}
/*
 * 	Output: 
 kishor@hp:~/java26/dailycodes/lec8$ java InRange
Enter first number:
1
Enter Second number:
10
Numbers in Range: 1 2 3 4 5 6 7 8 9 10
kishor@hp:~/java26/dailycodes/lec8$ java InRange
Enter first number:
90
Enter Second number:
23
Numbers in Range: 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90
 */
