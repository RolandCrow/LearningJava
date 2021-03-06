package Collections;

import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> emptyList = List.of();
        List<Integer> luckyNumber = List.of(19);
        List<String> vowels = List.of("A", "B", "I","O", "U");

        System.out.println("emptyList = " + emptyList);
        System.out.println("singletonList = " + luckyNumber);
        System.out.println("vowels = " + vowels);

        try {
            List<Integer> list = List.of(1,2, null, 3);
        } catch (NullPointerException e) {
            System.out.println("Наличие null в List.of() запрещено");
        }

        try {
            luckyNumber.add(8);
        } catch (UnsupportedOperationException e) {
            System.out.println("Удалить невозможно");
        }
    }




}
