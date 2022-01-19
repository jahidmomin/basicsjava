package com.java.basics2;

//multiple inheritance achieved using interface

interface Draw{
//	interface cannot have constructors
	void draw();
}

interface Draw3D{
	void draw3D();
}

class Rectangle implements Draw,Draw3D{

	@Override
	public void draw() {
		System.err.println("Recnatngle Drawn");
	}

	@Override
	public void draw3D() {
		System.err.println("renacnge 3D drwan");
	}
	
}



public class InterfaceDemo2 {
	public static void main(String[] args) {
		Rectangle  rectangle=new Rectangle();
		rectangle.draw();
		rectangle.draw3D();
	}
}
