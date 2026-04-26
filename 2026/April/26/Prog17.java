import java.io.*;
class Demo{

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a Strng: ");
		String str = br.readLine();


		System.out.println(str.indexOf('a'));

	}
}
