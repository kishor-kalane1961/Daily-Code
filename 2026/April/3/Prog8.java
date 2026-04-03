/*
 *	Calculate profit or loss WAP to take selling Price & making price
 * */

import java.util.*;
class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            System.out.println("Profit = " + profit);
        }
        else if (cp > sp) {
            double loss = cp - sp;
            System.out.println("Loss = " + loss);
        }
        else {
            System.out.println("No Profit No Loss");
        }
    }
}

/*
kishor@hp:~/java26/dailycodes/lec8$ java ProfitLoss
Enter Cost Price: 60
Enter Selling Price: 70
Profit = 10.0
kishor@hp:~/java26/dailycodes/lec8$ java ProfitLoss
Enter Cost Price: 54
Enter Selling Price: 98
Profit = 44.0
kishor@hp:~/java26/dailycodes/lec8$ java ProfitLoss
Enter Cost Price: 100
Enter Selling Price: 100
No Profit No Loss
 * */
