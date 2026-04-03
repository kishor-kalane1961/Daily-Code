/*
 *	WAP to print day at a week take a number from user & prints according day using switch case
 * */

import java.util.*;

class Day{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number in between 1 to 7 according to day print: ");
		int day = sc.nextInt();

		switch(day){
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
                                System.out.println("Monday");
                                break;
			case 3:
                                System.out.println("Tuesday");
                                break;
			case 4:
                                System.out.println("Wednesday");
                                break;
			case 5:
                                System.out.println("Thursday");
                                break;
			case 6:
                                System.out.println("Friday");
                                break;
			case 7:
                                System.out.println("Ssturday");
                                break;
			default:
				System.out.println("Enter number 1 to 7");
		}
	}
}
/*
 * 	Output: 
 *kishor@hp:~/java26/dailycodes/lec8$ java Day
Enter a number in between 1 to 7 according to day print:
6
Friday
kishor@hp:~/java26/dailycodes/lec8$ java Day
Enter a number in between 1 to 7 according to day print:
3
Tuesday
 * */
