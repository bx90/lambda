package src.methodreference;

import src.action.Person;

import java.util.*;
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
                new Person("C", "D", 20)
        );
    }

    public static void main(String[] args) {
        Collections.sort(personList, Comparator.comparing(Person::getFirstName).reversed());

        printCond(personList, p -> true, p -> System.out.println(p.toString()));
//        printCond(personList, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p.toString()));
        printCond(personList, p -> p.getFirstName().startsWith("A"), System.out::println); // If there is only one parameter, then it's equal to the top one.


    }

    // The arguments are Object list; Condition; Action.
    private static <T> void printCond(List<T> peopleList, Predicate<T> predicate, Consumer<T> consumer) {
        for (T p : peopleList) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
    // a simple comparator
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}


