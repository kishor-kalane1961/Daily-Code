class Demo{
	static int x = 10;
	static{
		System.out.println("Static block1");
	}
	Demo(){
		System.out.println("In Constructor");
	}
	static{
		System.out.println("Static block2");
	}
	public static void main(String[] args){
		System.out.println("In main");
		Demo obj = new Demo();
	}
}

