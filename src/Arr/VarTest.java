package Arr;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class VarTest {
    public static void main(String[] args) {
        var personId = 1001;
        System.out.println("personId= " + personId);

        var prompt = "Enter a message:";
        System.out.println("prompt= " + prompt);

        System.out.println("prompt.length() = " + prompt.length());
        System.out.println("prompt.substring(0,5) = " + prompt.substring(0,5));

        double salary = 1878.89;
        System.out.println("salary = " + salary);

        var luckyNumbers = List.of(9,19,1969);
        System.out.println("luckyNumbers = " + luckyNumbers);

        var cities = new String[] {"Atlanta", "Patna", "Paris", "Gaya"};
        System.out.println("cities = " + Arrays.toString(cities));
        System.out.println("cities.getClass() = "  + cities.getClass());

        System.out.println("\nList of cities using for a loop:");
        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println("\nList of cities using for-each a loop:");
        for(var city: cities) {
            System.out.println(city);
        }
        BiFunction<Integer, Long, Double> avg =
                (var n1, var n2) -> (n1 + n2) / 2.0;
        System.out.println("\nAverage of 10 and 20 is " + avg.apply(10, 20L));


    }
}
