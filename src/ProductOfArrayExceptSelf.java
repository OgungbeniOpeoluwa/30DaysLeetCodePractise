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
        int count = 0;
        for (Integer values:N) {
            n.remove(values);
            array[count] = n.stream().reduce((u, y) -> u * y).get();
            n.add(values);
            count++;
        }
       array = value.stream().mapToInt(x-> x).toArray();
        return array;
    }


}
