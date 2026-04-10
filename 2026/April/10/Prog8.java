

import java.util.*;

class ArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		int[] arr =new int[size];

		System.out.println("Enter Array elements: ");
		for (int i=0; i<5; i++){
                        arr[i] = sc.nextInt();
                }

		System.out.println("Array elements: ");
		for (int i=0; i<5; i++){
			System.out.println(arr[i]);
		}	
	}
}
