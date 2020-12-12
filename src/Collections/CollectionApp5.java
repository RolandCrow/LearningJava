package Collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionApp5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> states = new TreeMap<>();
        states.put(10, "Германия");
        states.put(2, "Испания");
        states.put(14, "Франция");
        states.put(3,"Италия");

        String first = states.get(2);

        for(Map.Entry<Integer, String> item: states.entrySet()) {
            System.out.printf("Ключ: %d Значение: %s \n", item.getKey(), item.getValue());

        }

        Set<Integer> keys = states.keySet();
        Collection<String> values = states.values();

        Map<Integer, String> afterMap = states.tailMap(4);
        Map<Integer, String> beforeMap = states.headMap(10);
        Map.Entry<Integer, String> lastItem = states.lastEntry();
        System.out.printf("Последний элемент имеет ключ %d значение %s", lastItem.getKey(), lastItem.getValue());

        Map<String, Person2> people = new TreeMap<>();
        people.put("1240i54", new Person2("Tom"));
        people.put("1240i55", new Person2("Bill"));
        people.put("1240i56", new Person2("Nick"));

        for(Map.Entry<String, Person2> item : people.entrySet()) {
            System.out.printf("Ключ: %s Значение: %s\n", item.getKey(), item.getValue());
        }
    }


}

class Person2 {
    private String name;
    public Person2(String value) {
        name = value;
    }
    String getName() {return  name;}
}


