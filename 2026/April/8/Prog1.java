import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter num: ");
		int n = Integer.parseInt(br.readLine());

		System.out.print("Enter the String: ");
                String name = br.readLine();

		System.out.print("Enter the float: ");
		float n1 = Float.parseFloat(br.readLine());

		System.out.print("Enter the Character: ");
                char ch = (char)br.read();
		br.skip(1);

		System.out.println("Display num:"+n);
		System.out.println("Display String:"+name);
		System.out.println("Display Float:"+n1);
		System.out.println("Display Char:"+ch);
	}
}
		
