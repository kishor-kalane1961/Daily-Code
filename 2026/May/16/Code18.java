import java.util.*;

class Demo{

	int x;
	int y;
	Demo(){
		this(50,100);
		this("Kanha");
		System.out.println("No - Arg Constructor");
		System.out.println(x);
		System.out.println(y);
	}
	Demo(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Para - Constructor");
	}
	Demo(String str){	
		System.out.println("Para String Constructor");
	}

	public static void main(String[] args){
	
		Demo obj = new Demo();
	}
}
