
import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = new String(sc.next());
		System.out.println(str);

		System.out.println("ChatAt: "+str.charAt(0));
		System.out.println("toUpperCase: "+str.toUpperCase());
		System.out.println("toLowerCase: "+str.toLowerCase());
		System.out.println("length: "+str.length());
		System.out.println("equals: "+str.equals("kishor"));
		System.out.println("Contains: "+str.contains("sho"));
		System.out.println("Substring: "+str.substring(1,4));
		System.out.println("Replace: "+str.replace('K','C'));
		System.out.println("LastIndexOf: "+str.lastIndexOf('i'));
		System.out.println("IsEmpty: "+str.isEmpty());
		str = str.concat("Sinhgad");
		System.out.println(str);
		System.out.println("IdentityHashCode: "+System.identityHashCode(str));

	}
}
