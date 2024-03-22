import java.util.Arrays;

public class SumOfEven {

    public static int[] returnArraySumOfEven(int[] numb, int[][] quries) {
        int [] result = new int[numb.length];
        for(int n = 0; n < quries.length;n++){
            numb = returnEvenNumb(numb,quries[n]);
            int even = evenNumber(numb);
            result[n] = even;
        }
        System.out.println(result);
        return result;
    }
    private static  int[]  returnEvenNumb(int [] value, int [] quries){
        int n = value[quries[1]] + quries[0];
        value[quries[1]] = n;
        return value;
    }
    public static int evenNumber(int [] value){
      return   Arrays.stream(value).filter(x->x % 2==0).reduce(Integer::sum).orElse(0);
    }
}
