package StreamAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp1 {
    public static void main(String[] args) {
        Stream<Phone1> phone1Stream = Stream.of(new Phone1("iPhone 6 S", "Apple", 600 ),
        new Phone1("Lumia 950", "Microsoft", 500  ),
                new Phone1("iPhone 5 S", "Apple", 450),
        new Phone1("Lumia 640", "Microsoft",200 ));

        Map<String, List<Phone1>> phonesByCompany = phone1Stream.collect(
                Collectors.groupingBy(Phone1::getCompany));
        for(Map.Entry<String, List<Phone1>> item: phonesByCompany.entrySet()) {
            System.out.println(item.getKey());
            for(Phone1 phone1 : item.getValue()) {
                System.out.println(phone1.getName());
            }
            System.out.println("");

        }

    }
}

class Phone1 {

    private String name;
    private String company;
    private int price;
    public Phone1(String name,String comp,  int price) {
        this.name = name;
        this.company = comp;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
   public String getCompany() {
        return company;
   }
}