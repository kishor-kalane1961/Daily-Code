class Demo{
	int x = 10;	//Instance Variable
	static int y = 20; 	//Static variable
	
	void fun(){	//Instance Method
		System.out.println("In fun method");
	}
	
	static void run(){	//Static method
		System.out.println("In run method");
	}
	public static void main(String[] args){
		// Memory allocation
		Demo obj = new Demo();
	}
}
