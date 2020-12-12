package Collections;

import java.util.HashSet;

public class CollectionApp1 {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<String>();
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        System.out.printf("В списке %d элементов \n", states.size());
        for(String state: states) {
            System.out.println(state);
        }

        states.remove("Германия");
        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("Mike"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for(Person p: people) {
            System.out.println(p.getName());

        }    }


    static class Person {
        private final String name;
        public Person(String value) {
            name = value;
        }
        String getName() {return name;}
    }
}
