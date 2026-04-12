import java.io.*;
class Demo{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter number of rows alphabet: ");
                int row  = Integer.parseInt(br.readLine());

                for(int i=1; i<=row; i++){
                        char ch = 'a';
                        for(int j=1; j<=row; j++){
                                System.out.print(ch+"\t");
                                ch++;
                        }
                        System.out.println();
                }
        }
}
