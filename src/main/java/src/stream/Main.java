package src.stream;

import src.action.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main {
    public static List<Person> personList;
    public static List<Integer> intArr = Arrays.asList(1 ,2, 3, 4, 5, 6, 7, 8, 9, 10);

    static {
        personList = Arrays.asList(
                new Person("A", "B", 60),
                new Person("C", "D", 20)
        );
    }
    public static void main(String[] args) {
//        personList.stream()
//                .filter(p -> p.getAge() > 20)
//                .forEach(System.out::println);
//
//
//        System.out.println(
//        intArr.stream()
//                .filter( a -> a % 2 == 1)
//                .mapToInt(a -> a*2)
//                .sum()

//        );

        convertListToMap();
    }

    public void streamFilter() {
        intArr.stream().filter(e -> e % 2 == 0);


    }
    // The following function described 2 different concepts:
    // Map and reduce;
    //
    // Map transform values.
    //
    // Reduce operation:
    // 1. Brings values togather. It crosses the swimlanes.
    // 2. Tranform a set of value into a single value.
    public void steamMap() {
        intArr.stream()
                .mapToInt(e -> e * 2)
                .sum();
    }


    // Collect
    public void streamCollect() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

        // doube the even value and put them into the list.
        // THE WRONG WAY:



        List<Integer> doubleTheEvens = new ArrayList<>();

        numbers.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .forEach(e -> doubleTheEvens.add(e));
        // Mutability is OK, Sharing is OK, but sharing the mutability is not OK.

        System.out.println(doubleTheEvens);// DO NOT do this. It has the protential of losing data.

        // Now is the correct one.

        List<Integer> doubleTheEven2 = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(e -> e * 2)
                .collect(toList());

    }


    // Creating a map using grouping
    public static void convertListToMap() {
        // Key: first name + last name Value: person obj.
//        List<Person> personList = new Person().createPersons();
////        System.out.println(
////                personList.stream()
////                        .collect(toMap(
////                                person -> person.getFirstName() + "-" + person.getLastName(),
////                                person -> person
////                        ))
////        );
//
//        // Key: First Name. Value: Last Name and then conver the map to a list.
//        System.out.println(
//                personList.stream()
//                .collect(groupingBy(Person::getFirstName, toList()))
//        );
//
//        // similar with the previous list.
//        // Key: first name Value: only the age
//        System.out.println(
//                personList.stream()
//                .collect(groupingBy(Person::getFirstName,
//                        mapping(Person::getAge, toList())))
//        );
//
//        personList.stream().collect(reducing(0, Person::getAge, Integer::sum));
//        personList.stream().map(Person::getFirstName).collect(joining(", "));

    }






}

