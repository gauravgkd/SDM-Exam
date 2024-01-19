package com.exam;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		System.out.println("The Value of First Number Before Swapping "+a);
		
		int b = 15;
		
		System.out.println("The Value of Second Number Before Swapping : "+b);
		
		
		//Swapping two Numbers
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("The Value of First Number After Swapping : "+a);
		
		System.out.println("The Value of Second Number After Swapping : "+b);

	}

}
