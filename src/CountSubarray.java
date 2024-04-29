import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSubarray {

    public static long returnMaxSubarray(int[] array, int k) {
        int result = max(array);
        long results = 0;

        for (int index = 0; index < array.length; index++) {
            int [] copyArray = Arrays.copyOfRange(array,index,array.length);
            results += getNumberOfSubarrayInArray(copyArray,result,k);

        }
        return results;
    }

    public static int max(int [] array){
       return Arrays.stream(array).max().getAsInt();
    }
    public static long getNumberOfSubarrayInArray(int[] array, int max,int k){
        int count = array.length;
        int [] temporaryArray = new int[array.length];
        long result = 0;

        while(temporaryArray.length >= k) {
            temporaryArray = Arrays.copyOf(array,count);
            long numberOfTimesMaxAppear = Arrays.stream(temporaryArray).filter((x) -> x == max).count();
            if(numberOfTimesMaxAppear >= k)result++;
            count--;
        }
        return result;
    }
}
