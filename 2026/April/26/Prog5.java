import java.io.*;
class Car{
	void showDetails(String brand, String model, double price){
		System.out.println("\nCar Details:");
		System.out.println("Brand of Car:"+brand);
		System.out.println("Model of Car:"+model);
		System.out.println("Price of Car:"+price);
	
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		

		System.out.print("Enter brand of Car:");
		String brand = br.readLine();
		System.out.print("Enter model of Car:");
		String model = br.readLine();
		System.out.print("Enter price of Car:");
		double price = Double.parseDouble(br.readLine());

		Car c = new Car();
		c.showDetails(brand, model, price);

	}
}
