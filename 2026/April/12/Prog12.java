
import java.io.*;
class Pattern{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows: ");
		int row = Integer.parseInt(br.readLine());

		for(int i=1; i<=row; i++){
			if(i%2!=0){
				int ch = 'A'+row-1;
				int num = row-1;
				for(int j=1; j<=row; j++){
					if(j%2!=0){
						System.out.print((char) ch+" ");
						ch=ch-2;
					}else{
						System.out.print(num+" ");
						num = num-2;
					}
				}
			}else{
				int ch = 'A';
				int num = 2;
				for(int j=1; j<=row; j++){
                                        if(j%2!=0){
                                                System.out.print((char) ch+" ");
                                                ch=ch+2;
                                        }else{
                                                System.out.print(num+" ");
                                                num = num+2;
                                        }
                                }
			}
			System.out.println();
		}
	}
}
