package src.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {

    static Optional<Person> person;
    static Optional<Person> personMayNull;

    static {
        person = Optional.of(new Person("First", "last", 9));
        personMayNull = Optional.ofNullable(null);
    }

    public static void main(String[] args) {
//        System.out.println(getCarInsuranceNameOpt(person).orElse("NOT FOUND"));
        System.out.println(getCarInsuranceName(person));

        person.filter(person -> person.getAge() > 10)
                .ifPresent(System.out::println);

    }

    public static String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                     .flatMap(Car::getInsurance)
                     .map(Insurance::getName)
                     .orElse("else content");
    }
    public static Optional<String> getCarInsuranceNameOpt(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                     .flatMap(Car::getInsurance)
                     .map(Insurance::getName);
    }

    public static int readAgeLessThan(Person person, int threshold) {
        return Optional.ofNullable(person)
                .map(Person::getAge)
                .filter(x -> x > threshold)
                .orElse(0);
    }
}
