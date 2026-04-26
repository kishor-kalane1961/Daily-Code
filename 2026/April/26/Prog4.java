import java.io.*;
class Shoping{
	static void calculateDiscount(double amount){
		System.out.println("\nTotal amount: "+amount);
		double discount;
		if(amount>=5000){
			discount = amount*0.20;
		}else if(amount>=2000 && amount<5000){
			discount = amount*0.10;
		}else{
			discount = amount*0.05;
		}
		System.out.println("Discount amount is: "+discount);
		System.out.println("Total amount after discount:: "+(amount-discount));
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter amount: ");
		double amount = Double.parseDouble(br.readLine());

		calculateDiscount(amount);

	}
}
