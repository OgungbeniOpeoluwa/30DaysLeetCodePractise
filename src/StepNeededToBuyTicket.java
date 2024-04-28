import java.util.Arrays;

public class StepNeededToBuyTicket {

    public static int returnSecondsNeeded(int[] array, int k) {
        int numb = array[k];
        int counts = 0;
        while (numb >0){
            for(int count = 0; count < array.length;count++){
                if(array[count] == 0)continue;
                if(array[k] == 0 )break;
                array[count]-=1;
                counts++;
            }
            numb--;

        }
        return counts;
    }

}
