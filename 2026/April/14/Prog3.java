
import java.util.*;
class Demo{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of rows: ");
                int row = sc.nextInt();

                for(int i=1; i<=row; i++){
			char ch;
			if(i%3 == 1){
				ch = '#';
			}else if(i%3 == 2){
				ch = '@';
			}else{
				ch = '$';
			}
                        for(int j=1; j<=row; j++){
                                        System.out.print(ch+" ");
                        }
                        System.out.println();
                }

        }
}
