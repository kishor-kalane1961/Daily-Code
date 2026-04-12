import java.io.*;
class Demo{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of rows: ");
                int row = Integer.parseInt(br.readLine());

                for(int i=1; i<=row; i++){
                        for(int j=row; j<=(row+row-1); j++){
                                System.out.print((i+j)+"\t");
                        }
                        System.out.println();
                }
        }
}
