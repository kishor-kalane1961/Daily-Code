import java.util.*;
class Demo{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of rows: ");
                int row = sc.nextInt();

                for(int i=1; i<=row; i++){
			int ch = 97+i-1;
                        for(int j=1; j<=row; j++){
				System.out.print((char)ch+" ");
				ch++;
                        }
                        System.out.println();
                }

        }
}
