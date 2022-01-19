package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();//returns empty optional

        String str = null;
//		Optional<String> op=Optional.of(str);//it returns null pointer exception when value is not present in str
        Optional<String> op2 = Optional.ofNullable(str);//yeh wala null raha to empty optional return krta.
        System.err.println(op2.isEmpty());


//		List<String> list = List.of("\"some data aa raha hai\"","asdsad");
        List<String> list = null;
//		yahi kaaam jva 8 simple me krta ..
        List<String> listOpt = list != null ? list : new ArrayList<>();

//		aise code ..meaning ful ho gyaa.
        List<String> listopt = Optional.ofNullable(list).orElseGet(() -> new ArrayList<>());
        System.err.println(listOpt);
    }
}
