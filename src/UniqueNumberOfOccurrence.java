import java.util.Arrays;
import java.util.HashMap;

public class UniqueNumberOfOccurrence {

    public static boolean uniqueOccurrence(int[] array) {
        HashMap<Integer,Long>value = new HashMap<>();
        for (int numb:array) {
            if(value.containsKey(numb))continue;
            long result = Arrays.stream(array).filter(y -> numb == y).count();
            if (value.containsValue(result))return false;
            value.putIfAbsent(numb,result);
        }

        return true;
    }
}
