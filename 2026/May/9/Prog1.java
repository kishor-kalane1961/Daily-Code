/*
	1
	2 3
	4 5 6
	7 8 9 10
*/

import java.io.*;

class TrianglePattern{

	void pattern(int row){
		int num = 1;
		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=i; j++){
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
