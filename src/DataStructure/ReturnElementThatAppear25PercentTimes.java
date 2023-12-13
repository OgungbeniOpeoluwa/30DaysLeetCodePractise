package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;

public class ReturnElementThatAppear25PercentTimes {

    public static int returnFunction(int[] input) {
        ArrayList<Integer> maximumTimeItAppears = new ArrayList<>();
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int count = 0; count < input.length;count++){
            int result = countNumberOfTimeItAppears(input[count],input);
            maximumTimeItAppears.add(result);
            map.put(result,input[count]);
        }
        int returns = maximum(maximumTimeItAppears);
        return map.get(returns);
    }
    private static int countNumberOfTimeItAppears(int number, int [] array) {
        int counter = 0;
        for(int count = 0; count < array.length; count++){
            if(number == array[count]){
               counter++;
            }
        }
        return counter;
    }
    private static int maximum(ArrayList <Integer> numbers){
        int max = numbers.get(0);
        for(int count = 1; count < numbers.size(); count++){
            if(numbers.get(count) > max){
                max = numbers.get(count);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int result = 0;
        for(int count = 0; count<456;count++){
            result+=123;
        }
        System.out.println(result);
    }
}
