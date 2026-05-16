import java.util.*;

class Demo{

	int x;
	int y;
	Demo(){
		this(150,200);
		System.out.println("No - Arg Constructor");
		System.out.println(x);
		System.out.println(y);
	}
	Demo(int x, int y){
		this();
		this.x = x;
		this.y = y;
		System.out.println("Para - Constructor");
	}

	public static void main(String[] args){
	
		Demo obj = new Demo(50,100);
	}
}
