import java.sql.SQLOutput;
import java.util.*;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductOfArrayExceptSelf {

    public static int[] returnProductInArray(int[] array) {
        List<Integer>  N = new ArrayList<>(Arrays.stream(array).boxed().toList());
        List<Integer> n = new ArrayList<>(N);
        List<Integer> value = new ArrayList<>();
        int [] m;
        for (Integer values:N) {
            n.remove(values);
            value.add(n.stream().reduce((u, y) -> u * y).get());
            n.add(values);
        }
       m = value.stream().mapToInt(x-> x).toArray();
        return m;
    }


}
