import java.util.ArrayList;
import java.util.List;

public class BitCounting {
    public static int countBits(int n){

        List<Integer> numbers = new ArrayList<>();

        int number = n;

        while(number >= 1) {
        numbers.add(number%2);
        number /= 2;
        }

        return Math.toIntExact(numbers
                .stream()
                .filter((x) -> x != 0)
                .count());
    }
}
