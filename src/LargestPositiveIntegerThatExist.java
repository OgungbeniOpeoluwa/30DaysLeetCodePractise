import java.util.Arrays;

public class LargestPositiveIntegerThatExist {

    public static int findMax(int[] array) {
      int value =   Arrays.stream(array).filter(x-> x < 0).min().getAsInt();
      int positiveValue = value * (-1);
        for (int number:array) {
            if(number == positiveValue) return number;
        }
      return -1;
    }
}
