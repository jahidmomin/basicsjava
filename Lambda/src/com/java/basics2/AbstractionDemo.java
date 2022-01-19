package com.java.basics2;

//achoieve abstraction.
//parent class
abstract class DemoAbstract{
	private String name;
	
	public abstract void sayHello() ;//method without implemenation
	
	public DemoAbstract(String name) {
		this.name=name;
		System.err.println("Demo Abstarct "+name);
	}
}

//logic dena pdega
//child class
class ChildDemo extends DemoAbstract{

	public ChildDemo(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.err.println("Hello I am with Logic");
	}
	
}


//main class

public class AbstractionDemo {
	public static void main(String[] args) {
//		DemoAbstract abstract1=new DemoAbstract(); cannot craerte object
		ChildDemo childDemo=new ChildDemo("jahid");
		childDemo.sayHello();
	}
}
