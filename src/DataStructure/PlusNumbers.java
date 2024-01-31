package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class PlusNumbers {

    public static int[] returnSumOfNumbersInArray(int[] input) {
        List<Integer> results;
        if(input.length % 2 == 0)return convertNumberArray(plusArrayNumbersInArray(input.length,input));
        int length = input.length -2;
        results = (plusArrayNumbersInArray(length,input));
        results.add(input[input.length-1]);
        return convertNumberArray(results);
    }


    private static  List<Integer> plusArrayNumbersInArray(int length,int [] input){
        List<Integer> results = new ArrayList<>();
        for (int count = 0; count < length; count += 2) {
            int result = input[count] + input[count + 1];
            results.add(result);
        }
        return results;
    }
    public static int[] convertNumberArray(List<Integer>number){
        int [] array = new int [number.size()];
        for(int count = 0; count < array.length; count++){
            array[count]= number.get(count);
        }
        return array;
    }
}
