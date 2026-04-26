import java.io.*;
class Circle{

	void calculateArea(double r){
		double area = Math.PI*r*r;
		System.out.println("Area of cicle: "+area);
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter radius of circle: ");
		double r = Double.parseDouble(br.readLine());;

		Circle c = new Circle();
		c.calculateArea(r);

	}
}
