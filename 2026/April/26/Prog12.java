import java.io.*;
class Demo{

        public static void main(String[] args)throws IOException{
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a string: ");
		String str = br.readLine();
		System.out.print("Enter index of character which do u want:");
		int in = Integer.parseInt(br.readLine());

		System.out.println("Character at index "+in+" is "+str.charAt(in));
	}
}
