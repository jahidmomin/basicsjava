package com.java.basics;

public class ControlStatments {

    public static void main(String[] args) {
//		if 
//		if else
//		if else if
//		switch
//		while
//		do while
//		for loop
//		Array
//		for each

//		if (condition) {
//			//block execute				
//		}else {
//			//block execute
//		}

        String color = "red";
        if (color == "green") {
            System.out.println("Matched");
        } else {
            System.err.println("Not matched");
        }


        /*
         * student-> percentge percentage <35 =>"failed"
         * percentage >35 and <65 ->"Third G"
         * percentage >65 and <85 -> "second G"
         * percentage >85 and <100 ->"first G"
         */

        int per = 35;
        if (per <= 35) {
            System.err.println("Failed");
        } else if (per > 35 && per <= 65) {
            System.out.println("THIRD GRADE");
        } else if (per > 65 && per <= 85) {
            System.out.println("Second GRADE");
        } else if (per > 85 && per <= 100) {
            System.out.println("First GRADE");
        }

        int day = 1;
        switch (day) {
            case 0:
                System.err.println("Sunday");
                break;
            case 1:
                System.err.print("Monday");
                break;
        }

        System.out.println("-----------");
        String days = "sun";
        switch (days) {
            case "sun":
                System.err.println("Sunday");
                break;
            case "mon":
                System.err.print("Monday");
                break;
        }


        int no = 1000;
        switch (no / 2) {
            case 100:
                System.err.println("100");
                break;
            case 500:
                System.err.print("500");
                break;
        }


        /*
         * int per=35; if (per<=35) { System.err.println("Failed"); }else if(per>35 &&
         * per <=65) { System.out.println("THIRD GRADE"); }else if(per>65 && per <=85) {
         * System.out.println("Second GRADE"); }else if (per >85 && per <=100) {
         * System.out.println("First GRADE"); }
         */

        int p = 35;
        switch (per) {
            case 35:
                System.err.println("Failed");
                break;
            case 65:
                System.err.print("Third Grade");
                break;
        }


        System.out.println("ControlStatments.main()");

    }
}
