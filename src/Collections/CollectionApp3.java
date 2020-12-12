package Collections;

import java.util.ArrayDeque;

public class CollectionApp3 {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<String>();
        states.add("Франция");
        states.add("Германия");
        states.push("Великобритания");
        String sFirst = states.getFirst();
        String sLast = states.getLast();
        while (states.peek() != null) { // извлечение с начала
            System.out.println(states.pop());
        }

        System.out.printf("Размер очереди: %d \n", states.size());
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        for(Person p: people) {
            System.out.println(p.getName());
        }


    }


}
class Person {
    private String name;
    public Person(String value) {
        name = value;
    }
    String getName() {return  name;}
}
