package Collections;

import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Set<Integer> emptyList = Set.of();
        Set<Integer> luckyNumber = Set.of(19);
        Set<String> vowels = Set.of("A", "B", "I","O", "U");

        System.out.println("emptyList = " + emptyList);
        System.out.println("singletonList = " + luckyNumber);
        System.out.println("vowels = " + vowels);

        try { // пробуем добавить
            Set<Integer> set = Set.of(1,2, null, 3);
        } catch (NullPointerException e) {
            System.out.println("Наличие null в Set.of() запрещено");
        }

        try {
            Set<Integer> set = Set.of(1,2,3,2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            luckyNumber.add(8);
        } catch (UnsupportedOperationException e) {
            System.out.println("Добавить элемент невозможно");
        }

        try {
            luckyNumber.remove(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("Удалить элемент невозможно");
        }



    }



}
