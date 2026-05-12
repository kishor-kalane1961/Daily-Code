class Demo{

	Demo(){
		System.out.println(this);
		System.out.println("In Constructor");
	}
	void fun(){
		System.out.println(this);
		System.out.println("In Fun");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		//System.out.println(obj.x);
		//System.out.println(obj.y);
		obj.fun();
		System.out.println(obj);

	}
		
}
