package com.java.basics;


final class ADemo{
//	when we create a final variable at that time we need to iniliaze(value set krna pdegi)
	final int a=10;
	final float PI=3.1f;
	
	public final void sayHello() {
		System.err.println("Hello");
	}
	
//	overloading
	public final void sayHello(int a,int b) {
		System.err.println(a+b);
	}
}

//overriding
//1] same name same method
//2] inhertance.child class duplicate method with diff logic.
//Cannot override the final method from ADemo
//class Child extends ADemo{
//	public void sayHello(int a,int b) {
//		System.err.println(a-b);
//	}
//}


//when we use final keyword on class then what happedn ??
//it cannot be inherit.



public class FinalDemo {
	public static void main(String[] args) {
		ADemo aDemo=new ADemo();
//		aDemo.a=299; ek bar jo value iniltiaze ki wahi rhegi..constant
		System.err.println(aDemo.a);
		System.err.println(aDemo.PI);
		aDemo.sayHello();
		aDemo.sayHello(10,30);
	}
}
