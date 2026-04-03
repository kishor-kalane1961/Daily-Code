/*
 *	WAP to find out positive, Negative & Zero Numbers.
 */

import java.util.*;

class PositiveNegativeCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int num  = sc.nextInt();

		if(num>0){
			System.out.println("Number is Positive");
		}else if(num<0){
                        System.out.println("Number is Negative");
                }else{
                        System.out.println("Number is Zero");
                }
	}
}
/*
 *	Output:
kishor@hp:~/java26/dailycodes/lec8$ java PositiveNegativeCheck
Enter Number: 78
Number is Positive
kishor@hp:~/java26/dailycodes/lec8$ java PositiveNegativeCheck
Enter Number: -34
Number is Negative
kishor@hp:~/java26/dailycodes/lec8$ java PositiveNegativeCheck
Enter Number: 0
Number is Zero
 */
