package com.java.basics2;


//every java class internally inhert from Object

class Bike{
	private int bikeNo;
	private String bikeName;
	private double bikePrice;
	
	public Bike() {
		System.err.println("Default Constructor 1");
	}

	public Bike(String name) {
		// its a special type of method
		// it calls when we create object.	
		//default constructer
		
//		it never returns
//		not has return datatype
//		it name same as class Name
//		if constructer is private then we cant create object of construter from outside world.
//		goal-> to initliaze fields/variables/states of class.
		this();
		System.err.println("Param Construtor "+name);
	}
	
	
	
//	parameterized constructor
	public Bike(int bikeNo, String bikeName, double bikePrice) {
	
//		super();//Object default constrictor call krne ke liye.
		this("jahid");//custom constrcyer of this class this()
		this.bikeNo = bikeNo;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
		
	}


	public int getBikeNo() {
		return bikeNo;
	}

	public void setBikeNo(int bikeNo) {
		this.bikeNo = bikeNo;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public double getBikePrice() {
		return bikePrice;
	}

	public void setBikePrice(double bikePrice) {
		this.bikePrice = bikePrice;
	}

	private void incresePrice() {
		this.bikePrice+=1000;
		System.err.println("Increserd");
	}
	
	public void incprice() {
		this.incresePrice();
	}
	
//	getter setter
	
	public String getAll() {
		return this.bikeName+" "+this.bikeNo+" "+this.bikePrice;
	}
	
}




public class ConsutructerDemo {
	public static void main(String[] args) {
		Bike bike=new Bike(123,"Bike 1",23000);//iniliaze value
		System.err.println(bike.getAll());
	}
}
