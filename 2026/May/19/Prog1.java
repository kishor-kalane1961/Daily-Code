class Demo{
	int x =10;
	static int y = 20;

	Demo(){
		System.out.println("No - Arg Constructor");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(y);
	}
}

