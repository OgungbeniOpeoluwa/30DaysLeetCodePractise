import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicateInAnArray {

    public static List<Integer> findDuplicates(int[] array) {
        List<Integer> value = new ArrayList<>();
       int [] arrays = Arrays.stream(array).sorted().toArray();
       for(int count = 0; count< array.length;){
           if(count+1 == array.length)break;
           if(arrays[count] == arrays[count+1]){
                   value.add(arrays[count]);
                   count+=2;
                   continue;}
           count++;
       }
       return value;
    }

}
