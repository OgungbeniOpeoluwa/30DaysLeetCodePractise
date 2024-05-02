import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestPositiveIntegerThatExist {

    public static int findMax(int[] array) {
       List<Integer> r =  Arrays.stream(array).filter(x->x>0).boxed().toList();
       return Arrays.stream(array).filter(x->x<0).map(x->
      {int values = x*(-1);
          if(r.contains(values))return values;
          return -1;
      }).max().orElse(-1);
    }
}
