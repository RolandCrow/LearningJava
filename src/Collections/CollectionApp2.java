package Collections;


import java.util.TreeSet;

public class CollectionApp2 {
    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<String>();
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Великобритания");
        System.out.printf("В списках %d элементов \n", states.size());
        states.remove("Германия");
        for (String state: states) {
            System.out.println(state);
        }



    }


}
// 116