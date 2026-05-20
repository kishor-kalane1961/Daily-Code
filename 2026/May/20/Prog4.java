class Demo{
	int x = 10;
	Demo(){
		System.out.println("Demo Constructor");
	}
	void fun(){
		System.out.println("In fun Demo");
	}
}
class Memo{
	Memo(Demo obj){
		System.out.println("Memo Constructor");
		System.out.println(obj.x);
		obj.fun();
		System.out.println(obj);
	}
}
class Temo{
	public static void main(String[] args){
		Demo obj1 = new Demo();
		Memo obj2 = new Memo(obj1);
		System.out.println(obj1);
	}
}

