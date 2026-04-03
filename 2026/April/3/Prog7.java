/*
 *	WAP to create calculator using a switch case take a two number from user also take operator in switch case
 * */

import java.util.*;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
	     case '%':
                System.out.println("Result = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}

/*
 *	Output:
 *
 *	kishor@hp:~/java26/dailycodes/lec8$ java Calculator
Enter first number: 8
Enter second number: 0
Enter operator (+, -, *, /, %): /
Error: Cannot divide by zero
kishor@hp:~/java26/dailycodes/lec8$ java Calculator
Enter first number: 7
Enter second number: 8
Enter operator (+, -, *, /, %): -
Result = -1.0
kishor@hp:~/java26/dailycodes/lec8$ java Calculator
Enter first number: 5
Enter second number: 6
Enter operator (+, -, *, /, %): *
Result = 30.0
 * */
