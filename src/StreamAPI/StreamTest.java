package StreamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    // 6
    public static void main(String[] args) {
        System.out.println("Использование Stream.dropWhile() и Stream.takeWhile():");
        testDropWhileAndTakeWhile();

        System.out.println("\n Использование Stream.ofNullable()");
        testOfNullable();
        System.out.println("\n Использование Stream.iterator():");
        testIterator();
    }


    public static void testDropWhileAndTakeWhile() {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println("Исходный поток" + list);
        List<Integer> list2 = list.stream()
                                .dropWhile(n -> n %2  == 1)
                                .collect(Collectors.toList());
        System.out.println("После вызова dropWhile(n -> n %2  == 1): " + list2);
        List<Integer> list3 = list.stream()
                                .takeWhile(n -> n %2  == 1)
                                .collect(Collectors.toList());

        System.out.println("После вызова takeWhile(n -> n %2  == 1):" + list3);
    }

    public static void testOfNullable() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2,"Two");
        map.put(3, "null");
        map.put(4, "Four");

    Set<String> nonNullValues = map.entrySet()
                                    .stream()
                                    .flatMap(e -> Stream.ofNullable(e.getValue()))
                                    .collect(Collectors.toSet());
    System.out.println("Отображение: " + map);
        System.out.println("Значения отличные от null: " + nonNullValues);

    }

    public static void testIterator() {
        List<Integer> list = Stream.iterate(1, n-> n <= 10, n -> n +1)
                                .collect(Collectors.toList());

        System.out.println("Целые цислв от 1 до 10 :" + list);
    }






}
