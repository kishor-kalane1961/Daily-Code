class Demo{
	int x;
	int y;
	
	Demo(){
		System.out.println("In COnstructor");
	}

	public static void main(String[] args){
		Demo obj1 = new Demo();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
	}
}
