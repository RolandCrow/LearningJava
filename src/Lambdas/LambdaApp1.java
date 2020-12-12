package Lambdas;

public class LambdaApp1 {
    public static void main(String[] args) {
        Expression func = (n) -> n%2 == 0;
        int[] nums = {1,2,3,4,5,6,7,8,9,9};
        System.out.println(sum(nums, func));
    }

    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for(int i : numbers) {
            if(func.equals(i))
                result +=i;
        }
        return result;
    }
}

interface Expression {
    boolean isEqual(int n);
}
