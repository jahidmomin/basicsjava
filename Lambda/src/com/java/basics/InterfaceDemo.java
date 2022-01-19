package com.java.basics;


interface IA{
//	all methods are abstract methods only
// all method are public , default or static
	
	void m1(); //=> public abstarct void m1() 
	
	int m1=100; //=> public static final int m1=100;
	
}

interface IB extends IA{
	
}

//class - class inherit -> extends
//class - interface inherit -> implements
//interface - interface ?-> extends.

class IAImplement implements IB{

	@Override
	public void m1() {
		System.err.println("Overriden Method");
	}
	
}


public class InterfaceDemo {
	public static void main(String[] args) {
		IAImplement iaImplement=new IAImplement();
		iaImplement.m1();
	}
}
