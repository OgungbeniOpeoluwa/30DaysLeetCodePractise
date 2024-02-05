package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonNumber {

    public static int returnLowestCommonFactor(int[] input, int[] input2) {
        List<Integer> commonNumbers = new ArrayList<>();
        for(int count = 0; count< input.length;count++){
            if(checkApperance(input2,input[count]))commonNumbers.add(input[count]);
        }

        return minimum(commonNumbers);

    }



    private static boolean checkApperance(int [] input2,int inputElement){

        for(int count = 0; count<input2.length;count++){
            if(input2[count] == inputElement)return true;
        }
        return false;

    }
    private static int minimum(List<Integer> input){
        int min = input.get(0);
        for(int count = 1; count < input.size();count++){
            if(input.get(count)<min){
                min = input.get(count);
            }
        }
        return min;
    }
}
