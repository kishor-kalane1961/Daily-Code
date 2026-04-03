/*
 * WAP to check whether a character is uppercase or Lowercase
 * */

import java.util.*;
class UppercaseLowercaseCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a charcter: ");
		char ch = sc.next().charAt(0);

		if(ch>='a'&& ch<='z'){
			System.out.println(ch+" is in Lower case");
		}else if(ch>='A' && ch<='Z'){
			System.out.println(ch+" is in Upper Case");
		}else{
			System.out.println(ch+" is not alphabet");
		}
	}
}
/*
 * kishor@hp:~/java26/dailycodes/lec8$ java UppercaseLowercaseCheck
Enter a charcter: t
t is in Lower case
kishor@hp:~/java26/dailycodes/lec8$ java UppercaseLowercaseCheck
Enter a charcter: A
A is in Upper Case
kishor@hp:~/java26/dailycodes/lec8$ java UppercaseLowercaseCheck
Enter a charcter: 4
4 is not alphabet
kishor@hp:~/java26/dailycodes/lec8$ java UppercaseLowercaseCheck
Enter a charcter: *
* is not alphabet
* */
