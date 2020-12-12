package Generalize;

import java.util.Scanner;

public class GenericPairDemo2 {
    public static void main(String[] args) {
        Pair<Integer> secretPair = new Pair<>(42,24);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        Pair<Integer> inputPair = new Pair<>(n1, n2);
        if(inputPair.equals(secretPair)) {
            System.out.println("You guessed the secret words");
            System.out.println("in thr correct order!");
        } else  {
            System.out.println("You guessed incorrect");
            System.out.println("You guessed");
            System.out.println(inputPair);
            System.out.println("The secret words are");
            System.out.println(secretPair);
        }

    }
}
