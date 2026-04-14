
import java.util.*;
class Demo{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of rows: ");
                int row = sc.nextInt();

                for(int i=row; i>=1; i--){
                        for(int j=1; j<=row; j++){
				if((row-i)%2==0){
					char ch = (char)(65+i-1);
					System.out.print(ch+" ");
				}else{
					System.out.print(i+" ");
				}
                        }
                        System.out.println();
                }

        }
}
