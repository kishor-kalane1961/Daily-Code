import java.io.*;
class IODemo{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Your name: ");
                String name = br.readLine();
                System.out.println(name);
        }
}
