import java.io.*;
class Stringlen{

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter username: ");
		String username = br.readLine();

		System.out.println(username.length());
	}
}
