import java.io.*;
class Demo{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of rows: ");
                int row = Integer.parseInt(br.readLine());

                int num = row;
		for(int i=1; i<=row; i++){
                        for(int j=1; j<=row; j++){
                                System.out.print(num+"\t");
                        }
                        System.out.println();
			num--;
                }
        }
}
