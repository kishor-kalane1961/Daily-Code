/*
                        	10
                	10      9
        	9       8       7
	7       6       5       4
*/

import java.io.*;

class TrianglePattern{

        void pattern(int row){

		int num = 9;
                for(int i = 1; i<=row; i++){

			num = num+1;
                        for(int sp = 1; sp<=row - i; sp++){
                                System.out.print("\t");
                        }

                        for(int j = 1; j<=i; j++){
                                System.out.print(num+"\t");
                                num--;
                        }
                        System.out.println();
                }
        }

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of rows: ");
                int row = Integer.parseInt(br.readLine());

                TrianglePattern tp = new TrianglePattern();
                tp.pattern(row);
        }
}
