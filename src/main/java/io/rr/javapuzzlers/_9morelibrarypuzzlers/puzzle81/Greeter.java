package io.rr.javapuzzlers._9morelibrarypuzzlers.puzzle81;

public class Greeter {
    public static void main (String[] args) {
        String greeting = "Hello world";
        for (int i = 0; i < greeting.length(); i++)
//            System.out.write(greeting.charAt(i));
            System.out.print(greeting.charAt(i));
    }
}
