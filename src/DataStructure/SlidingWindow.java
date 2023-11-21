package DataStructure;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SlidingWindow {
    public static int[] getTheMaxSlidingWindowInKey(int[] number, int key) {
        int  result = 0;
        ArrayList<Integer> numb = arrayToArrayList(number);
        ArrayList <Integer> numbers = new ArrayList<>();
        ArrayList <Integer> maximums = new ArrayList<>();
        for(int count = 0; count < number.length;count++){
            if(numb.size() < key){
                break;
            }
            result = count;
            limitArrayToKeyLength(number, key,numbers, result);
            maximums.add(max(numbers));
            numbers.clear();
            numb.remove(0);
        }
        return convertArrayListToArray(maximums);
    }

    private static void limitArrayToKeyLength(int[] number, int key, ArrayList<Integer> numbers, int result) {
        int counter = 0;
        while(counter != key){
            numbers.add(number[result]);
            result +=1;
            counter++;
        }
    }

    private static ArrayList<Integer> arrayToArrayList(int[] number) {
        ArrayList <Integer> numbers = new ArrayList<>();
        for(int count = 0; count < number.length;count++){
            numbers.add(number[count]);
        }
        return numbers;
    }

    private static int[] convertArrayListToArray(ArrayList<Integer> maximums) {
        int [] numbers = new int [maximums.size()];
        for(int count = 0; count < maximums.size();count++){
            numbers[count] = maximums.get(count);
        }
        return numbers;
    }

    private static Integer max(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for(int count = 1; count < numbers.size(); count++){
            if(numbers.get(count) > max){
                max = numbers.get(count);
            }
        }
        return max;
    }
}
