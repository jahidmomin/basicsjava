package com.lambda.main;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface FunctionalDemo {
    public void sayHello(String name);
}

@FunctionalInterface
interface FunctionalAddDemo {
    public int add(int no1, int no2);

    default String sayMyName() {
        return "Hello I am Default Method";
    }

    static void intro() {
        System.err.println("Hello I am Static");
    }
}


public class LambdaDemo {
    public static void main(String[] args) {
        FunctionalDemo lambda = (name) -> System.out.println("Hello How r u ? " + name);
        lambda.sayHello("Jahid");

        FunctionalAddDemo ref = (i, j) -> i + j;
        System.err.println(ref.add(10, 60));
        System.err.println(ref.sayMyName());
        FunctionalAddDemo.intro();

        Function<Integer, Integer> square = number -> number * number;
        System.err.println(square.apply(2));


        BiConsumer<Integer, String> bi = (no, name) -> System.out.println("Hello" + no + name);

        BiConsumer<Integer, String> bi2 = (no, name) -> System.out.println("Bye" + no + name);

        //and then ke andr wala BiConsumer Badme Call honga pehle Consumer ke baad.
        bi.andThen(bi2).accept(14, "jahid");

        /*
         * Represents an operation that accepts a single input argument and returns no
         * result.
         */
        Consumer<Integer> con = (i) -> System.out.println("consumer" + i);
        con.accept(19);

//		Represents a predicate (boolean-valued function) of one argument
//		negate() - its like not operator 
//		test is abstract method in this interface

        Predicate<Integer> isGreaterThanTen = i -> i >= 10;
        Predicate<Integer> isEven = i -> i % 2 == 0;

        System.err.println(isGreaterThanTen.negate().test(9));
        System.err.println(isGreaterThanTen.test(9));

//		and operator like work here
        System.out.println(isGreaterThanTen.and(isEven).test(11));

//		or operator like work here
        System.out.println(isGreaterThanTen.or(isEven).test(11));
    }
}
