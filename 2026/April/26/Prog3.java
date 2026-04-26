import java.io.*;

class Book{
	String title;
	String author;
	double price;
	void setDetails(String t, String a, double p){
		title = t;
		author = a;
		price = p;
	}
	void displayDetails(){

		System.out.println();
		System.out.println("Details of Book: ");
		System.out.println("Title of Book: "+title);
		System.out.println("Author of Book: "+author);
		System.out.println("Price of Book: "+price);
	}
	static void applyDiscount(double price){
		double dis = price*0.10;
		System.out.println("Discount on Book: "+dis);
		System.out.println("Final price og book after discount: "+(price-dis));

	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Title of Book: ");
		String title = br.readLine();
		System.out.print("Enter Author of Book: ");
		String author = br.readLine();
		System.out.print("Enter Price of Book: ");
		double price = Double.parseDouble(br.readLine());

		Book b = new Book();
		b.setDetails(title,author,price);
		b.displayDetails();
		applyDiscount(price);	

	}
}
