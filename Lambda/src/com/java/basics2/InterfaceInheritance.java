package com.java.basics2;


//interface inheritance
//reusabikity
//2 interface extends.

//parent
interface Manish{
	void eat();
}

//child
interface Trupti extends Manish{
	void run();
}

class Impl implements Trupti{

	@Override
	public void eat() {
		System.err.println("eat");
	}

	@Override
	public void run() {
		System.err.println("run");
	}
	
}


public class InterfaceInheritance {
	public static void main(String[] args) {
		Impl impl=new Impl();
		impl.eat();
		impl.run();
	}
}
