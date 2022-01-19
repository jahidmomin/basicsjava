package com.java.basics;

public class LoopingDemo {

    public static void main(String[] args) {
//		while
//		?
//		repeatedly work ->looping statments
        int i = 1;
        while (i <= 20) {

            if (i % 2 != 0) {
                System.out.println("ODD NO " + i);
            }

//			System.out.println(i);//12345678910
            i++;//23456789 10 11
        }


//		--------------------

//		do while
//		1..10
        System.err.println("-----------");
        int j = 1;//inilize
        do {
            System.out.println(j);
            j++;//inc/dec
        } while (j <= 10);


//		--------
        int k = 9;
        do {
            System.err.println("Run Once");
        } while (k == 0);

    }
}
