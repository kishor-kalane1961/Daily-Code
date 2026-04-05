import java.io.*;
class FlatDemo{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Society name: ");
                String socName = br.readLine();

                System.out.println("Enter wing: ");
                char wing = br.readLine().charAt(0);

		System.out.println("Enter FlatNo: ");
                int flatNo = Integer.parseInt(br.readLine());

		System.out.println("Details: ");
                System.out.println("Soc Name: "+socName);
                System.out.println("Wing: "+wing);
		 System.out.println("FlatNo: "+flatNo);
        }
}
