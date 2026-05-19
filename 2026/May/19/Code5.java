class Demo{
	static int x = 20;
	static{	
		System.out.println("Static Block1");
	}
	Demo(){	
		System.out.println("Constructor");
	}
	static{	
		System.out.println("Static Block2");
	}

	public static void main(String[] args){

		System.out.println("In main");
		Demo obj = new Demo();
		
	}
}
