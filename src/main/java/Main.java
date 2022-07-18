import java.util.function.IntUnaryOperator;

public class Main {

	// write the nextOddNum here
    @FunctionalInterface
    interface NextOddNum {
        int applyAsInt(int x);
    }
    
    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        // My code
        NextOddNum nextOddNum = (int x) -> {
            if (x % 2 == 0) {
                return x + 1;
            }
            return x + 2;
        };

        // one liner:
        // NextOddNum nextOddNum = (int x) -> (x % 2 == 0) ? x + 1 : x + 2;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
}

