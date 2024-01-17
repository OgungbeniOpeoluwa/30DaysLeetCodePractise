package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class OddlyPosition {

    public static int[] oddlyPosition(int[] array) {
        List<Integer> addOddlyPlace = new ArrayList<>();
        if(array.length == 1) return array;
        else {
            for (int count = 0; count < array.length; count++) {
                if (count % 2 == 0) {
                    addOddlyPlace.add(array[count]);
                }
            }
        }
        return convertArray(addOddlyPlace);
    }

    public static int [] convertArray(List<Integer> addedOddlyPlaceNumbers){
        int [] array = new int[addedOddlyPlaceNumbers.size()];
        for(int count = 0; count < array.length;count++){
            array[count] = addedOddlyPlaceNumbers.get(count);
        }
        return array;
    }

}
