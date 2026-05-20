class Demo{

	int x =10;
	Demo(){
		System.out.println("In Demo Constructor");
	}
	void fun(){
		System.out.println("In fun-Demo");
		System.out.println(x);
	}
	public static void main(String[] args){
		Demo obj1 = new Demo();
		//1.Memory Allocation
		//2.Demo(obj)
		obj1.fun();
		//obj.fun(obj)
	}
}
