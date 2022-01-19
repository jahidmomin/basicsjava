package com.java.basics;

public class LoopDemo2 {

    public static void main(String[] args) {

//		for(iniliaze;condition;incre/decre) {
//			
//		}

//		int j=1;
//		while(j<=2) {
//		
//			j++
//		}

        for (int j = 1; j <= 2; j++) {
            System.err.println(j);//12
        }


        for (int k = 10; k >= 0; k--) {
            System.err.println(k);//109
        }

//		1-15 -> even no
        System.err.println("--------------------------");
        for (int l = 1; l <= 15; l++) {
//			System.err.println(l);
            if (l % 2 == 0) {
                System.err.println(l);
            }
        }

    }
}
