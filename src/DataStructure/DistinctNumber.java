package DataStructure;

import java.util.HashSet;

public class DistinctNumber {

    public static int thirdMaximumDistinctNumber(int [] numbers) {
        HashSet <Integer> numb = new HashSet<>();
        for(int count = 0; count < numbers.length;count++){
            numb.add(numbers[count]);
        }
        int [] results = sortNumbers(numb);
        int result = 0;
        if(results.length >= 3){
           result = results[2];
        }
        else{
               result = results[0];
            }
        return result;
    }
    private static int [] returnSetToArray(HashSet <Integer> numbers){
        int [] number = new int [numbers.size()];
        int count = 0;
        for(int numb : numbers){
            number[count] = numb;
            count++;
        }
        return number;
    }

    private static int[] sortNumbers(HashSet <Integer> numbers) {
        int [] number = returnSetToArray(numbers);
        int [] result = new int [numbers.size()];
        int counts = 0;
        for(int count = numbers.size()-1; count >= 0;count--){
            result[counts] =  number[count];
            counts++;

        }
        return result;
    }
}