/*
	4
	3 3
	2 2 2
	1 1 1 1
*/

import java.io.*;

class TrianglePattern{

        void pattern(int row){
                int num = row;
                for(int i = 1; i<=row; i++){
                        for(int j = 1; j<=i; j++){
                                System.out.print(num+" ");
                                
                        }
                        System.out.println();
			num--;
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
