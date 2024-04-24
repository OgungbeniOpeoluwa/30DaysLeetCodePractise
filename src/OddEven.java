import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class OddEven {

    public static int[] returnOddinZeroAndEvenInOne(int[] input) {
        return Arrays.stream(input).map(x-> {
            if(x %2 == 0)return 0;
            return 1;}).toArray();
    }
}
