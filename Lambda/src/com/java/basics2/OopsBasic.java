package com.java.basics2;

class Parent {
	protected int a;

	void m1() {
		System.err.println("Parent Method");
	}
}

class Child extends Parent{
	int b;

	void m1() {
		super.m1();
		System.err.println("Child Method"+super.a);
	}
}

public class OopsBasic {
	public static void main(String[] args) {
		Child child=new Child();
		
		child.a=100;
		
		System.out.println(child.a);
		System.out.println(child.b);
		child.m1();
	}
}
