package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static int sumTheRangeOfNumbers(int[] array, int target1, int target2) {
        List<Integer> range = returnRangeOfNumber(target1,target2);
        List<Integer> returnValue = new ArrayList<>();
        int counts = 0;
        for(int count = 0; count < range.size();count++){
            int numb = range.get(count);
            while(counts < array.length){
                int numbers = counts+1;
                if(checkIfNumberHasASum(array,array[counts],numb,numbers)){
                    returnValue.add(numb);
                    break;
                }
                counts++;

            }
            counts = 0;
        }
        return sumList(returnValue);
    }
    private static int sumList(List<Integer> numb){
        int sum = 0;
        for(int count = 0; count < numb.size(); count++){
            sum+= numb.get(count);
        }
        return sum;
    }

    private static boolean checkIfNumberHasASum(int [] array, int numb,int target,int index){
        for(int count = index; count < array.length; count++){
            if(numb + array[count] == target)return true;
        }
        return false;

    }
    private static List<Integer> returnRangeOfNumber(int target1, int target2){
        List<Integer> range = new ArrayList<>();
        int count = 0;
        int endNumber = 0;
        if(target1 < target2){
            count = target1;
            endNumber = target2;
        }
        else
        {
            count = target2;
            endNumber = target1;
        }
        for(int counter = count; counter<= endNumber; counter++ ){
            range.add(counter);
        }
        return range;
    }
}
