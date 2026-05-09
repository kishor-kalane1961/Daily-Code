/*
	1 2 3 4
	2 3 4
	3 4
	4
*/

import java.io.*;

class TrianglePattern{

        void pattern(int row){
                
                for(int i = 1; i<=row; i++){
			int num = i;
                        for(int j = 1; j<=row-i+1; j++){
                                System.out.print(num+" ");
                                num++;
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
