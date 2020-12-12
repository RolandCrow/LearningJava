package UserMethods;

import java.util.Arrays;

public class MyClass4 {
    public static void main(String[] args) {
        String result = "";
        result = print(new int[] {1,2,3,4,5}, ";");
        System.out.println(result);

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = changeArr(arr1, 2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

    public static String print(int[] a, String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length; i++) {
            sb.append(String.valueOf(a[i]));
            if(i != a.length - 1) sb.append(s);
        }
        return sb.toString();
    }

    public static int[] changeArr(int[] a, int x) {
        int[] arr = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            arr[i] = a[i] * x;
        }
        return arr;
    }
}
