class Demo{
	static int x =10;
	int y = 20;

	static{
		System.out.println("Static block");
	}
	{
		System.out.println("Instance Block 1");
	}
	Demo(){
		System.out.println("In Constructor");
	}
	{
		System.out.println("Instance Block 2");
	}
	void fun(){
		System.out.println("In Fun");
	}
	static void gun(){
		System.out.println("In Gun");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		gun();
		obj.fun();
	}
}


