import java.io.*;
class Product{
	void showProduct(String name,int id, double price){
		System.out.println("Show details of Product: ");
		System.out.println("Name of Product: "+name);
		System.out.println("Id of Product: "+id);
		System.out.println("Price of Product: "+price);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter name of product: ");
		String name = br.readLine();
		System.out.print("Enter id of Product: ");
		int id = Integer.parseInt(br.readLine());
		System.out.print("Enter price of Product: ");
		double price = Double.parseDouble(br.readLine());

		Product obj = new Product();
		obj.showProduct(name,id,price);

	}
}
/*
show details of product:
Enter name of product: Pen
Enter id of Product: 123
Enter price of Product: 5
Name of Product: Pen
Id of Product: 123
Price of Product: 5.0
 * */
