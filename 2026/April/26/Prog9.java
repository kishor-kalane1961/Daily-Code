import java.io.*;
class ArrayDemo{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of Array: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.print("Enter elements of Array: ");
		for(int i = 0; i<size; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i = 0; i<size; i++){
                        System.out.print(arr[i]+" ");
                }
		System.out.println();
	}
}
