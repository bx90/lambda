package src.forloop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by Boxiong on 7/25/17.
 */
public class Main {
    public static List<Person> personList;

    static {
        personList = Arrays.asList(
                new Person("A", "B", 60),
                new Person("E", "F", 30),
                new Person("C", "D", 20)
        );
    }

    public static void main(String[] args) {
        Collections.sort(personList, Comparator.comparing(Person::getFirstName).reversed());

        printCond(personList, p -> true, p -> System.out.println(p.toString()));
//        printCond(personList, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p.toString()));
        printCond(personList, p -> p.getFirstName().startsWith("A"), System.out::println); // If there is only one parameter, then it's equal to the top one.

        Collections.sort(personList, Comparator.comparing(Person::getFirstName));
        personList.forEach(System.out::println);
    }

    // The arguments are Object list; Condition; Action.
    private static <T> void printCond(List<T> peopleList, Predicate<T> predicate, Consumer<T> consumer) {
        for (T p : peopleList) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}


