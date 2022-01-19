package com.java.basics;

public class DemoOperator {

    public static void main(String[] args) {

//		Operators
//		+ - / * unary operator
//		++ -- 
//		= ==
//		&& || ~  Logical Operators
//		=

        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(13 / 6);
        System.out.println(10 * 20);
        System.out.println(13 % 6);


        int a = 10;//assignment operator.to assign values.
        System.out.println(a > 9);
        System.out.println(a < 10);//10 <10 false
        System.out.println(a >= 10);
        System.out.println(a <= 10);
        System.out.println(a == 10);

//		variable+=30 => variable=variable+30

//		System.out.println(a+=10);//a=a+10 =>20
//		System.out.println(a-=10);//a=a-10 =>0
//		System.out.println(a*=10);//a=a*10 =>100
//		System.out.println(a/=10);//a=a/10 =>1
//		System.out.println(a%=10);//a=a%10 => 0


//		& | ~
        System.out.println("--------Anding Operation (*)-----------");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("--------Or Operation (+)-----------");
        System.out.println(true || true);  //1+1 =>1
        System.out.println(true || false);  //1+0 =>1
        System.out.println(false || true);  //0+1 =>1
        System.out.println(false || false); //0+0 =>0

        System.out.println("-------NOT Operation (!)-----------");
        System.out.println(!true);  //false
        System.out.println(!false); //true


//		++ --
//		Prefix -> ++10 , --10
//		Postfix -> 10++ ,10--

        int no = 5;

        System.out.println(++no); //??    no=no+1


//		System.out.println(no++); //??    no=no+1  //5  => +1 =>6

        System.err.println(no);


        int g = 100;
        g++; //g=100+1 //101
        --g;//100
        g--;//99
        System.out.println(g);//101


//		int no=300000;
//		no ++ ;
//		no --
//		-- no
//		no++


        int age = 18;

//		if age >18 -> you are eligible to vote else not eligible

//		if (age>18) {
//			System.out.println("You are eligible");
//		}else {
//			System.out.println("Not Eligible");
//		}

//		ternery operator
        String result = age >= 18 ? "You are eligible" : "Not Eligible";
        System.out.println(result);

//		

    }
}
