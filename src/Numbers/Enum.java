package Numbers;

import java.awt.*;

public class Enum {

    public static void main(String[] args) {
        Color color1,color2;
        color1 = Color.RED;
        color2 = Color.BLACK;

        if(color1 == Color.RED) {
            System.out.println("color1 == RED");
        }

        if(color1 != color2) {
            System.out.println("color1 != color2");
        }
        System.out.println(color1);

    }


    enum Color {RED, BLUE, GREEN, BLACK};

}
