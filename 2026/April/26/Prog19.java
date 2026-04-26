import java.io.*;
class Demo{

        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		System.out.print("Enter a str1: ");
		String s1 = br.readLine();

		System.out.print("Enter a str2: ");
                String s2 = br.readLine();

		if(s1.length() == s2.length()){
			int diff = 0;
			for(int i=0; i<s1.length();i++){
				if(s1.charAt(i)!=s2.charAt(i)){
					diff = Math.abs(s1.charAt(i)-s2.charAt(i));
					break;
				}
			}
			System.out.println("Difference: "+diff);
		}else{
			System.out.println("Length mismatch");
		}
 	}
}
