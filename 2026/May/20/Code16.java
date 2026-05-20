class Demo{

	Demo(){
		System.out.println("Constructor");
	}
	Demo(int x){
		System.out.println("Para - Constructor");
	}
	public static void main(String[] args){
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);
	}
}
