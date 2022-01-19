package com.java.basics2;

interface java8IN{
//	java 8
//	default methods
//	aise methods jisko logic bhi rhega.
//	interface public
	
//	default methods
	default void sayhello() {
		System.err.println("Default method from java 8");
	}
	
// static methods
	static int sum(int a,int b) {
		return a+b;
	}
}

class Impl8 implements java8IN{
	
}



public class Interface8Demo {
	public static void main(String[] args) {
		Impl8 impl8=new Impl8();
		impl8.sayhello();
		
		
//		class ke naam se call
//		interface ke naam se call
		System.err.println(java8IN.sum(10,49));
		
	}
}
