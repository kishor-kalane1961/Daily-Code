import java.io.*;
class IODemo{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Society name: ");
                String socName = br.readLine();

                System.out.println("Enter wing: ");
                char wing = br.readLine();

                System.out.println("Name: "+socName);
                System.out.println("Wing: "+wing);
        }
}
