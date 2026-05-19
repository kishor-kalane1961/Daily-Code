class Demo{
	static int x = 20;
	static{	
		System.out.println("Static Block1");
	}
	{
		System.out.println("Instance Block");
	}
	Demo(){	
		System.out.println("Constructor");
	}
	void fun(){	
		System.out.println("In fun");
	}
	static void gun(){
		System.out.println("In gun");
	}
	public static void main(String[] args){
		System.out.println("In main");
		gun();
		Demo obj = new Demo();
		obj.fun();
	}
}
