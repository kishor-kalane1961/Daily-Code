
class Demo{

	int x;
	int y;
	Demo(){
		
		this(50,100);
		System.out.println(this);
		System.out.println("No - Arg Constructor");
		System.out.println(x);
		System.out.println(y);
	}
	Demo(int x, int y){
		this("Kanha");
		System.out.println(this);
		System.out.println(x);
		System.out.println(y);
		System.out.println(this.x);
		System.out.println(this.y);
		this.x = x;
		this.y = y;
		System.out.println("Para - Constructor");
	}
	Demo(String str){	
		System.out.println(this);
		System.out.println("Para String Constructor");
		System.out.println(str);
	}

	public static void main(String[] args){
	
		Demo obj = new Demo();
	}
}
