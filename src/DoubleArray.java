import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DoubleArray {

    public static int[] returnTwiceTheArray(int[] input) {
        int [] arrays = new int [input.length*2];
       for(int count =0; count<input.length;count++){
           arrays[count] = input[count];
           arrays[input.length+count] = input[count] * 2;

       }
       return arrays;
    }

}