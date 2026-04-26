import java.io.*;
class Demo{

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		
		System.out.print("Enter a String: ");
		String str = br.readLine();

		System.out.println("First: "+str.charAt(0));
		System.out.println("Last: "+str.charAt(str.length()-1));
 	}
}
