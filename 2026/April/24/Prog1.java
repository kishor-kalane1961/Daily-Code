class Demo{
	int x = 10;
	static int y = 20;

	void fun(){
		System.out.println("In fun");
	}

	static void gun(){
		System.out.println("In gun");
	}

	public static void main(String[] args){
		
		System.out.println(x);
		System.out.println(y);
		fun();
		gun();
	}
}
