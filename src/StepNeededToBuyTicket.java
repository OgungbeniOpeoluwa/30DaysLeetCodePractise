import java.util.Arrays;

public class StepNeededToBuyTicket {

    public static int returnSecondsNeeded(int[] array, int k) {
        int numb = array[k];
        int counts = 0;
        while (numb >0){
            for(int count = 0; count < array.length;count++){
                if(array[count] == 0)continue;
                array[count]-=1;
                counts++;
            }
//            array = reduceArray(array);
//            System.out.println(Arrays.toString(array) );
//            count+=array.length;
           numb--;

        }
        return counts;
    }
    public static  int [] reduceArray(int [] values){
        return Arrays.stream(values).filter((x)->x>0)
//                .peek(System.out::println)
                .map((x)->x-1).toArray();
    }
}
