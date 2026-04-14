import java.util.*;
class Demo{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of rows: ");
                int row = sc.nextInt();

                for(int i=1; i<=row; i++){
                        for(int j=1; j<=row; j++){
                                if(i%2==1){
                                        System.out.print((char)(65+row-j)+" ");
                                }else{
                                        System.out.print((char)(65+j-1)+" ");
                                }
                        }
                        System.out.println();
                }

        }
}
