package StreamAPI;

import java.util.Arrays;

public class StreamApp3 {
    public static void main(String[] args) {
        Phone3[] phones3 = new Phone3[]{new Phone3("iPhone 6 S", 54000),
                new Phone3("Lumia 950", 45000),
                new Phone3("Samsung Galaxy S 6", 40000),
                new Phone3("LG G 4", 32000)};
        Arrays.parallelSetAll(phones3, i-> {
            phones3[i].setPrice(phones3[i].getPrice()-10000);
            return phones3[i];
        });




    }
}


class Phone3 {

    private String name;
    private int price;
    public Phone3(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }}

