import java.io.*;
class Demo{

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a String: ");
		String str = br.readLine();

		int count = 0;
		for(int i = 0; i<(str.length()-1);i++){
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
    				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				count += 1;
			}
		}
		System.out.println("Count of vowels: "+count);
	}
}
