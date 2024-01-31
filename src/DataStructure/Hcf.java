package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class Hcf {

    public static int[] returnTheHcf(int[] input) {
        List<Integer> returns = new ArrayList<>();
        int  max = maximum(input);
        for(int count = 2; count< max;){
            if(!checkIfNumberCanDivideTheElementsInArray(input,count)){
                count++;
                continue;
            }
            input = returnDividedNumber(input,count);
            returns.add(count);
        }
        return PlusNumbers.convertNumberArray(returns);
    }

    public static boolean checkIfNumberCanDivideTheElementsInArray(int [] input,int number ){
       for(int count = 0; count < input.length;count++) {
           if (input[count] % number != 0) {
               return false;
           }
       }
       return true;
    }
    public  static  int [] returnDividedNumber(int [] input,int number){
        for(int count = 0; count < input.length;count++){
            input [count] = input[count]/number;
        }
        return input;
    }

    private static  int maximum(int [] input){
        int max = input[0];
        for(int count = 1; count <input.length; count++){
            if(input[count]>max){
                max = input[count];
            }
        }
        return max;
    }
}
