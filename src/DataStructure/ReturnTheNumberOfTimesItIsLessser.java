package DataStructure;

import java.util.Arrays;

public class ReturnTheNumberOfTimesItIsLessser {

    public static int[] returnsNumberOfTimes(int[] array) {
        int [] temporaryArray = containTheArray(array);
        for(int count = 0; count < array.length; count++){
            int numb = numberOfTimeItLesser(temporaryArray,temporaryArray[count]);
            array[count] = numb;
        }
        return array;
    }
    private static int numberOfTimeItLesser(int [] arrays,int number){
        int numb = 0;
        for(int count = 0; count < arrays.length ; count++){
            if(arrays[count] == number)continue;
            if(number > arrays[count]){
             numb++;
            }
        }
        return numb;
    }
    private static int [] containTheArray(int [] arrays){
        int [] returnArray = new int[arrays.length];
        for(int count = 0; count< returnArray.length;count++){
            returnArray[count] = arrays[count];
        }
       return returnArray;
    }
}
