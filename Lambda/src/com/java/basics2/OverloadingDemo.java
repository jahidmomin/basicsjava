package com.java.basics2;

public class OverloadingDemo {
	
	
//	overloading
	
	
	int add(int a,int b){return a+b;}
	
	int add(int a,int b,int c){return a+b+c;}

	
	public static void main(String[] args) {
		OverloadingDemo demo=new OverloadingDemo();
		System.err.println(demo.add(1,2));
		System.err.println(demo.add(1,2,3));
	}
}
