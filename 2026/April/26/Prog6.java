import java.io.*;

class Laptop{

	String brand;
	int ram;
	double price;

	void setDetails(String b,int r, double p){
		brand = b;
		ram = r;
		price = p;
	}

	void displayDetails(){
		System.out.println("\nLaptop Details: ");
		System.out.println("Brand of Laptop: "+brand);
		System.out.println("RAM of Laptop: "+ram);
		System.out.println("Price of Laptop: "+price);
	}
	static void calculateGST(double price){
		double gst = price*0.18;
		System.out.println("\nTotal price including GST: "+(price+gst));
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter brand of Laptop:");
		String brand = br.readLine(); 
		System.out.print("Enter RAM of Laptop:");
		int ram = Integer.parseInt(br.readLine());
		System.out.print("Enter price of Laptop:");
		double price = Double.parseDouble(br.readLine());

		Laptop l = new Laptop();
		l.setDetails(brand,ram,price);
		l.displayDetails();
		calculateGST(price);
	}
}
