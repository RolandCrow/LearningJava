package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionApp4 {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<>(); // ключ -значение
        states.put(1 ,"Германия");
        states.put(2 ,"Испания");
        states.put(4 ,"Франиция");
        states.put(3 ,"Италия");
        String first = states.get(2);
        System.out.println(first);
        Set<Integer> keys = states.keySet();
        Collection<String> value = states.values();
        states.replace(1, "Бельгия");
        states.remove(2);
        for(Map.Entry<Integer, String>  item: states.entrySet()) {
            System.out.printf("Ключ: %d Значение %s \n", item.getKey() ,item.getValue() );

        }

        Map<String, Person1> people = new HashMap<>();
        people.put("1240i54", new Person1("Tom"));
        people.put("1240i55", new Person1("Bill"));
        people.put("1240i56", new Person1("Nick"));


        for(Map.Entry<String, Person1> item: people.entrySet()) {
            System.out.printf("Ключ %s Значение %s\n", item.getKey(), item.getValue().getName());
        }
    }
}

class Person1 {
    private String name;
    public Person1(String value) {
        name = value;
    }
    String getName() {return  name;}
}
