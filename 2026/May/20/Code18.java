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

class Memo{
	Memo(Demo obj){
		System.out.println("Para Constructor");
		System.out.println(x);
		fun();
	}
}

class Temo{

	public static void main(String[] args){
		Demo obj1 = new Demo();
		Memo obj3 = new Memo(obj1);
	}
}
