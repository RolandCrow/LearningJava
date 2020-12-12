package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NewStream {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList(Arrays.asList("Париж", "Лондон", "Мадрид"));
        Stream<String> citiesStream = cities.stream();
        citiesStream = citiesStream.filter(s-> s.length()==6);
        citiesStream.forEach(System.out::println);


        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5,6,7});
        intStream.forEach(System.out::println);
        LongStream longStream = Arrays.stream(new long[] {100,200,300,400,5843787,237});
        longStream.forEach(System.out::println);
        DoubleStream doubleStream = Arrays.stream(new double[] {3.4, 6.7, 9.5, 8.2345,121 });
        doubleStream.forEach(System.out::println);





    }
}
