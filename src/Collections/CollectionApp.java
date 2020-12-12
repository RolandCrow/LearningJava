package Collections;

import java.util.LinkedList;

public class CollectionApp {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.addFirst("Испания");
        states.add(1,"Италия");
        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for(String state: states) {
            System.out.println(state);

        }
        if(states.contains("Германия")) {
            System.out.println("Список содержит слова Германия");
        }
        states.remove("Германия");
        states.removeFirst();
        states.removeLast();
        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1);
        for(Person p : people) {
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName());

    }

static class  Person {
        private String name;
        public Person(String value) {
            name = value;
        }
        String getName() {return name;}
}


}
