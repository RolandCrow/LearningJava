package Collections;

import java.util.*;

public class MyClass2 {
    public static void main(String[] args) {
        List<Integer> arr = new LinkedList<Integer>();
        arr.add(20);
        arr.add(0, 10);
        arr.add(arr.size(), 30);
        System.out.println(arr.toString());
        System.out.println(arr.get(1));
        arr.set(1,88);
        System.out.println(arr.toString());
        arr.sort(null);
        System.out.println(arr.toString());
        arr.sort(Collections.reverseOrder());
        System.out.println(arr.toString());
        for(Integer item: arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        arr.forEach(elem -> System.out.print(elem + " "));
        System.out.println();
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        ListIterator<Integer> it2 = arr.listIterator();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
        System.out.println();
        ListIterator<Integer> it3 = arr.listIterator(arr.size());
        while (it3.hasNext()) {
            System.out.print(it3.previous() + " ");
        }
        System.out.println();
        int x = 0;
        for(int i = 0, j = arr.size(); i < j; i++) {
            x = arr.get(i);
            x *= 2;
            arr.set(i, x);
        }
        System.out.println(arr.toString());


    }
}
