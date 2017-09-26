package src.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Boxiong on 7/25/17.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    List<Person> createPersons() {
        return Arrays.asList(
                new Person("A", "B", 20),
                new Person("A", "D", 10),
                new Person("A", "X",80),
                new Person("D", "B", 20),
                new Person("L", "n", 20)
        );
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
