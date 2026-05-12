class Demo{
	int x = 10;

	Demo(){
		System.out.println(x);
		System.out.println("In Constructor");
	}
	Demo(int x){
		this();
		System.out.println(x);
		System.out.println(this.x);
		System.out.println("In Para Constructor");
	}
	public static void main(String[] args){
		Demo obj = new Demo(50);
	}
		
}
