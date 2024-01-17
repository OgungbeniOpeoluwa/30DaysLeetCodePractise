package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class SquareAndAscending {

    public static int[] returnArraySquareInAscending(int[] array) {
        List<Integer> arrays = convertIntegerToArray(array);
        int counts = 0;
        while (arrays.size()>0){
            int numb = minimum(arrays);
            array[counts] = numb*numb;
            int counter = indexMinimum(arrays);
            arrays.remove(counter);
            counts++;

        }
        return array;
    }

    private static List<Integer> convertIntegerToArray(int[] array) {
            List<Integer> covertArray = new ArrayList<>();
            for(int count = 0; count < array.length; count++){
                covertArray.add(array[count]);
            }
            return covertArray;
    }

    public static int minimum(List <Integer> number){
        int numb = number.get(0);
        for(int count = 1 ; count < number.size(); count ++){
            if(number.get(count)< numb){
                numb = number.get(count);
            }
        }
        return numb;

    }

    private static int indexMinimum(List <Integer> number){
        int numb = minimum(number);
        int counts = 0;
        for(int count = 1 ; count < number.size(); count ++){
            if(number.get(count) ==  numb){
                counts= count;
            }
        }
        return counts;


    }
}
