package com.java.basics2;
//private fileds 

class Car{
	private int carNo;

//	getter
	public int getCarNo() {
		return carNo;
	}

//	setter
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	
}


public class EncapsulationDemo {
	public static void main(String[] args) {
		Car c=new Car();
//		c.carNo?
		System.err.println(	c.getCarNo());
		c.setCarNo(100);
		
		System.err.println(c.getCarNo());
	}
}
