import java.io.*;
class Demo{

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String1: ");
		String str1 = br.readLine();
		System.out.println("Enter String2: ");
		String str2 = br.readLine();

		String str3 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str3.length());
	}
}
