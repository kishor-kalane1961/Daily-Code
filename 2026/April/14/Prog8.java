import java.util.*;
class Demo{

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of rows: ");
                int row = sc.nextInt();

                for(int i=1; i<=row; i++){
                        int num = row;
			for(int j=1; j<=row; j++){
                                if(i%2==1){
                                        char ch = (char)(64+num);
                                        System.out.print(ch+""+j+" ");
                                }else{
					char ch = (char)(64+j);
                                        System.out.print(ch+""+(row-j+1)+" ");
                                }
				num--;
                        }
                        System.out.println();
                }

        }
}
