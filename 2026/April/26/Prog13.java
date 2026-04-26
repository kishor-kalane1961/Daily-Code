import java.io.*;
class Demo{

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String 1: ");
		String str1 = br.readLine();
		System.out.println("Enter String 2: ");
                String str2 = br.readLine();

		if(str1.equalsIgnoreCase(str2)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}
}
