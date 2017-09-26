package src.basic;

public class Main {

    public static void main(String[] args) {
        GreetingFunction greetingFunction = () -> System.out.println("Hello World!");
//        basic.GreetingFunction addFunction = (int a, int b) -> a + b;
        greetingFunction.foo();
    }

}

interface GreetingFunction {
    void foo();
//    int add(int a, int b);
}

