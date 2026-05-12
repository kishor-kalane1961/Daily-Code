class Demo{

	int x = 10;
	Demo(){
		System.out.println("No-arg Constructor");
	}
	Demo(){
		System.out.println("Para- Constructor");
	}
	public static void main(String[] args){
		Demo obj1 = new Demo();
		//Demo obj2 = new Demo(10);
	}
}
