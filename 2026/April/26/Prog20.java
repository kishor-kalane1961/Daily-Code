import java.io.*;
class Demo{

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter a str1: ");
                String s1 = br.readLine().intern();


                System.out.print("Enter a str2: ");
                String s2 = br.readLine().intern();


		System.out.println(s1 == s2);

	}
}
