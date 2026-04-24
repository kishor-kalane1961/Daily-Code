class Demo{
	static void fun(){
		System.out.println("In fun");
	}
	public static void main(String[] args){
		Demo.fun();
		Demo obj = new Demo();
		obj.fun();
		fun();
	}
}
