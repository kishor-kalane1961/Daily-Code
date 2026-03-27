import java.util.*;
class DoWhile{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice;
        do{
            System.out.println("1 : c");
            System.out.println("2 : cpp");
            System.out.println("3 : Python");
            System.out.println("4 : Java");
            System.out.println("5 : DSA");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("C language selected");
            }
            else if(choice == 2){
                System.out.println("Cpp language selected");
            }
            else if(choice == 3){
                System.out.println("Python language selected");
            }
            else if(choice == 4){
                System.out.println("Java language selected");
            }
            else if(choice == 5){
                System.out.println("DSA language selected");
            }
            else{
                System.out.println("Wrong Input");
            }
        }while(choice == 0);
    }
}
