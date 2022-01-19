package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(20);
        marks.add(10);
        marks.add(11);
        marks.add(40);
        marks.add(80);
        marks.add(100);

        List<Integer> sorted = marks.stream().sorted().collect(Collectors.toList());
        System.err.println(sorted);
        List<Integer> ints = marks.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> intr = marks.stream().map(i -> i * 100).collect(Collectors.toList());
        long intsCount = marks.stream().filter(i -> i % 2 == 0).count();
        System.err.println(intsCount);

        // descending
        List<Integer> Customsorted = marks.stream().sorted((i, j) -> (i < j) ? 1 : (i > j) ? -1 : 0)
                .collect(Collectors.toList());
        System.out.println(Customsorted);

        List<Integer> Customsorted2 = marks.stream().sorted((i, j) -> j.compareTo(i)).collect(Collectors.toList());
        System.out.println("-" + Customsorted2);

        System.err.println(ints);
        System.err.println(intr);

        var x = 10;
        System.out.println(x);

        List<String> names = new ArrayList<>();
        names.add("asdsad");
        names.add("adsad");
        names.add("adsd");
        names.add("                 ");
        names.add("  ");

        List<Integer> evenNo = List.of(2, 4, 6, 8, 10);

        Predicate<Integer> isEven = no -> no % 2 == 0;

        // koi ek mila tabhi true
        System.out.println(evenNo.stream().anyMatch(no -> isEven.test(no)));

        // check all
        System.out.println(evenNo.stream().allMatch(no -> isEven.test(no)));

        System.err.println(names.stream().filter(String::isBlank).count());
        var i = 1;
        Stream<User> stream = names.stream().map(name -> {
            System.err.println(name);
            return new User(i + 1, name);
        });

        stream.forEach(s -> {
            System.out.println(s.getId() + " " + s.getName());
        });

        List<User> list = new ArrayList<User>();


        User user = new User(1, "jahid");
        Address address = new Address();
        address.setAddress("pune");
        Street street = new Street();
        street.setStreetName("ABC Street");
        address.setStreetName(street);
        user.setAddress(address);


        Optional<User> optional = Optional.ofNullable(user);
//		Address result=optional.flatMap(User::getAddress);
//		System.err.println(result);
    }
}
