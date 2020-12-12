package Lambdas;

interface Expression1 {
    boolean isEqual(int n);
}

class ExpressionHelper {
    static boolean isEven(int n) {
        return n%2 == 0;
    }
    static boolean isPositive(int n) {
        return n > 0;
    }
}

public class LambdaApp2 {
    public static void main(String[] args) {
        int[] nums = { -5, -4,-3,-2,-1,0, 1,2,3,4,5};
        System.out.println(sum(nums, ExpressionHelper::isEven));
        System.out.println(sum(nums, ExpressionHelper::isPositive));
    }
    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for(int i: numbers) {
            if(func.isEqual(i))
                result += i;
        }
        return result;
    }

}

