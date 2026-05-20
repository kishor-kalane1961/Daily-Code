class Demo{
	int x = 10;
	Demo(){
		System.out.println("Demo Constructor");
	}
	void fun(){
		System.out.println("In fun Demo");
		System.out.println(x);
	}
}
class Memo{
	Memo(){
		System.out.println("No-Arg Memo Constructor");
	}
	Memo(Memo obj){
		System.out.println(this);
		System.out.println("Para Memo Constructor");
	}
}
class Temo{
	public static void main(String[] args){
		Demo obj1 = new Demo();
		Memo obj2 = new Memo();
		Memo obj3 = new Memo(obj2);
		System.out.println(this);
	}
}
