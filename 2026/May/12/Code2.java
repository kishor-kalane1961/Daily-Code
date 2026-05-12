class Demo{

	int x = 10;
	int y = 20;

	Demo(){
		System.out.println("In Demo Constructor");
		System.out.println(this);
	}

	void fun(){
		System.out.println("In Fun");
	}

	public static void main(String[] args){
		Demo obj = new Demo();
		System.out.println(obj);
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
	}

}
