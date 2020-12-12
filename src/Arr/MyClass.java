package Arr;

public class MyClass {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        printArr(arr);
        printArr(new int[] {40, 50, 60});

    }
    public static void printArr(int [] a) {
        for(int i: a) {
            System.out.println(i);
        }
    }
}
