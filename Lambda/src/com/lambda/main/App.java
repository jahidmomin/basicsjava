package com.lambda.main;

import com.lambda.interfaces.FunctionalInterfaceDemo;


public class App {
    public static void main(String[] args) {
//		functional interface is a only one abstract methods
//		Runnable,Callable

//		Old Traditional Way
//		FunctionalInterfaceDemo demo=new FunctionalInterfaceDemo() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("Hello How r u?");
//				
//			}
//		};

//		new way using lambda expressions
        FunctionalInterfaceDemo demo = () -> System.out.println("Hello Dear");

        demo.sayHello();
    }
}
