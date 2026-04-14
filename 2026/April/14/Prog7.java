import java.util.*;
class Demo{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of rows: ");
                int row = sc.nextInt();

		
                for(int i=1; i<=row; i++){
                	int num = row;
			for(int j=1; j<=row; j++){
                                if(j%2==1){
                                        System.out.print((char)(64+num)+" ");
                                }else{
                                        System.out.print(num+" ");
                                }
				num--;
                        }
                        System.out.println();
                }

        }
}
