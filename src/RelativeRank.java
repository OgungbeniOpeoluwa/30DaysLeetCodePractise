import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RelativeRank {

    public static String[] findRelativeRank(int[] array) {
        List<Integer> sorted = sortPosition(array);
        String [] arrays = new String[array.length];
        for(int count = 0;count < array.length;count++){
            int number = array[count];
            int position = returnRankOfNumber(number,sorted);
            position+=1;
            if(position == 1) {
                arrays[count] = "Gold Medal";

            }
            else if(position == 2)arrays[count]="Silver Medal";
            else if(position == 3)arrays[count]= " Medal";
            else arrays[count] = String.valueOf(position);

        }
        System.out.println(Arrays.toString(arrays));
        return arrays;

    }

    private static  List<Integer> sortPosition(int[]array){
      List<Integer> array1 = Arrays.stream(array).sorted().boxed().toList();
      array1 = array1.reversed();
      return array1;
    }

    private static int returnRankOfNumber(int count,List<Integer> array){
        for(int counts= 0; counts < array.size();counts++){
            if(array.get(counts)==count)return counts;
        }
        return -1;
    }

}
