package com.java.basics;

public class ArrayBasics {
    public static void main(String[] args) {

        int[] myIntArray;//array initiliaze

        myIntArray = new int[10];

        System.err.println(myIntArray);


        float[] myFloatArr;
        myFloatArr = new float[10];

        System.err.println(myFloatArr);

        char[] myCharArr;
        myCharArr = new char[10];


        System.err.println(myCharArr);

        //set krna

        myIntArray[0] = 10;
        myIntArray[2] = 40;
        myIntArray[3] = 10;
        myIntArray[4] = 60;
        myIntArray[5] = 10;


//	access krna//get krna
//	System.err.println(myIntArray[0]);
//	System.err.println(myFloatArr[0]);
        System.err.println("---------------");

        for (int index = 0; index < myIntArray.length; index++) {
            System.err.println(myIntArray[index]);
        }
        System.err.println("---------------");

        myFloatArr[8] = 100.0f;
        for (int index = 0; index < myFloatArr.length; index++) {
            System.err.println(myFloatArr[index]);
        }
        System.err.println("---------------");
//	predefined methods-> length.
        System.err.println(myIntArray.length);

//	for each loop
        System.err.println("---------------");
        for (int tempVariable : myIntArray) {
            System.err.println(tempVariable);
        }

        //access specifier
        //oop
    }
}
