import java.io.*;
class Demo{

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a message: ");
		String msg = br.readLine();

		String str1 = "Hello";
		String str2 = msg.substring(0,5);

		System.out.println(str1.equalsIgnoreCase(str2));
			
	}
}
