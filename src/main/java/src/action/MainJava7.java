package src.action;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Boxiong on 7/25/17.
 */
public class MainJava7 {
    public static List<Person> personList;
    static {
        personList = Arrays.asList(
                new Person("A","B",60),
                new Person("C","D",20)
        );
    }
    public static void main(String[] args) {
        printCond(personList, new Condition() {
            @Override
            public boolean isTrue(Person person) {
                return person.getAge() > 30;
            }
        });

    }

    private static void printCond(List<Person> peopleList, Condition cond) {
        for (Person p : peopleList) {
            if (cond.isTrue(p)) {
                System.out.println("LOL");
            }
        }
    }

}


